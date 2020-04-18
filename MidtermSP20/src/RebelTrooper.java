public class RebelTrooper extends Trooper{
    private String name;
    private static int soldierCount;

    RebelTrooper(String unit, int number, String name){

        soldierCount++;
        this.trooperKind = "pilot";
        this.marchModifier = 0.75;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getSoldierCount() {
        return soldierCount;
    }

    @Override
    double march(double d) {
        return this.marchSpeed * d * this.marchModifier;
    }

    @Override
    public String toString() {
        return this.getName() + "(" + this.toString() + getTrooperKind();
    }
}
