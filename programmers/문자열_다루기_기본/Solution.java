package ps.programmers.문자열_다루기_기본;

import java.util.Scanner;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
            return answer;
        }
        for (char c : s.toCharArray()) {
            System.out.println(c);
            if (Character.isAlphabetic(c)) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
