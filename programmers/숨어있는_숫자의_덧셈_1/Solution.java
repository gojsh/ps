package ps.programmers.숨어있는_숫자의_덧셈_1;

import java.util.Scanner;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                System.out.println(c);
                answer += (int) c - 48;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_string = kb.next();
        System.out.println(s.solution(my_string));
    }
}
