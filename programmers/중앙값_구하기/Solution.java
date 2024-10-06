package ps.programmers.중앙값_구하기;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] array) {
        int answer;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int answer;
        int length = kb.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        answer = s.solution(arr);

        System.out.println(answer);
    }
}

