package ps.programmers.삼각형의_완성조건_1;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) answer = 1;
        else answer = 2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] sides = new int[3];

        for (int i = 0; i < sides.length; i++) {
            sides[i] = kb.nextInt();
        }

        System.out.println(s.solution(sides));
    }
}
