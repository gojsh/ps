package ps.programmers.피자_나눠_먹기1;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer;
        if (n <= 7) answer = 1;
        else answer = (n / 7) + 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
