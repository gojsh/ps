package ps.inflearn.가장_짧은_문자거리;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        ArrayList<Integer> pos = new ArrayList<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == t) {
                pos.add(i);
            }
        }

        int[] tmp = new int[pos.size()];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < pos.size(); j++) {
                tmp[j] = Math.abs(pos.get(j) - i);
            }

            int min = tmp[0];

            for (int k : tmp) {
                if (min > k) min = k;
                answer[i] = min;
            }
        }
        return answer;
    }

    public int[] solution2(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char n = kb.next().charAt(0);
        for (int i : T.solution(s, n)) System.out.print(i + " ");
        for (int i : T.solution2(s, n)) System.out.print(i + " ");
    }
}
