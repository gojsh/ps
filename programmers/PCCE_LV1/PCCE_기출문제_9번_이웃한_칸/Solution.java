package ps.programmers.PCCE_LV1.PCCE_기출문제_9번_이웃한_칸;

import java.util.Scanner;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        String color = board[h][w];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == h && j == w) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && ny >= 0 && nx < board.length && ny < board[i].length) {
                            if (board[nx][ny].equals(color)) answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[][] board = new String[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = kb.next();
            }
        }
        int h = kb.nextInt();
        int w = kb.nextInt();
        System.out.println(s.solution(board, h, w));
    }
}