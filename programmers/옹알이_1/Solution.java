package ps.programmers.옹알이_1;

import java.util.Scanner;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (int i = 0; i < babbling.length; i++) {
            String tmp = babbling[i];
            String[] word = {"aya", "ye", "woo", "ma"};
            for (String w : word) {
                tmp = tmp.replace(w, " ");
            }
            tmp = tmp.replace(" ", "");
            if (tmp.equals("")) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] babbling = new String[n];

        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = kb.next();
        }
        System.out.println(s.solution(babbling));
    }
}
