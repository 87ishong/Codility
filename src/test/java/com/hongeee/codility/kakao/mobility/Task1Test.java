package com.hongeee.codility.kakao.mobility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    void solution() {
        Task1 solution = new Task1();
        assertEquals("004-448-555-583-61", solution.solution("00-44  48 5555 8361"));
        assertEquals("022-198-53-24", solution.solution("0 - 22 1985--324"));
        assertEquals("555-372-654", solution.solution("555372654"));
        assertEquals("354-166-874-681-351-51-68", solution.solution("3541-6 6-8746-8 13-51 -5168-"));
        assertEquals("56", solution.solution("-5  6-"));
    }
}