/**
 * This is an interface that all troopers should implement.
 */
public interface Trooper {

    /**
     * This is how the trooper attacks.
     * @param value this is a number between 1-20 that determins if there was a hit.
     * @return true if hit, false if miss
     */
    boolean attack(int value);
}
