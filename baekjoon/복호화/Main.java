package ps.baekjoon.복호화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public String solution(String[] str) {
        String answer = "";
        for (int i = 0; i < str.length; i++) {
            int[] arr = new int[26];
            int max = 0;
            int count = 0;

            String text = str[i].replace(" ", "");

            for (int j = 0; j < text.length(); j++) {
                arr[text.charAt(j) - 'a']++;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[max]) max = j;
            }

            for (int j = 0; j < 26; j++) {
                if (arr[j] == arr[max])
                    count++;
            }

            char ch = (char) (max + 'a');
            System.out.println(count > 1 ? "?" : ch);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(bf.readLine());
        String[] str = new String[test];
        for (int i = 0; i < str.length; i++) str[i] = bf.readLine();
        System.out.println(T.solution(str));
    }
}

