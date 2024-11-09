package ps.programmers.약수의_개수와_덧셈;

import java.util.Scanner;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int left = kb.nextInt();
        int right = kb.nextInt();
        System.out.println(s.solution(left, right));
    }
}
