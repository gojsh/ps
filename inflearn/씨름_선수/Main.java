package ps.inflearn.씨름_선수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Boby implements Comparable<Boby> {
    public int h, w;

    public Boby(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Boby o) {
        return o.h - this.h;
    }
}

class Main {
    public int solution(ArrayList<Boby> arr) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Boby ob : arr) {
            if (ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Boby> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = kb.nextInt();
            int w = kb.nextInt();
            arr.add(new Boby(h, w));
        }
        System.out.println(T.solution(arr));
    }
}
