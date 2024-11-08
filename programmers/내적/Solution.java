package ps.programmers.내적;

import java.util.Scanner;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = kb.nextInt();
        for (int i = 0; i < n; i++) b[i] = kb.nextInt();
        System.out.println(s.solution(a, b));
    }
}
