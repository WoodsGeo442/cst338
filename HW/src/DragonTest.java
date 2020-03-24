import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest {

    Dragon d;
    private List<String> food = new ArrayList<>();
    private Random random = new Random();
    private int key;

    @BeforeEach
    void setUp() {
        d = new Dragon("bob", "wyvern");

        food.add("avocado");
        food.add("pizza");
        food.add("cake");
        food.add("burger");

        key = random.nextInt(food.size());

    }

    @AfterEach
    void tearDown() {
        d = null;
    }

    @Test
    void getName() {
        assertEquals("bob",d.getName());
    }

    @Test
    void getMonsterKind() {
        assertEquals("wyvern",d.getMonsterKind());
    }

    @Test
    void setMonsterKind() {
        assertEquals("wyvern",d.getMonsterKind());
        d.setMonsterKind("mushu");//Mulan anyone?
        assertEquals("mushu",d.getMonsterKind());
    }

    @Test
    void getMonsterCount() {
        assertEquals(1,Monster.getMonsterCount());
        Dragon d2 = new Dragon();
        assertEquals(2,Monster.getMonsterCount());
    }

    @Test
    void flap() {

        assertEquals("bob can't even", d.flap(21));
        assertEquals("bob flaps its tiny wings 9 times", d.flap(9));
        assertEquals("bob flaps its tiny wings 4 times", d.flap(4));

    }

    @Test
    void burninate() {
        assertEquals("bob burninates 7.42 peasants", Dragon.burninate(d,7.42));
        assertEquals("I don't know what this thing eats", Dragon.burninate(null,7.42));
    }

    @Test
    void trample() {
        assertEquals("the cottage is trampled by bob", d.trample("cottage"));
        assertEquals("the wall resists bob", d.trample("wall"));
    }

    @Test
    void eat() {
        assertEquals("Dragons DO eat peasants Burna-licious!", d.eat("peasants"));
        assertEquals("Dragons don't eat " + food.get(key), d.eat(food.get(key)));
    }
}