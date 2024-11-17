package ps.programmers._2016년;

import java.util.Scanner;

class Solution {
    public String solution(int a, int b) {
        String answer;
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int day = 0;
        for (int i = 0; i < a; i++) day += months[i];
        day += b;
        answer = days[(day + 4) % 7];
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        System.out.println(s.solution(a, b));
    }
}
