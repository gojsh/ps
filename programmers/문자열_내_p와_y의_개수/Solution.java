package ps.programmers.문자열_내_p와_y의_개수;

import java.util.Scanner;

class Solution {
    boolean solution(String s) {
        boolean answer;
        int pc = 0;
        int yc = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') pc++;
            else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') yc++;
        }
        if (pc != yc) answer = false;
        else answer = true;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
