package ps.programmers.외계어_사전;

import java.util.Scanner;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int index;
        for (String s : dic) {
            index = 0;
            for (String string : spell) {
                if (s.contains(string)) index++;
                if (index == spell.length) {
                    answer = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int sl = kb.nextInt();
        int dl = kb.nextInt();
        String[] spell = new String[sl];
        String[] dic = new String[dl];
        System.out.println(s.solution(spell, dic));
    }
}
