package ps.programmers.공_던지기;

import java.util.Scanner;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;

        while (k != 0) {
            if (i < numbers.length) {
                answer = numbers[i];
                i += 2;
                k--;
            } else {
                i = i % numbers.length;
                answer = numbers[i];
                i += 2;
                k--;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int k = kb.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) numbers[i] = kb.nextInt();

        System.out.println(s.solution(numbers, k));
    }
}