package ps.programmers.시저_암호;

import java.util.Scanner;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch == ' ') {
                answer += ch;
                continue;
            }
            if (ch >= 'a' && ch <= 'z') {
                if (ch + n > 'z') answer += (char) (ch - 26 + n);
                else answer += (char) (ch + n);
            } else {
                if (ch + n > 'Z')
                    answer += (char) (ch - 26 + n);
                else answer += (char) (ch + n);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        int n = kb.nextInt();
        System.out.println(s.solution(str, n));
    }
}

