package ps.programmers.겹치는_선분의_길이;

import java.util.Scanner;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[201];

        for (int[] i : lines) {
            int start = i[0] + 100;
            int end = i[1] + 100;

            for (int k = start; k < end; k++) {
                count[k] += 1;
            }
        }

        for (int i : count) {
            if (i > 1) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[][] lines = new int[3][2];
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[i].length; j++) {
                lines[i][j] = kb.nextInt();
            }
        }
        System.out.println(s.solution(lines));
    }
}