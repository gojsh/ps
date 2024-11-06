package ps.programmers.콜라츠_추측;

import java.util.Scanner;

class Solution {
    int answer = 0;

    public int solution(int num) {
        if (num == 1) return answer;
        if (answer == 500) return -1;
        answer++;
        if (num % 2 == 1) return solution(num * 3 + 1);
        else return solution(num / 2);
    }

    public int collatz(int num) {
        long n = (long) num;
        for (int i = 0; i < 500; i++) {
            if (n == 1) return i;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(s.solution(num));
    }
}

