package ps.programmers.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public long solution(long n) {
        long answer;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        String s = "";
        for (String i : str) s += i;
        answer = Long.parseLong(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        long n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
