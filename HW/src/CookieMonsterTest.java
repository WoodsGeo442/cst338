import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CookieMonsterTest {

    private CookieMonster c;

    private List<String> food = new ArrayList<>();
    private Random random = new Random();
    private int key;

    @BeforeEach
    void setUp() {
        c = new CookieMonster("hankM", "blueGuy");

        food.add("avocado");
        food.add("pizza");
        food.add("cake");
        food.add("burger");

        key = random.nextInt(food.size());

    }

    @AfterEach
    void tearDown() {
        c = null;

    }

    @Test
    void addMonster() {

    }

    @Test
    void getName() {
        assertEquals("hankM", c.getName());
    }

    @Test
    void getMonsterKind() {
        assertEquals("blueGuy", c.getMonsterKind());
    }

    @Test
    void setMonsterKind() {
        c.setMonsterKind("redGuy");
        assertNotEquals("blueGuy", c.getMonsterKind());
        assertEquals("redGuy", c.getMonsterKind());
    }

    @Test
    void getMonsterCount() {
        assertEquals(1, Monster.getMonsterCount());
        CookieMonster c2 = new CookieMonster();
        assertNotEquals(1, Monster.getMonsterCount());
        assertEquals(2, Monster.getMonsterCount());
    }

    @Test
    void sing() {
        assertEquals("hankM says it is not time for singing. Maybe in 10 minutes",c.sing(10));
        assertEquals("hankM sings C IS FOR COOKIE!! for 7 minutes",c.sing(7));
    }

    @Test
    void bake() {
        assertEquals("hankM bakes cookies in an oven.",CookieMonster.bake(c));
        assertEquals("I don’t know what kind of monster that is",CookieMonster.bake(null));
    }

    @Test
    void share() {
        assertEquals("hankM does not share any cookies =-(", c.share(c.getName()));
        assertEquals("hankM shares cookies with Trogdor", c.share("Trogdor"));
    }

    @Test
    void eat() {
        assertEquals("cookie!! OM NOM NOM!", c.eat("cookie"));
        assertEquals("C is for cookie, not " + food.get(key), c.eat(food.get(key)));
    }
}