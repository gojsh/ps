package ps.programmers.최소직사각형;

import java.util.Scanner;

class Solution {
    public int solution(int[][] sizes) {
        int answer;
        int max_w = 0;
        int max_l = 0;
        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int l = Math.min(size[0], size[1]);
            max_w = Math.max(max_w, w);
            max_l = Math.max(max_l, l);
        }
        answer = max_w * max_l;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] sizes = new int[n][2];
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                sizes[i][j] = kb.nextInt();
            }
        }
        System.out.println(s.solution(sizes));
    }
}