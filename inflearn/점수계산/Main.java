package ps.inflearn.점수계산;

import java.util.Scanner;

class Main {
    public int solution(int[] arr) {
        int answer = 0, cnt = 0;
        for (int j : arr) {
            if (j == 1) {
                cnt++;
                answer += cnt;
            } else cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[kb.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
        System.out.print(T.solution(arr));
    }
}
