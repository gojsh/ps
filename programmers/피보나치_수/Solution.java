package ps.programmers.피보나치_수;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 2] + arr[i - 1]) % 1234567;
        }
        answer = arr[n] % 1234567;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}

