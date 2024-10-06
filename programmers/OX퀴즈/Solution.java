package ps.programmers.OX퀴즈;

import java.util.Scanner;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] s = quiz[i].split(" ");
            if (s[1].equals("+")) {
                if (Integer.parseInt(s[0]) + Integer.parseInt(s[2]) == Integer.parseInt(s[4])) answer[i] = "O";
                else answer[i] = "X";
            } else {
                if (Integer.parseInt(s[0]) - Integer.parseInt(s[2]) == Integer.parseInt(s[4])) answer[i] = "O";
                else answer[i] = "X";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String[] quiz = new String[kb.nextInt()];
        kb.nextLine();

        for (int i = 0; i < quiz.length; i++) {
            quiz[i] = kb.nextLine();
        }

        quiz = s.solution(quiz);

        for (String i : quiz) System.out.println(i);

    }
}
