package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class N1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 출력할 때 쓰는 명령문

        String str = br.readLine();
        int n = Integer.parseInt(str);

        for (int i = 0; i < n; i++){
            str = br.readLine();
            StringTokenizer st = new StringTokenizer(str); //한 줄에서 띄어쓰기 구분 짓기 위한 명령문
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
                // a와b를 나눈 나머지
            min m = new min();
            int d = m.findmin(a,b);

            System.out.println(a*b/d);
        }
        br.close();

    }
}

class min {
    public int findmin(int a, int b) {
        while(true) {
            if(a%b == 0) {
                return b;
            }
            int c = a%b;
            a = b;
            b = c;
        }
    }
}