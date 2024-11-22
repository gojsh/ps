package ps.programmers.올바른_괄호;

import java.util.Scanner;
import java.util.Stack;

class Solution {
    public boolean solution(String str) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') stack.push(x);
            else {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(s.solution(str));
    }
}

