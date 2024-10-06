package ps.programmers.세균_증식;

import java.util.Scanner;

class Solution {
    public int solution(int n, int t) {
        int answer;
        for (int i = 1; i <= t; i++) {
            n *= 2;
        }
        answer = n;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int t = kb.nextInt();
        System.out.println(s.solution(n, t));
    }
}
