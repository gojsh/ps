package ps.programmers.PCCE_기출문제_5번_심폐소생술;

import java.util.Scanner;

class Solution {
    public int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for (int i = 0; i < cpr.length; i++) {
            for (int j = 0; j < basic_order.length; j++) {
                if (cpr[i].equals(basic_order[j])) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] cpr = new String[n];
        for (int i = 0; i < n; i++) {
            cpr[i] = kb.next();
        }
        for (int i : s.solution(cpr)) System.out.print(i + " ");
    }
}

