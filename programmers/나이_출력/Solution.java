package ps.programmers.나이_출력;

import java.util.Scanner;

class Solution {
    public int solution(int age) {
        int answer;
        answer = 2022 - age + 1;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int age = kb.nextInt();
        System.out.println(s.solution(age));
    }
}
