package ps.programmers.영어가_싫어요;

import java.util.Scanner;

class Solution {
    public long solution(String numbers) {
        long answer;
        String[] find = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < find.length; i++) {
            numbers = numbers.replaceAll(find[i], String.valueOf(i));
        }
        answer = Long.parseLong(numbers);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String numbers = kb.next();
        System.out.println(s.solution(numbers));
    }
}
