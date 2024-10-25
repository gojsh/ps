package ps.programmers.콜라_문제;

import java.util.Scanner;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
            System.out.println(n);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int n = kb.nextInt();
        System.out.println(s.solution(a, b, n));
    }
}
