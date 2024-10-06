package ps.programmers.외계행성의_나이;

import java.util.Scanner;

class Solution {
    public String solution(int age) {
        String answer = "";
        String tmp = Integer.toString(age);
        for (int i = 0; i < tmp.length(); i++) {
            answer += (char) (tmp.charAt(i) + 49);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();
        System.out.println(s.solution(age));
    }
}
