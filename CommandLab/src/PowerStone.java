public class PowerStone implements IStone{

    private Double powerIncrease = 1.5;

    @Override
    public void special(Person owner) {
        double currentPower = owner.getPower();
        System.out.println(owner.getName() + "'s power is currently " + currentPower);
        currentPower*=powerIncrease;
        owner.setPower(currentPower);
        System.out.println(owner.getName() + "'s power is now " + owner.getPower());
    }
}
