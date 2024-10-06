package ps.programmers.양꼬치;

import java.util.Scanner;

class Solution {
    public int solution(int n, int k) {
        int answer;
        int sv = (n * 12000) / (12000 * 10);
        if (sv != 0) answer = n * 12000 + k * 2000 - (sv * 2000);
        else answer = n * 12000 + k * 2000;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(s.solution(n, k));
    }
}
