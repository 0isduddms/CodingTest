package programmers;
/*
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

제한 사항
- numbers는 소문자로만 구성되어 있습니다.
- numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이
  공백 없이 조합되어 있습니다.
- 1 ≤ numbers의 길이 ≤ 50
- "zero"는 numbers의 맨 앞에 올 수 없습니다.
 */

import java.util.Arrays;

public class HateEng {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        // o, t, t, f, f, s, s, e, n, z
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
        HE h = new HE();
        h.solution(numbers);
    }
}
class HE {
    public long solution(String numbers) {
        if (numbers.contains("one")) numbers = numbers.replaceAll("one", "1");
        if (numbers.contains("two")) numbers = numbers.replaceAll("two", "2");
        if (numbers.contains("three")) numbers = numbers.replaceAll("three", "3");
        if (numbers.contains("four")) numbers = numbers.replaceAll("four", "4");
        if (numbers.contains("five")) numbers = numbers.replaceAll("five", "5");
        if (numbers.contains("six")) numbers = numbers.replaceAll("six", "6");
        if (numbers.contains("seven")) numbers = numbers.replaceAll("seven", "7");
        if (numbers.contains("eight")) numbers = numbers.replaceAll("eight", "8");
        if (numbers.contains("nine")) numbers = numbers.replaceAll("nine", "9");
        if (numbers.contains("zero")) numbers = numbers.replaceAll("zero", "0");
        Long answer = Long.parseLong(numbers);
        return answer;
    }
}