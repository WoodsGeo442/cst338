import java.io.*;
import java.util.Scanner;

public class Histogram {
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
        }
    }
}
