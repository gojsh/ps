package ps.programmers.x만큼_간격이_있는_n개의_숫자;

import java.util.Scanner;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num += x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int n = kb.nextInt();
        s.solution(x, n);
        for (long i : s.solution(x, n)) System.out.println(i);
        ;
    }
}
