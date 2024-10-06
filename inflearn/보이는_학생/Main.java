package ps.inflearn.보이는_학생;

import java.util.Scanner;

class Main {
    public int solution(int[] arr) {
        int answer = 0;
        int max = arr[0];
        answer++;
        for (int j : arr) {
            if (j > max) {
                max = j;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[kb.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(arr));
    }
}
