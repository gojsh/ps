package ps.programmers.카드_뭉치;

import java.util.Scanner;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        int pt1 = 0;
        int pt2 = 0;

        for (String str : goal) {
            if (pt1 < cards1.length && str.equals(cards1[pt1])) pt1++;
            else if (pt2 < cards2.length && str.equals(cards2[pt2])) pt2++;
            else return answer;
        }
        answer = "Yes";
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int k = kb.nextInt();
        String[] cards1 = new String[n];
        for (int i = 0; i < cards1.length; i++) cards1[i] = kb.next();
        String[] cards2 = new String[m];
        for (int i = 0; i < cards2.length; i++) cards2[i] = kb.next();
        String[] goal = new String[k];
        for (int i = 0; i < goal.length; i++) goal[i] = kb.next();
        System.out.println(s.solution(cards1, cards2, goal));
    }
}

