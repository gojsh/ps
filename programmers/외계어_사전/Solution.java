package ps.programmers.외계어_사전;

import java.util.Scanner;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int index;
        for (int i = 0; i < dic.length; i++) {
            index = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) index++;
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
