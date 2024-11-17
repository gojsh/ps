package ps.programmers._1차_비밀지도;

import java.util.Scanner;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = answer[i].replace('0', ' ');
            answer[i] = answer[i].replace('1', '#');
            while (answer[i].length() < n) {
                answer[i] = ' ' + answer[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr1.length; i++) arr1[i] = kb.nextInt();
        for (int i = 0; i < arr2.length; i++) arr2[i] = kb.nextInt();
        for (String i : s.solution(n, arr1, arr2)) System.out.println(i);
    }
}
