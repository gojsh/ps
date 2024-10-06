package ps.inflearn.격자판_최대합;

import java.util.Scanner;

class Main {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int row, col;
        for (int i = 0; i < n; i++) {
            row = col = 0;
            for (int j = 0; j < n; j++) {
                row += arr[i][j];
                col += arr[j][i];
            }
            answer = Math.max(answer, row);
            answer = Math.max(answer, col);
        }
        row = col = 0;
        for (int i = 0; i < n; i++) {
            row += arr[i][i];
            col += arr[i][n - i - 1];
        }
        answer = Math.max(answer, row);
        answer = Math.max(answer, col);
        return answer;
    }

    public int solution2(int n, int[][] arr) {
        int answer;
        int[] rowArr = new int[n];
        int[] colArr = new int[n];
        int dia = 0;

        int Rmax = rowArr[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowArr[i] += arr[i][j];
                if (Rmax < rowArr[i]) Rmax = rowArr[i];
            }
        }

        int Cmax = colArr[0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                colArr[i] += arr[j][i];
                if (Cmax < colArr[i]) Cmax = colArr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) dia += arr[i][j];
            }
        }

        int tmp = Math.max(Rmax, Cmax);
        answer = Math.max(tmp, dia);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
        System.out.println(T.solution2(n, arr));
    }
}
