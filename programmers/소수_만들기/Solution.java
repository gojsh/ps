package ps.programmers.소수_만들기;

import java.util.Scanner;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) answer++;
                }
            }
        }
        return answer;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int[] nums = new int[kb.nextInt()];
        for (int i = 0; i < nums.length; i++) nums[i] = kb.nextInt();
        System.out.println(s.solution(nums));
    }
}
