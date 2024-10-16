package ps.programmers.특이한_정렬;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);

        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(numlist[i] - n) <= Math.abs(numlist[j] - n)) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        return numlist;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int l = kb.nextInt();
        int[] numlist = new int[l];
        for (int i = 0; i < numlist.length; i++) numlist[i] = kb.nextInt();
        int n = kb.nextInt();
        for (int i : s.solution(numlist, n)) System.out.println(i);
    }
}
