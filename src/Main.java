import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String a = "aBcDeFg";
        Solution sol = new Solution();
        sol.solution(a);
    }
}

class Solution {
    public String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }
}