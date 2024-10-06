package ps.programmers.짝수_홀수_개수;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        int even = 0, odd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) even++;
            else odd++;
        }

        return answer = new int[]{even, odd};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] arr = new int[length];
        int[] answer;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = kb.nextInt();
        }

        answer = s.solution(arr);

        for (int i : answer) System.out.println(i);
    }
}
