package ps.programmers.기사단원의_무기;

import java.util.Scanner;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) cnt++;
                else if (i % j == 0) cnt += 2;
            }
            if (cnt > limit) cnt = power;
            answer += cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        int limit = kb.nextInt();
        int power = kb.nextInt();
        System.out.println(s.solution(number, limit, power));
    }
}
