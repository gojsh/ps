package ps.programmers.이진수_더하기;

import java.util.Scanner;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        answer = Integer.toBinaryString(num);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String bin1 = kb.next();
        String bin2 = kb.next();
        System.out.println(s.solution(bin1, bin2));
    }
}