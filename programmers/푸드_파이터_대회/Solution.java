package ps.programmers.푸드_파이터_대회;

import java.util.Scanner;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            sb.append(String.valueOf(i).repeat(cnt));
        }
        String answer = sb + "0";
        answer += sb.reverse();
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
