package ps.programmers.문자열을_정수로_바꾸기;

import java.util.Scanner;

class Solution {
    public int solution(String s) {
        int answer;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
