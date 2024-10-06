package ps.inflearn.회문_문자열;

import java.util.Scanner;

class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) answer = "NO";
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) return answer;
        else return answer = "NO";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
        System.out.println(T.solution2(str));
    }
}
