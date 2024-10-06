package ps.programmers.제곱수_판별하기;

import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer;
        if (Math.sqrt(n)%1 == 0) answer = 1;
        else answer = 2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(s.solution(n));
    }
}
