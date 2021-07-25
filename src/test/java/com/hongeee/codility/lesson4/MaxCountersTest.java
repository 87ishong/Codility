package com.hongeee.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {

    @Test
    void solution() {
        MaxCounters solution = new MaxCounters();
        assertArrayEquals(new int[] { 3, 2, 2, 4, 2 }, solution.solution(5, new int[] { 3, 4, 4, 6, 1, 4, 4 }));
    }
}