package com.hongeee.codility.kakao.mobility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void solution() {
        Task3 solution = new Task3();
        assertEquals(5, solution.solution(new int[] { 3, 2, 3, 2, 3 }));
        assertEquals(4, solution.solution(new int[] { 7, 4, -2, 4, -2, -9 }));
        assertEquals(3, solution.solution(new int[] { 7, -5, -5, -5, 7, -1, 7 }));
        assertEquals(1, solution.solution(new int[] { 4 }));
    }
}