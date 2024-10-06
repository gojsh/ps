package ps.programmers.짝수는_싫어요;

import java.util.Scanner;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        int pos = 0;

        if (n % 2 == 0) answer = new int[n / 2];
        else answer = new int[(n + 1) / 2];

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                answer[pos] = i;
                pos++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] answer;
        answer = s.solution(n);

        for (int i : answer) System.out.println(i);
    }
}
