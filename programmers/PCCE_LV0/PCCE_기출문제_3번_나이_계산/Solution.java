package ps.programmers.PCCE_LV0.PCCE_기출문제_3번_나이_계산;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();

        int answer = 0;

        if (age_type.equals("Korea")) answer = 2030 - year + 1;

        else if (age_type.equals("Year")) answer = 2030 - year;

        System.out.println(answer);
    }
}
