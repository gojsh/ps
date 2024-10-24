package ps.programmers.덧칠하기;

import java.util.Scanner;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;
        for (int i : section) {
            if (start + m > i) {
                continue;
            }
            start = i;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int l = kb.nextInt();
        int[] section = new int[l];
        for (int i = 0; i < l; i++) section[i] = kb.nextInt();
        System.out.println(s.solution(n, m, section));
    }
}
