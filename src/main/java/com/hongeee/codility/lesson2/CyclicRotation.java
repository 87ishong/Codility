package com.hongeee.codility.lesson2;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int[] A, int K); }
 *
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 *
 * For example, given
 *
 *     A = [3, 8, 9, 7, 6]
 *     K = 3
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 *
 *     [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 *     [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 *     [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * For another example, given
 *
 *     A = [0, 0, 0]
 *     K = 1
 * the function should return [0, 0, 0]
 *
 * Given
 *
 *     A = [1, 2, 3, 4]
 *     K = 4
 * the function should return [1, 2, 3, 4]
 *
 * Assume that:
 *
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        // If given array is null than return null
        if (A == null) {
            return null;
        }

        int[] shiftedArr = new int[A.length];

        // If given array is empty than return empty array
        if (A.length == 0) {
            return shiftedArr;
        }

        // Calculate shifted index of first element without cycle
        int shiftedIndex = K % A.length;

        for (int i = 0; i < A.length; i++) {
            // If index over length of given array than initialize index
            if (shiftedIndex >= A.length) {
                shiftedIndex = 0;
            }

            shiftedArr[shiftedIndex] = A[i];
            shiftedIndex++;
        }

        return shiftedArr;
    }
}
