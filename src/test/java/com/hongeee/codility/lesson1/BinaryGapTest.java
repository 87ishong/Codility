package com.hongeee.codility.lesson1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void solutionTest() {
        BinaryGap solution = new BinaryGap();
        assertEquals(2, solution.solution(9));
        assertEquals(4, solution.solution(529));
        assertEquals(1, solution.solution(20));
        assertEquals(0, solution.solution(15));
        assertEquals(0, solution.solution(32));
        assertEquals(5, solution.solution(1041));
    }
}