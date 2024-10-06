package ps.programmers.k의_개수;

import java.util.Scanner;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String sk = Integer.toString(k);
        for (int start = i; start <= j; start++) {
            String[] si = Integer.toString(start).split("");
            for (String v : si) {
                if (v.contains(sk)) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int i = kb.nextInt();
        int j = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(s.solution(i, j, k));
    }
}
