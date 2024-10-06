package ps.programmers.가위_바위_보;

import java.util.Scanner;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] c = rsp.toCharArray();
        for (char i : c) {
            if (i == '2') answer += '0';
            else if (i == '0') answer += '5';
            else answer += '2';
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String rsp = kb.next();
        System.out.println(s.solution(rsp));
    }
}
