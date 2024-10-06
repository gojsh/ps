package ps.programmers._369게임;

import java.util.Scanner;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        char[] c = {'3', '6', '9'};

        for (char i : str.toCharArray()) {
            for (char j : c) {
                if (i == j) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int order = kb.nextInt();
        System.out.println(s.solution(order));
    }
}
