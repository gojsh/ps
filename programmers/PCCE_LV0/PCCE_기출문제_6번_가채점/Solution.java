package ps.programmers.PCCE_LV0.PCCE_기출문제_6번_가채점;

import java.util.Scanner;

class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) numbers[i] = kb.nextInt();
        int[] our_score = new int[n];
        for (int i = 0; i < our_score.length; i++) our_score[i] = kb.nextInt();
        int k = kb.nextInt();
        int[] score_list = new int[k];
        for (int i = 0; i < score_list.length; i++) score_list[i] = kb.nextInt();

        for (String i : s.solution(numbers, our_score, score_list)) System.out.print(i);
    }
}

