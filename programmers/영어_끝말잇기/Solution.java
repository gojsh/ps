package ps.programmers.영어_끝말잇기;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        ArrayList<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) || equals(list.get(list.size() - 1), words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            list.add(words[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] words = new String[kb.nextInt()];
        for (int i = 0; i < words.length; i++) words[i] = kb.next();
        for (int i : s.solution(n, words)) System.out.println(i);
    }

    public boolean equals(String word1, String word2) {
        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            return false;
        }
        return true;
    }
}
