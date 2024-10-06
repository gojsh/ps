package ps.programmers.숫자_찾기;

import java.util.Scanner;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String[] s = Integer.toString(num).split("");

        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(Integer.toString(k))) {
                answer = i + 1;
                break;
            } else answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(s.solution(num, k));
    }
}