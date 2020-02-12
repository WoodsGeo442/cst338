/**
 * This represents a Stormtrooper from Star Wars
 * This is a simple class with only a count.
 * The point is to show that static members belong to the CLASS
 * not the object.
 */
public class Stormtrooper implements Trooper{
    private static int COUNT = 0;
    private int number;

    public Stormtrooper(){
        COUNT++;
        number = COUNT;
    }

    public static int getCount(){
        return COUNT;
    }

    /**
     * We use override here because we get this method from Trooper.
     * @param value this is a number between 1-20 that determines if there was a hit.
     * @return true if value is greater than 18... Stormtroopers can't hit anything
     */
    @Override
    public boolean attack(int value) {
        return value > 18;
    }

    @Override
    public String toString() {
        return "Stormtrooper{" +
                "number=" + number +
                '}';
    }
}
