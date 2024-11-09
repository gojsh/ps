package ps.programmers.수박수박수박수박수박수;

import java.util.Scanner;

class Solution {
    public String solution(int n) {
        String answer = "";
        String s = "수박";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) answer += s.charAt(0);
            else answer += s.charAt(1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}

