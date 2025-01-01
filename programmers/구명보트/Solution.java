package ps.programmers.구명보트;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int idx = 0;
        for (int i = people.length - 1; i >= idx; i--) {
            if (people[i] + people[idx] <= limit) {
                answer++;
                idx++;
            } else answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] people = new int[kb.nextInt()];
        int limit = kb.nextInt();
        for (int i = 0; i < people.length; i++) people[i] = kb.nextInt();
        System.out.print(s.solution(people, limit));
    }
}
