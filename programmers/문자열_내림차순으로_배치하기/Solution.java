package ps.programmers.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String i : str) answer += i;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}