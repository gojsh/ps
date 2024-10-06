package ps.programmers.숫자_비교하기;

import java.util.Scanner;

class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) answer++;
        else answer--;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        System.out.println(s.solution(num1, num2));
    }
}
