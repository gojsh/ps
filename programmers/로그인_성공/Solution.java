package ps.programmers.로그인_성공;

import java.util.Scanner;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0])) {
                if (id_pw[1].equals(strings[1])) answer = "login";
                else answer = "wrong pw";
            }
        }
        if (answer.isEmpty()) answer = "fail";
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int id_pw_n = kb.nextInt();
        int db_n = kb.nextInt();
        kb.nextLine();
        String[] id_pw = new String[id_pw_n];
        for (int i = 0; i < id_pw_n; i++) id_pw[i] = kb.next();
        String[][] db = new String[db_n][id_pw_n];
        for (int i = 0; i < db_n; i++) {
            for (int j = 0; j < id_pw_n; j++) {
                db[i][j] = kb.next();
            }
        }
        System.out.println(s.solution(id_pw, db));
    }
}
