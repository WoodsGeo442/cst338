/**
 * @author Drew A. Clinkenbeard
 * Make this class implement the interface Trooper...
 * Check the Stormtrooper class for hints
 */
public class Flametrooper implements Trooper{
    private static int COUNT = 0;
    //Remember to override the attack method
    //Flame troopers have a better hit ratio. They hit if the
    //value is 15 or better...


    @Override
    public String toString() {
        return "this is a flame trooper";
    }

    @Override
    public boolean attack(int value) {
        return false;
    }
}
