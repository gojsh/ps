package ps.programmers.최대공약수와_최소공배수;

import java.util.Scanner;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }

    public int gcd (int n, int m) {
        if (m == 0) return n;
        return gcd(m, n%m);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        for(int i : s.solution(n, m)) System.out.println(i);
    }
}
