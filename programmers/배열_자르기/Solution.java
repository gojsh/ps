package ps.programmers.배열_자르기;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1, pos = 0; i < num2+1; i++) {
            answer[pos] += numbers[i];
            pos++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] numbers = new int[length];
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int[] answer;

        for(int i=0; i<numbers.length; i++) numbers[i] = kb.nextInt();

        answer = s.solution(numbers, num1, num2);

        for(int i : answer) System.out.println(i);
    }
}
