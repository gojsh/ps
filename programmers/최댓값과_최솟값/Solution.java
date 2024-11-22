package ps.programmers.최댓값과_최솟값;

import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String s1 : str) {
            int num = Integer.parseInt(s1);
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        answer = min + " " + max;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(s.solution(str));
    }
}

