package ps.inflearn.가위_바위_보;

import java.util.Scanner;

class Main {
    public String solution(int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else if (a[i] == b[i]) answer += "D";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < a.length; i++) a[i] = kb.nextInt();
        for (int i = 0; i < b.length; i++) b[i] = kb.nextInt();
        for (char x : T.solution(n, a, b).toCharArray()) System.out.println(x);
    }
}
