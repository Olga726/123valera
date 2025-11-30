import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    @Test
    void sampleTest() {
        assertTrue(2 + 2 == 4);
    }

    @Test
    void sampleTestFailed() {
        assertTrue(2 + 2 == 5);
    }
}
