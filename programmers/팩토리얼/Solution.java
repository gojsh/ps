package ps.programmers.팩토리얼;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            if (n >= fac(i)) {
                answer = i;
            }
        }
        return answer;
    }

    public int fac(int i) {
        if (i == 1) return 1;
        else return i * fac(i - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
