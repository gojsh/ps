package ps.programmers.명예의_전당_1;

import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            if (rank.size() > k) {
                rank.remove(Collections.min(rank));
            }
            answer[i] = Collections.min(rank);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < score.length; i++) score[i] = kb.nextInt();
        int k = kb.nextInt();
        for (int i : s.solution(k, score)) System.out.println(i);
    }
}
