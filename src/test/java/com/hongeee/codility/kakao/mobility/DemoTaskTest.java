package com.hongeee.codility.kakao.mobility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTaskTest {

    @Test
    void solution() {
        DemoTask solution = new DemoTask();
        assertEquals(5, solution.solution(new int[] { 1, 3, 6, 4, 1, 2 }));
        assertEquals(4, solution.solution(new int[] { 1, 2, 3 }));
        assertEquals(1, solution.solution(new int[] { -1, -3 }));
    }
}