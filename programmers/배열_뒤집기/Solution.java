package ps.programmers.배열_뒤집기;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = num_list.length - 1, pos = 0; i >= 0; i--, pos++) {
            answer[pos] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        arr = s.solution(arr);

        for (int i : arr) System.out.println(i);
    }
}
