package ps.programmers.이진_변환_반복하기;

import java.util.Scanner;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int convert = 0;
        int cnt = 0;
        int l = 0;
        while(!s.equals("1")) {
            convert++;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '0') cnt++;
                else l++;
            }
            s = Integer.toBinaryString(l);
        }
        answer[0] = convert;
        answer[1] = cnt;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        for(int i : s.solution(str)) System.out.print(i);
    }
}
