package ps.programmers.모스부호_1;

import java.util.Scanner;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] word = letter.split(" ");

        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (word[i].equals(morse[j])) answer += (char) (j + 97);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String letter = kb.next();
        System.out.println(s.solution(letter));
    }
}
