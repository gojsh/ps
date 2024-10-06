package ps.programmers.n의_배수_고르기;

import java.util.Scanner;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int cnt = 0;
        for (int i : numlist) {
            if (i % n == 0) cnt++;
        }

        answer = new int[cnt];

        for (int i = 0, j = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[j] = numlist[i];
                j++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int length = kb.nextInt();
        int[] numlist = new int[length];

        for (int i = 0; i < numlist.length; i++) numlist[i] = kb.nextInt();
        numlist = s.solution(n, numlist);

        for (int i : numlist) System.out.println(i);

    }
}
