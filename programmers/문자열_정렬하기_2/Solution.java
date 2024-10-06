package ps.programmers.문자열_정렬하기_2;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        String[] s = my_string.split("");
        Arrays.sort(s);
        for (String i : s) answer += i;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_string = kb.next();
        System.out.println(s.solution(my_string));
    }
}
