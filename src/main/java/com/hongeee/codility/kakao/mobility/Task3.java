package com.hongeee.codility.kakao.mobility;

import java.util.ArrayList;
import java.util.List;

/**
 * We call an array switching if all numbers in even positions are equal and all numbers in odd positions are equal.
 *
 * For example: [3, -7, 3, -7, 3] and [4, 4, 4] are switching, but p5, 5, 4, 5, 4] and [-3, 2, 3] are not switching.
 *
 * Wat is the length of the longest switching slice (continuous fragment) in a ginve array A?
 *
 * Write a function:
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A consisting of N integers, returns the length of the longest switching slice in A.
 *
 * Examples:
 * 1. Given A = [3, 2, 3, 2, 3], the function should return 5, because the whole array is switching.
 * 2. Given A = [7, 4, -2, 4, -2, -9], the function should return 4. The longest switching slice is [4, -2, 4, -2].
 * 3. Given A = [7, -5, -5, -5, 7, -1, 7], the function should return 3. There are two switching slices of equal length: [-5, -5, -5] and [7, -1, 7].
 * 4. Given A = [4], the function should return 1. A single-element slice is also a switching slice.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [-1,000,000,000..1,000,000,000].
 */
public class Task3 {

    public int solution(int[] A) {
        List<Integer> list = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            // 남은 길이가 max 보다 작을 경우 비교할 필요 없음
            if (A.length - i < max) {
                break;
            }

            // 슬라이스 저장을 위한 list 초기화
            list.clear();
            
            for (int j = i; j < A.length; j++) {
                int num = A[j];

                // 두 자리 미만일 경우에는 기본적으로 슬라이스에 추가
                if (list.size() < 2) {
                    list.add(num);
                    continue;
                }

                // 직전 짝수 위치 또는 홀수 위치 숫자와 같을 경우 슬라이스 추가
                if (num == list.get(list.size() - 2)) {
                    list.add(num);
                    continue;
                }

                break;
            }

            int currentSize = list.size();

            if (max < currentSize) {
                max = currentSize;
            }
        }

        return max;
    }
}
