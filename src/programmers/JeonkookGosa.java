package programmers;

import java.util.Arrays;

public class JeonkookGosa {
    public static void main(String[] args) {
        int[] rank = {1,2,3};
        boolean[] attendance = {true, true, true};
        Choose c = new Choose();
        System.out.println(c.solution(rank, attendance));
    }
}

class Choose {
    public int solution(int[] rank, boolean[] attendance) {
        int first = rank.length;
        int second = rank.length;
        int third = rank.length;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < rank.length; i++) {
            if(attendance[i]) {
                if (first >= rank[i]) {
                    third = second;
                    c = b;
                    second = first;
                    b = a;
                    first = rank[i];
                    a = i;
                }
                else if (second >= rank[i]) {
                    third = second;
                    c = b;
                    second = rank[i];
                    b = i;
                }
                else if (third >= rank[i]) {
                    third = rank[i];
                    c = i;
                }
            }
        }

        return 10000 * a + 100 * b + c;
    }
}