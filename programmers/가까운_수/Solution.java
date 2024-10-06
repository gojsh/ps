package ps.programmers.가까운_수;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] array, int n) {
        int answer;
        Arrays.sort(array);
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[0]) > Math.abs(n - array[i])) {
                array[0] = array[i];
            }
        }
        answer = array[0];
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int n = kb.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = kb.nextInt();
        }

        System.out.println(s.solution(array, n));
    }
}
