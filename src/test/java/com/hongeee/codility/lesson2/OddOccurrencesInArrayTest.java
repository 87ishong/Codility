package com.hongeee.codility.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesInArrayTest {

    @Test
    void solution() {
        OddOccurrencesInArray solution = new OddOccurrencesInArray();
        assertEquals(7, solution.solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
    }
}