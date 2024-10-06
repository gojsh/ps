package ps.programmers.머쓱이보다_키_큰_사람;

import java.util.Scanner;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if (i > height) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] array = new int[kb.nextInt()];
        int height = kb.nextInt();
        System.out.println(s.solution(array, height));
    }
}
