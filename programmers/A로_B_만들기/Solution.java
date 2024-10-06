package ps.programmers.A로_B_만들기;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] bs = before.split("");
        String[] as = after.split("");
        Arrays.sort(bs);
        Arrays.sort(as);

        if (Arrays.equals(as, bs)) answer = 1;

        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String before = kb.next();
        String after = kb.next();
        System.out.println(s.solution(before, after));
    }
}
