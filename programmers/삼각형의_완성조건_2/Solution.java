package ps.programmers.삼각형의_완성조건_2;

import java.util.Scanner;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        answer += max + min;
        answer -= max - min;

        return answer - 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] sides = new int[2];
        for (int i = 0; i < sides.length; i++) {
            sides[i] = kb.nextInt();
        }
        System.out.println(s.solution(sides));
    }
}