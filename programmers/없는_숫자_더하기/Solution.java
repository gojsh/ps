package ps.programmers.없는_숫자_더하기;

import java.util.Scanner;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] arr = {false, false, false, false, false, false, false, false, false, false};
        for (int check : numbers) {
            if (!arr[check]) arr[check] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) numbers[i] = kb.nextInt();
        System.out.println(s.solution(numbers));
    }
}
