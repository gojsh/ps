package ps.programmers.최빈값_구하기;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int max = array[array.length - 1];
        int[] cnt = new int[max + 1];

        for (int i : array) cnt[i]++;

        int top = cnt[0];

        for (int i = 1; i < cnt.length; i++) {
            if (top < cnt[i]) {
                top = cnt[i];
                answer = i;
            } else if (top == cnt[i]) {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] arr = new int[length];
        int answer;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        answer = s.solution(arr);

        System.out.println(answer);
    }
}
