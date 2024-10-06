package ps.programmers.문자_반복_출력하기;

import java.util.Scanner;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        int n = kb.nextInt();
        str = s.solution(str, n);
        System.out.println(str);
    }
}
