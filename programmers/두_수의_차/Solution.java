package ps.programmers.두_수의_차;

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int answer;
        answer = s.solution(1, 2);
        System.out.println(answer);
    }
}

