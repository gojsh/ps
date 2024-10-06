package ps.inflearn.등수구하기;

import java.util.Scanner;

class Main {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int cnt = 1;
            for (int j : arr) {
                if (max < j) {
                    cnt++;
                } else if (max == j) {
                    answer[i] = cnt;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}