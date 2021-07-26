package com.hongeee.codility.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * This is a demo task.
 *
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        // Add all elements of A
        for (int i : A) {
            set.add(i);
        }

        int i = 1;

        // Find missing integer from 1 to N
        while (true) {
            if (!set.contains(i)) {
                return i;
            }

            i++;
        }
    }
}
