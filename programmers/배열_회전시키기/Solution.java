package ps.programmers.배열_회전시키기;

import java.util.Scanner;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("right")) {
            int tmp = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length; i++)
                if (i == 0) answer[i] = tmp;
                else answer[i] = numbers[i - 1];
        } else {
            int tmp = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
                if (i == numbers.length - 1) {
                    answer[i] = tmp;
                    break;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int length = kb.nextInt();
        int[] numbers = new int[length];
        String direction = kb.next();

        for (int i = 0; i < numbers.length; i++) numbers[i] = kb.nextInt();

        numbers = s.solution(numbers, direction);

        for (int i : numbers) System.out.println(i);
    }
}
