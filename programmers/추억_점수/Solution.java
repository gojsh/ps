package ps.programmers.추억_점수;

import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            hm.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            int score = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (hm.containsKey(photo[i][j])) {
                    score += hm.get(photo[i][j]);
                }
            }
            answer[i] = score;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] name = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = kb.next();
            System.out.println(name[i]);
        }
        int[] yearning = new int[n];
        for (int i = 0; i < n; i++) {
            yearning[i] = kb.nextInt();
            System.out.println(yearning[i]);
        }
        int row = kb.nextInt();
        int col = kb.nextInt();
        String[][] photo = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                photo[i][j] = kb.next();
            }
        }
        for (int i : s.solution(name, yearning, photo)) System.out.print(i + " ");
    }
}
