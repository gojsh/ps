package ps.programmers.가장_가까운_같은_글자;

import java.util.Scanner;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;
                    break;
                }
            }
            if (answer[i] == 0) answer[i] = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        for (int i : sol.solution(s)) System.out.println(i);
    }
}
