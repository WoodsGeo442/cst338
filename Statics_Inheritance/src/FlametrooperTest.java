import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlametrooperTest {
    Flametrooper sparky = null;

    @Test
    void initializerTest(){
        assertNull(sparky);
        sparky = new Flametrooper();
        assertNotNull(sparky);
    }

    @Test
    void attack() {
        //Uncomment the tests below and give it a try...
        Flametrooper sparky = new Flametrooper();
//        assertFalse(sparky.attack(0));
//        assertFalse(sparky.attack(5));
//        assertTrue(sparky.attack(15));
//        assertTrue(sparky.attack(20));
    }

}