package ps.programmers.짝수와_홀수;

import java.util.Scanner;

class Solution {
    public String solution(int num) {
        String answer;
        if (num % 2 == 0) answer = "Even";
        else answer = "Odd";
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(s.solution(num));
    }
}
