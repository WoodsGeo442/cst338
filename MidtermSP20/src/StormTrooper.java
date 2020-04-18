public class StormTrooper extends Trooper{
    private String name = "";
    private static int soldierCount = 0;

    StormTrooper(String unit, int number){
        StormTrooper(unit, number) = Trooper(this.getUnit(), this.getNumber());
        soldierCount++;
        this.trooperKind = "StormTrooper";
        marchModifier = 1.10;
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
    public double march(double d) {
        return marchSpeed * d * marchModifier;
    }

    @Override
    public String toString() {
        return this.getName() + "(" + this.toString() + getTrooperKind();
    }
}
