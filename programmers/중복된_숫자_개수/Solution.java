package ps.programmers.중복된_숫자_개수;

import java.util.Scanner;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] array = new int[kb.nextInt()];
        int n = kb.nextInt();
        for (int i = 0; i < array.length; i++) array[i] = kb.nextInt();
        System.out.println(s.solution(array, n));
    }
}