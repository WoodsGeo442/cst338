import java.util.HashMap;
import java.util.List;

public abstract class Trooper {
    private String unit;
    private int number;
    String trooperKind;
    double marchSpeed;
    double marchModifier;

    Trooper(){
        this("AA", 0);
    }

    public Trooper(String unit, int number){
        this.unit = unit;
        this.number = number;
        this.marchSpeed = 5;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTrooperKind() {
        return trooperKind;
    }

    public void setTrooperKind(String trooperKind) {
        this.trooperKind = trooperKind;
    }

    public double getMarchSpeed() {
        return marchSpeed;
    }

    public void setMarchSpeed(double marchSpeed) {
        this.marchSpeed = marchSpeed;
    }

    public static void addToUnit(HashMap<String, List<Trooper>> units, Trooper t){
        if(t == null){
            return;
        }

    }

    boolean attack(Trooper target, int roll){
        Trooper a = new Trooper();
        if(this. == target){
            System.out.println(this.getUnit() + " is targeting itself.");
            System.out.println(this.getUnit() + " rolled a " + roll + " and hurt itself in the confusion.");
            return true;
        }
    }

    abstract double march(double d);

    @Override
    public String toString() {
        return unit + number + ": ";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
