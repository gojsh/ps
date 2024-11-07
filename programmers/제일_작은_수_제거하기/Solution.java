package ps.programmers.제일_작은_수_제거하기;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            //min = Math.min(min, arr[i]);
        }

        int[] answer = new int[arr.length - 1];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) continue;
            else answer[cnt++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
        for (int i : s.solution(arr)) System.out.println(i);
    }
}
