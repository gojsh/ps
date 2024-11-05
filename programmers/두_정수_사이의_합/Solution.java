package ps.programmers.두_정수_사이의_합;

import java.util.Scanner;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = Math.max(a, b);
        long min = Math.min(a, b);
        for (long i = min; i <= max; i++) {
            answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(s.solution(a, b));
    }
}
