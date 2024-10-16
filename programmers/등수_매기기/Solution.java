package ps.programmers.등수_매기기;

import java.util.Scanner;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length];


        for (int i = 0; i < score.length; i++) {
            avg[i] = (double) (score[i][0] + score[i][1]) / 2;
        }

        for (int i = 0; i < avg.length; i++) {
            double max = avg[i];
            int rank = 1;
            for (int j = 0; j < avg.length; j++) {
                if (avg[j] > max) rank++;
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int row = kb.nextInt();
        int col = kb.nextInt();
        int[][] score = new int[row][col];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = kb.nextInt();
            }
        }
        for (int i : s.solution(score)) System.out.print(i + " ");
    }
}
