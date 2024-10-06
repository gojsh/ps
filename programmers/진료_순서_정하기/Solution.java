package ps.programmers.진료_순서_정하기;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int k : emergency) {
                if (emergency[i] < k) {
                    answer[i]++;
                }
            }
            answer[i]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] emergency = new int[length];

        for (int i = 0; i < emergency.length; i++) {
            emergency[i] = kb.nextInt();
        }

        emergency = s.solution(emergency);

        for (int i : emergency) System.out.println(i);
    }
}
