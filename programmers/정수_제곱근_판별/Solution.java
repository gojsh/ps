package ps.programmers.정수_제곱근_판별;

import java.util.Scanner;

class Solution {
    public long solution(long n) {
        long answer;
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) answer = (long) Math.pow(sqrt + 1, 2);
        else answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        long n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
