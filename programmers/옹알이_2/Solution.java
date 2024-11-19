package ps.programmers.옹알이_2;

import java.util.Scanner;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            String s = babbling[i];

            if (babbling[i].contains("ayaaya")
                    || babbling[i].contains("yeye")
                    || babbling[i].contains("woowoo")
                    || babbling[i].contains("mama")) {
                continue;
            }
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");
            if(babbling[i].isEmpty()) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String[] babbling = new String[kb.nextInt()];
        for (int i = 0; i < babbling.length; i++) babbling[i] = kb.next();
        System.out.println(s.solution(babbling));
    }
}
