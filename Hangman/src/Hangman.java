import java.util.Scanner;

public class Hangman{
    public static String guessName(String input){
        String newInput;
        char[] inputchars = input.toCharArray();
        for(int i = 0; i < input.length(); i++){
            if(inputchars[i] == ' '){
                inputchars[i] = '#';
            } else {
                inputchars[i] = '_';
            }

        }
        newInput = String.valueOf(inputchars);
        return newInput;
    }

    public static void display(String input){
        char[] inputnew = input.toCharArray();
        for(int i = 0; i < inputnew.length; i++){
            System.out.print(inputnew[i] + " ");
        }
    }

    public static void main(String[] args){
        int guessCounter = 4;

        System.out.println("--------- Welcome to Hangman ---------\n");
        String answer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        answer = scanner.nextLine();
        String copy = guessName(answer);
        for(int i = guessCounter; i > 0; i--){
            int choice = 0;

            System.out.print("\nSo far, the word is: ");
            display(copy);
            System.out.println("\nYou have " + i + " incorrect guesses left.");
            System.out.print("Enter either 1 for guessing or 2 for hint: ");
            choice = scanner.nextInt();
            if()
        }

    }
}
