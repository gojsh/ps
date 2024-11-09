package ps.programmers.가운데_글자_가져오기;

import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length() / 2;
        if (s.length() % 2 == 0) { //짝수
            for (int i = l - 1; i <= l; i++) answer += s.charAt(i);
        } else answer += s.charAt(l);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
