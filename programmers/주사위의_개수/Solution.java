package ps.programmers.주사위의_개수;

import java.util.Scanner;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        for (int i = 0; i < box.length; i++)
            answer *= box[i] / n;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] box = new int[length];
        int n = kb.nextInt();
        for (int i = 0; i < box.length; i++) box[i] = kb.nextInt();
        System.out.println(s.solution(box, n));
    }
}