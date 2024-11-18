package ps.programmers.과일_장수;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i = score.length; i >= m; i -= m) {
            answer += score[i - m] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int k = kb.nextInt();
        int m = kb.nextInt();
        int[] score = new int[kb.nextInt()];
        for (int i = 0; i < score.length; i++) score[i] = kb.nextInt();
        System.out.println(s.solution(k, m, score));
    }
}
