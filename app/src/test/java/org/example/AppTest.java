package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

    @Test
    void testMainRunsWithoutError() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
