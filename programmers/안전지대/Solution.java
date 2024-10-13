package ps.programmers.안전지대;

public class Solution {
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public int solution(int[][] board) {
        int answer = 0;
        int size = board.length;
        int[][] check = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 1) {
                    checkBomb(i, j, check, size);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (check[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private void checkBomb(int y, int x, int[][] check, int size) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (ny >= 0 && ny < size && nx >= 0 && nx < size) {
                check[nx][ny] = 1;
            }
        }
        check[x][y] = 1;
    }
}
