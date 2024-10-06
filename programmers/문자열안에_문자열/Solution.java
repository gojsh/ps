package ps.programmers.문자열안에_문자열;

import java.util.Scanner;

class Solution {
    public int solution(String str1, String str2) {
        int answer;
        if (str1.contains(str2)) answer = 1;
        else answer = 2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(s.solution(str1, str2));
    }
}
