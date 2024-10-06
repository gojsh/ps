package ps.programmers.두_수의_곱;

import java.util.Scanner;

class Solution {
    public int solution(int num1, int num2) {
        int answer;
        answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        System.out.println(s.solution(num1, num2));
    }
}
