package ps.inflearn.숫자만_추출;

import java.util.Scanner;

class Main {
    public int solution (String s) {
        int answer;
        s = s.replaceAll("[A-Za-z]","");
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
