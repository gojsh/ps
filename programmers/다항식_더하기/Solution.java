package ps.programmers.다항식_더하기;

import java.util.Scanner;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] s = polynomial.split(" ");
        int x = 0;
        int num = 0;

        for (String i : s) {
            if (i.contains("x")) {
                if (i.equals("x")) {
                    x += 1;
                } else x += Integer.parseInt(i.replaceAll("x", ""));
            } else if (!i.equals("+")) num += Integer.parseInt(i);
        }

        if (x != 0 && num == 0) {
            answer = x == 1 ? "x" : x + "x";
        } else if (x != 0) {
            answer = x == 1 ? "x" + " + " + num : x + "x" + " + " + num;
        } else if (num != 0) {
            answer = String.valueOf(num);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        String polynomial = kb.nextLine();
        System.out.println(s.solution(polynomial));
    }
}
