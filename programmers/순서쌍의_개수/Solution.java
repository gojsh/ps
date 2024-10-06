package ps.programmers.순서쌍의_개수;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 1; i < n; i++) {
            if(n%i == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
