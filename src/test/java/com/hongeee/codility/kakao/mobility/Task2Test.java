package com.hongeee.codility.kakao.mobility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void solution() {
        Task2 solution = new Task2();
        assertEquals(3, solution.solution(new int[] { 0, 0, 1, 1 }, new int[] { 2 }));
        assertEquals(5, solution.solution(new int[] { 0, 0, 0, 0, 2, 3, 3 }, new int[] { 2, 5, 6 }));
        assertEquals(3, solution.solution(new int[] { 0, 0, 1, 2 }, new int[] { 1, 2 }));
        assertEquals(7, solution.solution(new int[] { 0, 3, 0, 0, 5, 0, 5 }, new int[] { 4, 2, 6, 1, 0 }));
    }
}