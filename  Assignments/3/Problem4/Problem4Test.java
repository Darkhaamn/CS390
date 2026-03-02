package Problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void findMax() {
        Problem4 p = new Problem4();

        int testInt[] = {5, -3, 6, 1, 9, 11};
        assertEquals(1,  p.findMax(testInt, 0));
    }
}