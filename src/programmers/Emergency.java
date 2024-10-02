package programmers;

import java.util.ArrayList;

public class Emergency {
    public static void main(String[] args) {
        int[] emergency = {3,76,24};
        Em e = new Em();
        System.out.println(e.solution(emergency));
    }
}

class Em {
    public ArrayList<Integer> solution(int[] emergency) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < emergency.length; i++){
            answer.add(1);
            for (int j = 0; j < emergency.length ; j++) {
                if(emergency[i] < emergency[j]) {
                    answer.set(i, answer.get(i) + 1);
                }
            }
        }
        return answer;
    }
}