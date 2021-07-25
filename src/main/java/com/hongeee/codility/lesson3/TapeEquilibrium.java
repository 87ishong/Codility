package com.hongeee.codility.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A non-empty array A consisting of N integers is given. Array A represents numbers on a tape.
 *
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 *
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 *
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 *
 * For example, consider array A such that:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * We can split this tape in four places:
 *
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given a non-empty array A of N integers, returns the minimal difference that can be achieved.
 *
 * For example, given:
 *
 *   A[0] = 3
 *   A[1] = 1
 *   A[2] = 2
 *   A[3] = 4
 *   A[4] = 3
 * the function should return 1, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
public class TapeEquilibrium {

//    public int solution(int[] A) {
//        int min = 0;
//
//        for (int i = 1; i < A.length; i++) {
//            int[] part1 = Arrays.copyOfRange(A, 0, i);
//            int[] part2 = Arrays.copyOfRange(A, i, A.length);
//
//            int diff = Math.abs(Arrays.stream(part1).sum() - Arrays.stream(part2).sum());
//
//            // If first loop or less than previous minimum value
//            if (min == 0 || diff < min) {
//                min = diff;
//            }
//
//            // No diff
//            if (min == 0) {
//                break;
//            }
//        }
//
//        return min;
//    }

//    public int solution(int[] A) {
//        int min = 0;
//        int sum1 = 0;
//        int sum2 = Arrays.stream(A).sum();
//
//        for (int i = 0; i < A.length - 1; i++) {
//            sum1 += A[i];
//            sum2 -= A[i];
//
//            int diff = Math.abs(sum1 - sum2);
//
//            // If first loop or less than previous minimum value
//            if (min == 0 || diff < min) {
//                min = diff;
//            }
//
//            // No diff
//            if (min == 0) {
//                break;
//            }
//        }
//
//        return min;
//    }

//    public int solution(int[] A) {
//        int sum1 = 0;
//        int sum2 = Arrays.stream(A).sum();
//        List<Integer> sumList = new ArrayList<>();
//
//        for (int i = 0; i < A.length - 1; i++) {
//            sum1 += A[i];
//            sum2 -= A[i];
//
//            sumList.add(Math.abs(sum1 - sum2));
//        }
//
//        return Collections.min(sumList);
//    }

    public int solution(int[] A) {
        int sum1 = 0;
        int sum2 = 0;

        // It is faster than Arrays.stream.sum
        for (int i : A) {
            sum2 += i;
        }

        List<Integer> sumList = new ArrayList<>();

        for (int i = 0; i < A.length - 1; i++) {
            sum1 += A[i];
            sum2 -= A[i];

            sumList.add(Math.abs(sum1 - sum2));
        }

        return Collections.min(sumList);
    }
}
