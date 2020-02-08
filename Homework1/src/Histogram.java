import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Histogram {
    static int[] count = new int[11];
    static String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    static int findmax(){
        int highestNumber = 0;
        for(int i = 0; i < count.length; i++){
            if(count[i] > highestNumber ){
                highestNumber = count[i];
            }
        }
        return highestNumber;
    }
    static void organize(int counter[], int size, String letters[]){
        int i, k, temp1;
        String temp2;
        boolean swap = false;
        for(i = 0; i < size-1; i++){
            for(k = 0; k < size-i-1;k++){
                if(counter[k] > counter[k+1]){
                    temp1 = counter[k];
                    temp2 = letters[k];
                    counter[k] = counter[k+1];
                    letters[k] = letters[k+1];
                    counter[k+1] = temp1;
                    letters[k+1] = temp2;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
    }

    static void tracker(String input) {
        if (input.equals("A")) {
            count[0]++;
        } else if (input.equals("B")){
            count[1]++;
        } else if(input.equals("C")){
            count[2]++;
        } else if(input.equals("D")){
            count[3]++;
        } else if (input.equals("E")){
            count[4]++;
        } else if (input.equals("F")){
            count[5]++;
        } else if (input.equals("G")){
            count[6]++;
        } else if (input.equals("H")){
            count[7]++;
        } else if (input.equals("I")){
            count[8]++;
        } else if (input.equals("J")){
            count[9]++;
        } else if (input.equals("K")){
            count[10]++;
        } else {
            System.out.println("error. Try something else");
        }
    }
    public static void main(String[] args) {
        //initialize input scanner
        Scanner in = new Scanner(System.in);
        //get filename
        System.out.print("Enter filename: ");
        String input = in.nextLine();
        System.out.println("\nChar  Occurences");
        //initialize file scanner
        File f = new File(input);
        Scanner scan = null;
        //try to find file
        try {
            scan = new Scanner(f);

        }
        //if file is not found
        catch (FileNotFoundException e) {
            System.out.println("File not found..." + e);
            e.printStackTrace();
        }

        //main loop - reading per line
        while(scan != null && scan.hasNext()){
            String letterScanned = scan.nextLine();
            tracker(letterScanned);
        }
        for(int i = 0; i < letters.length; i++){
            if(count[i] != 0){
                System.out.println(" " + letters[i] + "        " + count[i]);
            }
        }
        System.out.println("");
        System.out.println("============= Vertical Bar =============");
        int max = findmax();
        organize(count, count.length, letters);

        for(int i = max; i > 0; i--){
            System.out.print("|  "+i+" |");
            for(int k = 0; k < count.length; k++){
                if(count[k] >= i){
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.print("\n");
        }
        System.out.println("========================================");
        System.out.print("| No |");

        for(int i = 0; i < letters.length; i++){
            System.out.print("  "+letters[i]);
        }
        System.out.println("\n========================================");

    }
}
