package ps.programmers.N개의_최소공배수;

import java.util.Scanner;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int g = gcd(answer, arr[i]);
            answer = answer * arr[i] / g;
        }
        return answer;
    }

    public int gcd(int a, int b) {
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[kb.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
        System.out.println(s.solution(arr));
    }
}