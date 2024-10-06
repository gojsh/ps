package ps.programmers.직사각형_넓이_구하기;

import java.util.Scanner;

class Solution {
    public int solution(int[][] dots) {
        int answer;
        int w = 0;
        int h = 0;
        int x = dots[0][0];
        int y = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) w = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) h = Math.abs(y - dots[i][1]);
        }
        answer = w * h;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[][] dots = new int[4][2];

        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[i].length; j++) {
                dots[i][j] = kb.nextInt();
            }
        }
        s.solution(dots);
        System.out.println(s.solution(dots));
    }
}
