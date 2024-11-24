package ps.programmers.JadenCase_문자열_만들기;

import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) str[i] = str[i].toLowerCase();

        for (String i : str) {
            if (i.isEmpty()) answer += " ";
            else {
                char[] c_array = i.toCharArray();
                if (Character.isAlphabetic(c_array[0])) c_array[0] = Character.toUpperCase(c_array[0]);
                for (char j : c_array) {
                    answer += j;
                }
                answer += ' ';
            }
        }

        if (s.substring(s.length() - 1, s.length()).equals(" ")) {
            return answer;
        }

        answer = answer.substring(0, answer.length() - 1);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(s.solution(str));
    }
}
