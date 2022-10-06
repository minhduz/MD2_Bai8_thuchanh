import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0, 0)")
    void testGetVolume0And0() {
        int radius = 1;
        int height = 1;
        double expected = 12.566370614359172;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 3;
        double expected = 25.132741228718345;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
