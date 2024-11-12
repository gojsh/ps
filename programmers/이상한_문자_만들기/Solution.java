package ps.programmers.이상한_문자_만들기;

import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(" ")) idx = 0;
            else if (idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
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
