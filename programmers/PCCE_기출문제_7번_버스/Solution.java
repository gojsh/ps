package ps.programmers.PCCE_기출문제_7번_버스;

import java.util.Scanner;

class Solution {
    public int solution(int seat, String[][] passengers) {
        int num_passenger = 0;
        for (int i = 0; i < passengers.length; i++) {
            num_passenger += func4(passengers[i]);
            num_passenger -= func3(passengers[i]);
        }
        int answer = func1(seat - num_passenger);
        return answer;
    }

    public int func1(int num) {
        if (0 > num) return 0;
        else return num;
    }

    public int func2(int num) {
        if (num > 0) return 0;
        else return num;
    }

    public int func3(String[] station) {
        int num = 0;
        for (int i = 0; i < station.length; i++) {
            if (station[i].equals("Off")) num += 1;
        }
        return num;
    }

    public int func4(String[] station) {
        int num = 0;
        for (int i = 0; i < station.length; i++) {
            if (station[i].equals("On")) num += 1;
        }
        return num;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        Scanner kb = new Scanner(System.in);
        int seat = kb.nextInt();
        int row = kb.nextInt();
        int col = kb.nextInt();
        String[][] passengers = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                passengers[i][j] = kb.next();
            }
        }
        System.out.println(s.solution(seat, passengers));
    }
}
