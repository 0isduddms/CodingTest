package programmers;

import java.util.Scanner;

public class SquarStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = "*";
        for (int i = 0; i<b;i++) {
            System.out.println(c.repeat(a));
        }

    }
}
