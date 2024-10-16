package ps.programmers.유한소수_판별하기;

import java.util.Scanner;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int rb = b / gcd(a, b);
        while (rb != 1) {
            if (rb % 2 == 0) rb /= 2;
            else if (rb % 5 == 0) rb /= 5;
            else return 2;
        }
        return answer;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(s.solution(a, b));
    }
}
