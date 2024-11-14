package ps.programmers.두_개_뽑아서_더히기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] numbers) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int num = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                num = numbers[i] + numbers[j];
                if (!list.contains(num)) list.add(num);
            }
            Collections.sort(list);
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) numbers[i] = kb.nextInt();
        for (int i : s.solution(numbers)) System.out.print(i + " ");
    }
}
