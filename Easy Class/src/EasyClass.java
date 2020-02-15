/**
 * Name: Geoffrey Woods
 * Date: 2/14/2020
 * Explanation: This class is meant to serve as a basic skeleton for classes.  It consists of 2 constructors, 3 setters, and 3 getters.
 */

public class EasyClass {
    String name;
    int count;
    double score;
    public EasyClass(String name, Integer count, Double score){
        this.name = name;
        this.count = count;
        this.score = score;
    }
    public EasyClass(String name, Double score){
        this.name = name;
        this.score = score;
        this.count = 0;
    }
    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int Integer){
        this.count = Integer;
    }
    public Double getScore(){
        return score;
    }
    public void setScore(double Score){
        this.score = Score;
    }
}
