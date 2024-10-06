package ps.programmers.피자_나눠_먹기2;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 1;
        while (answer * 6 % n != 0) answer += 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
