package programmers;

import java.util.Objects;

public class JadenCaseString {
    public static void main(String[] args) {
        String s = "  for the what 1what  ";
        JCS j = new JCS();
        j.solution(s);
    }
}

class JCS {
    public String solution(String s) {
        String[] arrs = s.split("");
        String answer = "";
        for(int i=0; i<arrs.length; i++) {
            arrs[i] = arrs[i].toLowerCase();
            if(i == 0 || Objects.equals(arrs[i - 1]," ")) {
                arrs[i] = arrs[i].replace(arrs[i],arrs[i].toUpperCase());
                answer += arrs[i];
            }
            else if (i <= arrs.length - 3 && Objects.equals(arrs[i]," ") && Objects.equals(arrs[i], arrs[i+1])) {
                answer += " ";
                answer += " ";
                answer += arrs[i+2].toUpperCase();
                System.out.println(arrs[i+2]);
                i = i + 2;
            }
            else if (i <= arrs.length - 2 && Objects.equals(arrs[i], " ")) {
                answer += " ";
                answer += arrs[i+1].toUpperCase();
                i++;
            }
            else answer += arrs[i];
        }
        System.out.println(answer);
        return answer;
    }
}