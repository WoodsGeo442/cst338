package inClass;

import java.util.HashMap;

public class DeliSandwich implements Sandwich{
    private Integer slicesOfBread;
    private HashMap<String, Integer> filling;

    DeliSandwich(Integer slicesOfBread, HashMap<String, Integer> filling){
        this.slicesOfBread = slicesOfBread;
        this.filling = filling;
    }

    DeliSandwich(Integer bread, String filling){
        this.slicesOfBread = bread;
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put(filling, 1);
        this.filling = hashmap;
    }

    public String listFilling(){
        StringBuilder sb = new StringBuilder();
        if(! filling.isEmpty()){
            for(String key : filling.keySet()){
                for (int i = filling.get(key); i > 0; i--){
                    sb.append(key);
                    sb.append("\n");
                }
            }
        } else {
            sb.append("No filling... not a sandwich");
        }
        return sb.toString();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(slicesOfBread > 1){
            sb.append("bread\n");
        }
        sb.append(listFilling());
        sb.append("bread");
        return sb.toString();
    }
}
