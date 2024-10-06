package ps.programmers.최댓값_만들기_2;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] numbers) {
        int answer;
        Arrays.sort(numbers);
        int left = numbers[0] * numbers[1];
        int right = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        answer = Math.max(right, left);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] numbers = new int[kb.nextInt()];
        for (int i = 0; i < numbers.length; i++) numbers[i] = kb.nextInt();
        System.out.println(s.solution(numbers));
    }
}
