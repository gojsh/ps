package ps.programmers.중복된_문자_제거;

import java.util.Scanner;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(s.solution(str));
    }
}
