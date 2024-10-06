package ps.programmers.분수의_덧셈;

import java.util.Scanner;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int gcd = gcd(numer, denom);
        int[] answer;

        numer = numer / gcd;
        denom = denom / gcd;

        answer = new int[]{numer, denom};

        return answer;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] answer;

        int numer1 = kb.nextInt();
        int denom1 = kb.nextInt();
        int numer2 = kb.nextInt();
        int denom2 = kb.nextInt();

        answer = s.solution(numer1, denom1, numer2, denom2);

        for (int i : answer) System.out.println(i);
    }
}
