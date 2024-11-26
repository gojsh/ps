package ps.programmers.최솟값_만들기;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) A[i] = kb.nextInt();
        for (int i = 0; i < n; i++) B[i] = kb.nextInt();
        System.out.println(s.solution(A, B));
    }
}
