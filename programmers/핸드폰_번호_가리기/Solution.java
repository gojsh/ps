package ps.programmers.핸드폰_번호_가리기;

import java.util.Scanner;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String s = phone_number.substring(0, phone_number.length() - 4);
        for (int i = 0; i < s.length(); i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String phone_number = kb.next();
        System.out.println(s.solution(phone_number));
    }
}
