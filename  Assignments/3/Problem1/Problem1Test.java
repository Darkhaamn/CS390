package Problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {
    @Test
    void findMinChar() {
        Problem1 p = new Problem1();

        char result = p.findMinChar("akel");
        assertEquals('a', result);
    }
}