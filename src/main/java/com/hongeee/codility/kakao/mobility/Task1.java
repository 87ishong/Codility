package com.hongeee.codility.kakao.mobility;

import java.util.LinkedList;
import java.util.Queue;

/**
 * We are given a string S representing a phone number, which we would like to reformat. String S consists of N characters: digits, space and/or dashes. It contains at least to digits.
 *
 * Spaces and dashes in string S can be ignored. We want to reformat the given phone number in such a way that the digits are grouped in blocks of length three, separated by single dashes. If necessary, the final block or the last two blocks can be of length two.
 *
 * For example, given string S = "00-44  48 5555 8361", we would like to format it as "004-448-555-583-61".
 *
 * Write a function:
 * class Solution { public String solution(String s); }
 *
 * that, given a string S representing a phone number, returns this phone number reformatted as described above.
 *
 * For example, given S = "00-44  48 5555 8361", the function sould return "004-448-555-583-61". Given S = "0 - 22 1985-324", the function should return "022-198-53-24". Given S = "555372654", the function should return "555-372-654".
 *
 * Assume that:
 * N is an integer within the range [2..100];
 * string S consists only of digits (0-9), spaces and/or dashes (-);
 * string S contains at least two digits.
 *
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class Task1 {

    public String solution(String S) {
        S = S.replaceAll("-", "").replaceAll(" ", "");
        char[] chars = S.toCharArray();
        Queue<Character> queue = new LinkedList<>();

        for (char c : chars) {
            queue.add(c);
        }

        StringBuffer sb = new StringBuffer();

        while (!queue.isEmpty()) {
            // 3자리 수 조합이 가능한 경우
            if (queue.size() / 3 > 0) {
                int mod = queue.size() % 3;

                // 나머지가 0 또는 2일 경우 3자리 수와 2자리 수 조합 포맷 가능
                // 3자리 수 조합이 1개만 가능하고 나머지가 1자리 수일 경우 2자리씩 포맷해야 함
                if ((mod == 0 || mod == 2)
                    || (queue.size() / 3 > 1 && mod == 1)) {
                    for (int i = 0; i < 3; i++) {
                        sb.append(queue.poll());
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        sb.append(queue.poll());
                    }
                }
            } else {
                // 남은 수의 갯수는 2의 배수이므로
                for (int i = 0; i < 2; i++) {
                    sb.append(queue.poll());
                }
            }

            if (!queue.isEmpty()) {
                sb.append("-");
            }
        }

        return sb.toString();
    }
}
