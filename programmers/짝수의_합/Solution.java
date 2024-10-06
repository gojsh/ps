package ps.programmers.짝수의_합;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n != 0) {
            if (n % 2 != 1) answer += n;
            n--;
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
