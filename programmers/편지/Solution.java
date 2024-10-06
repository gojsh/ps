package ps.programmers.편지;

import java.util.Scanner;

class Solution {
    public int solution(String message) {
        int answer;
        answer = message.length() * 2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String message = kb.nextLine();
        System.out.println(s.solution(message));
    }
}
