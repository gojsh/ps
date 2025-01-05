package ps.programmers.연속_부분_수열_합의_개수;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] elements = new int[kb.nextInt()];
        for (int i = 0; i < elements.length; i++) elements[i] = kb.nextInt();
        System.out.println(s.solution(elements));
    }
}
