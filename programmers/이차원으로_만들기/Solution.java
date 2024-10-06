package ps.programmers.이차원으로_만들기;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int pos = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[pos];
                pos += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int n = kb.nextInt();
        int[] num_list = new int[length];
        int[][] answer;

        for (int i = 0; i < num_list.length; i++)
            num_list[i] = kb.nextInt();

        answer = s.solution(num_list, n);

        for (int[] i : answer) System.out.println(Arrays.toString(i));
    }
}
