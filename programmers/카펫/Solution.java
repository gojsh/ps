package ps.programmers.카펫;

import java.util.Scanner;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet = brown + yellow;
        for (int i = 3; i < carpet; i++) {
            int row = carpet / i;
            if (row < 3) continue;
            if (row >= i) {
                if ((row - 2) * (i - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int brown = kb.nextInt();
        int yellow = kb.nextInt();
        for (int i : s.solution(brown, yellow)) System.out.println(i);
    }
}
