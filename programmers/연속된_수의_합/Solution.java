package ps.programmers.연속된_수의_합;

import java.util.Scanner;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int m = total / num;
        int f;

        if (num % 2 == 0) f = m - num / 2 + 1;
        else f = m - num / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = f++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int total = kb.nextInt();
        for (int i : s.solution(num, total)) System.out.print(i + " ");
    }
}