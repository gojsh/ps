package ps.programmers.다음에_올_숫자;

import java.util.Scanner;

class Solution {
    public int solution(int[] common) {
        int answer = 0;

        if ((common[1] - common[0]) == (common[2] - common[1]))
            answer = common[common.length - 1] + (common[1] - common[0]);
        else
            answer = common[common.length - 1] * (common[1] / common[0]);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] common = new int[n];
        for (int i = 0; i < common.length; i++) {
            common[i] = kb.nextInt();
        }
        System.out.println(s.solution(common));
    }
}
