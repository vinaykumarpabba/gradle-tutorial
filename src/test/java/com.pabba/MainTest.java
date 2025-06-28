package com.pabba;


import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void verifyRunsWithoutException() {
        Main.main(new String[]{"Hello, World!"});
    }
}
