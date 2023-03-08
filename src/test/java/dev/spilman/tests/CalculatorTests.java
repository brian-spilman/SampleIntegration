package dev.spilman.tests;

import dev.spilman.app.NiceCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    void basic_addition() {
        double result = NiceCalculator.add(2,2);
        Assertions.assertEquals(4, result);
    }

    @Test
    void negative_addition() {
        double result = NiceCalculator.add(-5, -5);
        Assertions.assertEquals(-10, result);
    }

    @Test
    void get_environ_variable() {
        System.out.println(System.getenv("GREETING"));
    }
}
