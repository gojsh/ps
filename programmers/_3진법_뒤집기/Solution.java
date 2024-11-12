package ps.programmers._3진법_뒤집기;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        while (n != 0) {
            s += n % 3;
            n /= 3;
        }
        answer = Integer.parseInt(s, 3);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
