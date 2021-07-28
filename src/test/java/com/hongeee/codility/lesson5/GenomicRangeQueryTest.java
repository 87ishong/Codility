package com.hongeee.codility.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenomicRangeQueryTest {

    @Test
    void solution() {
        GenomicRangeQuery solution = new GenomicRangeQuery();
        assertArrayEquals(new int[] { 2, 4, 1 }, solution.solution("CAGCCTA", new int[] { 2, 5, 0 }, new int[] { 4, 5, 6 }));
    }
}