package ps.programmers.푸드_파이터_대회;

import java.util.Scanner;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        String str = "";
        for (int i = 1; i < food.length; i++) {
            int cnt = 0;
            cnt = food[i]/2;
            for(int j = 0; j<cnt; j++)
                str += String.valueOf(i);
        }
        answer += str + "0";
        StringBuilder sb = new StringBuilder(str);
        String reverseStr = sb.reverse().toString();
        answer += reverseStr;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] food = new int[n];
        for (int i = 0; i < food.length; i++) food[i] = kb.nextInt();
        System.out.println(s.solution(food));
    }
}
