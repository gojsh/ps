package ps.programmers.자연수_뒤집어_배열로_만들기;

import java.util.Scanner;

class Solution {
    public int[] solution(long n) {
        int[] answer;
        String s = Long.toString(n);
        int pos = s.length() - 1;
        answer = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            answer[i] = s.charAt(pos) - 48;
            pos--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        long n = kb.nextInt();
        for (int i : s.solution(n)) System.out.println(i);
    }
}
