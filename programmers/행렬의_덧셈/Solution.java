package ps.programmers.행렬의_덧셈;

import java.util.Scanner;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int row = kb.nextInt();
        int col = kb.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr1[i][j] = kb.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2[i][j] = kb.nextInt();
            }
        }

        for (int[] i : s.solution(arr1, arr2)) {
            for (int j : i) System.out.println(j);
        }
    }
}
