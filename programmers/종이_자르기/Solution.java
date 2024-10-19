package ps.programmers.종이_자르기;

import java.util.Scanner;

class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        answer = (M * N) - 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int M = kb.nextInt();
        int N = kb.nextInt();
        System.out.println(s.solution(M, N));
    }
}
