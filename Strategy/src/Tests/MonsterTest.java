package Tests;

import Monsters.Imp;
import Monsters.Kobold;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MonsterTest {
    private Imp imp;
    private Kobold kobold;
    private HashMap<String, Integer> items = new HashMap<>();
    private HashMap<String,Integer> values = new HashMap<>();

    @BeforeEach
    void setUp() {
        values.put("impHealth",10);
        values.put("impXP",5);
        values.put("koboldHealth",25);
        values.put("koboldXP",10);

        items.put("Sword",1);
        imp = new Imp(  values.get("impHealth"),
                        values.get("impXP"),
                        items);
        kobold = new Kobold(values.get("koboldHealth"),
                            values.get("koboldXP"),
                            items);
    }

    @AfterEach
    void tearDown() {
        imp = null;
        kobold = null;
        items = null;
    }

    @Test
    void getHp() {
        assertEquals(values.get("impHealth"), imp.getHp());
        assertEquals(values.get("koboldHealth"),kobold.getHp());
    }

    @Test
    void takeDamage(){
        assertEquals(imp.getHp(),imp.getMaxHP());
        imp.takeDamage(5);
        assertNotEquals(imp.getMaxHP(),imp.getHp());

        assertEquals(kobold.getHp(),kobold.getMaxHP());
        kobold.takeDamage(5);
        assertNotEquals(kobold.getMaxHP(),kobold.getHp());
    }

    @Test
    void healHp() {
        imp.takeDamage(5);
        imp.healHp(1);
        assertEquals(imp.getMaxHP()-4,imp.getHp());

        kobold.takeDamage(5);
        kobold.healHp(1);
        assertEquals(kobold.getMaxHP()-4,kobold.getHp());

        //make sure we can't over heal
        imp.healHp(20);
        assertEquals(imp.getMaxHP(),imp.getHp());

        kobold.healHp(20);
        assertEquals(kobold.getMaxHP(),kobold.getHp());

    }

    @Test
    void getXp() {
            assertEquals(values.get("impXP"),imp.getXp());
            assertEquals(values.get("koboldXP"),kobold.getXp());
    }

    @Test
    void getItems() {
    }

    @Test
    void setItems() {
    }

    @Test
    void getMaxHP() {
    }

    @Test
    void getAgi() {
    }

    @Test
    void getDef() {
    }

    @Test
    void getStr() {
    }

    @Test
    void getAttribute() {
    }
}