package ps.programmers.K번째수;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) array[i] = kb.nextInt();
        int row = kb.nextInt();
        int col = kb.nextInt();
        int[][] commands = new int[row][col];
        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < commands[i].length; j++) {
                commands[i][j] = kb.nextInt();
            }
        }
        for (int i : s.solution(array, commands)) System.out.println(i);
    }
}
