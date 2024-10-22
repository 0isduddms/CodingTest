package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class TwoNumbers {
    public static void main(String[] args) {
        PickNum p = new PickNum();
        p.solution(new int[]{2, 1, 3, 4, 1});
    }
}

class PickNum {
    public ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length - 1; i++) {
            for(int j = i+1; j < numbers.length; j++) {
                int k = numbers[i] + numbers[j];
                if(!result.contains(k)) {
                    result.add(k);
                }
            }
            Collections.sort(result);
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
        return result;
    }
}