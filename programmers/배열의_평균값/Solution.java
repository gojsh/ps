package ps.programmers.배열의_평균값;

import java.util.Scanner;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int i : numbers) answer += i;
        return answer / numbers.length;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(s.solution(arr));
    }
}

