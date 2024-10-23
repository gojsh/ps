package ps.programmers.PCCE_LV1.PCCE_기출문제_10번_공원;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        Arrays.sort(mats);
        for (int i = 0; i < mats.length / 2; i++) {
            int temp = mats[i];
            mats[i] = mats[mats.length - 1 - i];
            mats[mats.length - 1 - i] = temp;
        }
        for (int i : mats) {
            for (int j = 0; j <= park.length - i; j++) {
                for (int h = 0; h <= park[0].length - i; h++) {
                    boolean chk = true;
                    if (park[j][h].equals("-1") && j + i <= park.length && h + i <= park[0].length) {
                        for (int k = 0; k < i; k++) {
                            for (int l = 0; l < i; l++) {
                                if (!park[j + k][h + l].equals("-1")) {
                                    chk = false;
                                    break;
                                }
                            }
                            if (!chk) break;
                        }
                        if (chk) {
                            return i;
                        }
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] mats = new int[n];
        for (int i = 0; i < mats.length; i++) {
            mats[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        String[][] park = new String[m - 2][m];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                park[i][j] = kb.next();
            }
        }
        System.out.println(s.solution(mats, park));
    }
}
