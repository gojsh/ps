package ps.inflearn.특정_문자_뒤집기;

import java.util.Scanner;

class Main {
    public String solution(String s) {
        String answer;
        char[] c = s.toCharArray();
        int lt = 0;
        int rt = c.length - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(c[lt])) lt++;
            else if (!Character.isAlphabetic(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
