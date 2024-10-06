package ps.programmers.두_수의_나눗셈;

import java.util.Scanner;


class Solution {
    public int solution(int num1, int num2) {
        double answer;
        answer = (double) num1 / num2 * 1000;
        return (int) answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();

        System.out.println("s.solution = " + s.solution(num1, num2));
    }
}
