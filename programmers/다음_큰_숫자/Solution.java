package ps.programmers.다음_큰_숫자;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int cnt = Integer.bitCount(n);
        while (cnt != Integer.bitCount(answer)) {
            answer++;
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
