import java.util.Scanner;
import java.io.*;

public class Histogram {
    private int[] count = new int[11];
    private String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    public void tracker(String input){
        if(input == letters[0]){
            count[0]++;
        } else if(input == letters[1]){
            count[1]++;
        } else if(input == letters[2]){
            count[2]++;
        } else if(input == letters[3]){
            count[3]++;
        } else if(input == letters[4]){
            count[4]++;
        } else if(input == letters[5]){
            count[5]++;
        } else if(input == letters[6]){
            count[6]++;
        } else if(input == letters[7]){
            count[7]++;
        } else if(input == letters[8]){
            count[8]++;
        } else if(input == letters[9]){
            count[9]++;
        } else if(input == letters[10]){
            count[10]++;
        } else if(input == letters[11]){
            count[11]++;
        } else {
            System.out.println("error. Try something else");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String filename = "myFile.txt";
        File f = new File(filename);

        try{
            if(f.createNewFile()){
                System.out.println(filename+" created successfully.");
            } else {
                System.out.println(filename+" already exists.");
            }
        }catch(IOException e){
            System.out.println("Problem when making the file... "+e);
            e.printStackTrace();
        }
        while(true){
            System.out.print("enter something(zz to exit): ");
            String input = scanner.nextLine();

            if(input.trim().toLowerCase().equals("zz")){
                break;
            }
            System.out.println("You entered "+input);
            tracker(input);
        }
    }
}
