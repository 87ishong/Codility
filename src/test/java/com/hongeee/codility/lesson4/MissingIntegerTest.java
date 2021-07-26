package com.hongeee.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingIntegerTest {

    @Test
    void solution() {
        MissingInteger solution = new MissingInteger();
        assertEquals(5, solution.solution(new int[] { 1, 3, 6, 4, 1, 2 }));
        assertEquals(4, solution.solution(new int[] { 1, 2, 3 }));
        assertEquals(1, solution.solution(new int[] { -1, -3 }));
    }
}