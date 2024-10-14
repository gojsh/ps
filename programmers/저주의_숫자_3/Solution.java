package ps.programmers.저주의_숫자_3;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            do {
                answer++;
            } while (answer % 3 == 0 || Integer.toString(answer).contains("3"));
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
