package ps.programmers.점의_위치_구하기;

import java.util.Scanner;

class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        if (dot[0] >= 0 && dot[1] >= 0) answer = 1;
        if (dot[0] < 0 && dot[1] >= 0) answer = 2;
        if (dot[0] < 0 && dot[1] < 0) answer = 3;
        if (dot[0] >= 0 && dot[1] < 0) answer = 4;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        int[] dot = new int[]{x, y};
        System.out.println(s.solution(dot));
    }
}
