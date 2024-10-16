package ps.programmers.평행;

import java.util.Scanner;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0], y1 = dots[0][1];
        int x2 = dots[1][0], y2 = dots[1][1];
        int x3 = dots[2][0], y3 = dots[2][1];
        int x4 = dots[3][0], y4 = dots[3][1];

        double slope1 = (double) (y2 - y1) / (x2 - x1);
        double slope2 = (double) (y4 - y3) / (x4 - x3);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y3 - y1) / (x3 - x1);
        slope2 = (double) (y2 - y4) / (x2 - x4);
        if (slope1 == slope2) answer = 1;

        slope1 = (double) (y4 - y1) / (x4 - x1);
        slope2 = (double) (y2 - y3) / (x2 - x3);
        if (slope1 == slope2) answer = 1;

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int l = 4;
        int[][] dot = new int[l][l / 2];
        for (int i = 0; i < dot.length; i++) {
            for (int j = 0; j < dot[i].length; j++) {
                dot[i][j] = kb.nextInt();
            }
        }
        System.out.println(s.solution(dot));
    }
}
