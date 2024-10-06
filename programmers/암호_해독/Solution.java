package ps.programmers.암호_해독;

import java.util.Scanner;

class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] c = cipher.toCharArray();
        for (int i = code - 1; i < c.length; i += code) {
            answer += c[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String cipher = kb.next();
        int code = kb.nextInt();

        System.out.println(s.solution(cipher, code));
    }
}
