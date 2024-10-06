package ps.programmers.최댓값_만들기_1;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] numbers) {
        int answer;
        Arrays.sort(numbers);
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) numbers[i] = kb.nextInt();
        System.out.println(s.solution(numbers));
    }
}
