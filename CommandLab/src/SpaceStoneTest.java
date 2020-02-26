import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceStoneTest {


    SpaceStone spaceStone = null;
    @BeforeEach
    void setUp() {
        System.out.println("before each");
        SpaceStone spaceStone = SpaceStone.getInstance();
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
        spaceStone = null;
    }

    @Test
    void getLocation() {
        assertEquals("", "");
        assertEquals("", spaceStone.getLocation());
//        spaceStone.setLocation("Marina");
//        assertNotEquals("", spaceStone.getLocation());
//        assertEquals("Marina", spaceStone.getLocation());
    }

    @Test
    void setLocation() {
    }
}