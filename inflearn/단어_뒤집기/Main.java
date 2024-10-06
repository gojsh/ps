package ps.inflearn.단어_뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public ArrayList<String> solution2(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] c = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(c);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : T.solution(str)) System.out.println(x);
        for (String x : T.solution2(str)) System.out.println(x);
    }
}
