package ps.programmers.각도기;

import java.util.Scanner;

class Solution {
    public int solution(int angle) {
        int answer;
        if (angle == 180) {
            answer = 4;
            return answer;
        } else if (angle > 90) {
            answer = 3;
            return answer;
        } else if (angle == 90) {
            answer = 2;
            return answer;
        } else {
            answer = 1;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int angle = kb.nextInt();

        System.out.println(s.solution(angle));
    }
}
