public class SpaceStone implements IStone {

    private String location = "";

    private static SpaceStone spaceStone = null;

    private SpaceStone(){

    }

    public static SpaceStone getInstance(){
        if(spaceStone == null){
            spaceStone = new SpaceStone();
        }
        return spaceStone;
    }

    @Override
    public void special(Person owner) {
        System.out.println(owner.getName() + " is currently at " + owner.getLocation());
        owner.setLocation(this.location);
        System.out.println(owner.getName() + " is now at " + owner.getLocation());
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
