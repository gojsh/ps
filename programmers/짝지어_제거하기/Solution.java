package ps.programmers.짝지어_제거하기;

import java.util.Scanner;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.empty()) stack.add(c);
            else {
                if (stack.peek() == c) stack.pop();
                else stack.add(c);
            }
        }
        if (stack.empty()) answer = 1;
        else answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}
