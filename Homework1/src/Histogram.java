import java.util.Scanner;
import java.io.*;

public class Histogram {
    private static int[] count = new int[12];
    private static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    public static void tracker(String input){
        if(input == "A"){
            count[0]++;
        } else if(input == "B"){
            count[1]++;
        } else if(input == "C"){
            count[2]++;
        } else if(input == "D"){
            count[3]++;
        } else if(input == "E"){
            count[4]++;
        } else if(input == "F"){
            count[5]++;
        } else if(input == "G"){
            count[6]++;
        } else if(input == "H"){
            count[7]++;
        } else if(input == "I"){
            count[8]++;
        } else if(input == "J"){
            count[9]++;
        } else if(input == "K"){
            count[10]++;
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
            } else {
                System.out.println("You entered " + input);
                tracker(input);
            }
        }
    }

}
