package ps.programmers.문자열_내_마음대로_정렬하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer;
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.charAt(n) > s2.charAt(n)) return 1;
                else if (s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });
        answer = strings;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int l = kb.nextInt();
        String[] strings = new String[l];
        for (int i = 0; i < strings.length; i++) strings[i] = kb.next();
        int n = kb.nextInt();
        for (String i : s.solution(strings, n)) System.out.println(i);
    }
}