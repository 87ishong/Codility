package com.hongeee.codility.lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermCheckTest {

    @Test
    void solution() {
        PermCheck solution = new PermCheck();
        assertEquals(1, solution.solution(new int[] { 4, 1, 2, 3 }));
        assertEquals(0, solution.solution(new int[] { 4, 1, 3 }));
        assertEquals(0, solution.solution(new int[] { 9, 3 }));
    }
}