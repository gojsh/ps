package ps.programmers.합성수_찾기;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            int cnt = 0;
            for (int j = i; j > 0; j--) {
                if (i % j == 0) cnt++;
                if (cnt == 3) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
