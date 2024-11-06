package ps.programmers.음양_더하기;

import java.util.Scanner;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];
        for (int i = 0; i < absolutes.length; i++) absolutes[i] = kb.nextInt();
        for (int i = 0; i < signs.length; i++) signs[i] = Boolean.parseBoolean(kb.next());
        System.out.println(s.solution(absolutes, signs));
    }
}
