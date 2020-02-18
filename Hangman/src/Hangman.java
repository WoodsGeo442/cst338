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

    public static String updater(char[] copy, char[] original, char input){
        String newInput;
        for(int i = 0; i < original.length; i++){
            if(original[i] == ' '){
                copy[i] = '#';
            } else if (original[i] == input && copy[i] == '_'){
                copy[i] = input;
            }
        }
        newInput = String.valueOf(copy);
        return newInput;
    }

    public static void display(String input){
        char[] inputnew = input.toCharArray();
        for(int i = 0; i < inputnew.length; i++){
            System.out.print(inputnew[i] + " ");
        }
    }

    public static String letterCheck(char input, String source, String copy){
        char[] sourcechars = source.toCharArray();
        char[] lineschars = copy.toCharArray();
        boolean correct = false;

        for(int i = 0; i < sourcechars.length; i++) {
            if (sourcechars[i] == input && lineschars[i] == '_') {
                correct = true;
            }
        }
        if(correct == true){
            copy = updater(lineschars, sourcechars, input);
            System.out.println("That's right! " + input + " is in the word.");
        } else {
            System.out.println("Sorry, " + input + " isn't in the word");
        }
        return copy;
    }



    public static void main(String[] args){
        int guessCounter = 4;
        String message;
        String answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------- Welcome to Hangman ---------\n");
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
            if(choice == 1){
                for(int k = 0; k < 100; k++){
                    System.out.print("Enter your guess: ");
                    scanner.nextLine();
                    message = scanner.nextLine();
                    while(!message.matches("[A-Za-z]")){
                        System.out.println("Incorrect input.");
                        System.out.print("Enter your guess: ");
                        message = scanner.nextLine();
                    }
                    copy = letterCheck(message.charAt(0), answer, copy);
                    break;
                }
            }
        }

    }
}
