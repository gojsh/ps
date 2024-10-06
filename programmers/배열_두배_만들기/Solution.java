package ps.programmers.배열_두배_만들기;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            answer[i] = numbers[i] * 2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {1, 2, 3, 4, 5};
        numbers = s.solution(numbers);
        for (int i : numbers) System.out.println(i);
    }
}