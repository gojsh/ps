package ps.programmers.폰켓몬;

import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public int solution(int[] nums) {
        int answer;
        int max = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) set.add(num);
        if (set.size() > max) {
            return max;
        } else answer = set.size();

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] nums = new int[kb.nextInt()];
        for (int i = 0; i < nums.length; i++) nums[i] = kb.nextInt();
        System.out.println(s.solution(nums));
    }
}