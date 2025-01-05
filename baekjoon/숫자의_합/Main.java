package ps.baekjoon.숫자의_합;

import java.util.Scanner;

class Main {
    public int solution(int num, String str) {
        int answer = 0;
        for (int i = 0; i < num; i++) {
            answer += str.charAt(i) - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(num, str));
    }
}

