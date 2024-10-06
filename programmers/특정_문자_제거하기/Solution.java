package ps.programmers.특정_문자_제거하기;

import java.util.Scanner;

class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) != letter.charAt(0)) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String my_string = kb.next();
        String letter = kb.next();
        System.out.println(s.solution(my_string, letter));
    }
}
