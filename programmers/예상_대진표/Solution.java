package ps.programmers.예상_대진표;

import java.util.Scanner;

class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        while (a != b) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        int A = kb.nextInt();
        int B = kb.nextInt();
        System.out.println(s.solution(N, A, B));
    }
}