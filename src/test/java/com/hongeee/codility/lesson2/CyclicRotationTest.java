package com.hongeee.codility.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    void solution() {
        CyclicRotation solution = new CyclicRotation();
        assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, solution.solution(new int[] { 3, 8, 9, 7, 6 }, 3));
        assertArrayEquals(new int[] { 0, 0, 0 }, solution.solution(new int[] { 0, 0, 0 }, 1));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, solution.solution(new int[] { 1, 2, 3, 4 }, 4));
        assertArrayEquals(null, solution.solution(null, 4));
        assertArrayEquals(new int[] {  }, solution.solution(new int[] {  }, 4));
    }
}