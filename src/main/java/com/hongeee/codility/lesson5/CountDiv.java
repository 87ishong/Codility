package com.hongeee.codility.lesson5;

/**
 * Write a function:
 *
 * class Solution { public int solution(int A, int B, int K); }
 *
 * that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
 *
 * { i : A ≤ i ≤ B, i mod K = 0 }
 *
 * For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * A and B are integers within the range [0..2,000,000,000];
 * K is an integer within the range [1..2,000,000,000];
 * A ≤ B.
 */
public class CountDiv {

//    /**
//     * O(B-A)
//     */
//    public int solution(int A, int B, int K) {
//        int count = 0;
//
//        for (int i = A; i <= B; i++) {
//            if (i % K == 0) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    /**
//     * O((B-A)/K)
//     */
//    public int solution(int A, int B, int K) {
//        int count = 0;
//        int multiple = A / K;
//
//        if (K * multiple < A) {
//            multiple++;
//        }
//
//        while (K * multiple <= B) {
//            count++;
//            multiple++;
//        }
//
//        return count;
//    }

    /**
     * O(1)
     */
    public int solution(int A, int B, int K) {
        int total = B / K;
        int exclude = A / K;

        if (A % K == 0) {
            exclude--;
        }

        return total - exclude;
    }
}
