package ps.programmers.나누어_떨어지는_숫자_배열;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int l = 0;
        int pos = 0;

        for (int j : arr) {
            if (j % divisor == 0) l++;
        }

        if (l == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[l];

        for (int i : arr) {
            if (i % divisor == 0) {
                answer[pos] = i;
                pos++;
            }
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
        int divisor = kb.nextInt();
        for (int i : s.solution(arr, divisor)) System.out.println(i);
    }
}
