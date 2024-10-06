package ps.programmers.나머지_구하기;

import java.util.Scanner;

class Solution {
    public int solution(int num1, int num2) {
        int answer;
        answer = num1 % num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        int answer;

        answer = s.solution(num1, num2);

        System.out.println(answer);
    }
}
