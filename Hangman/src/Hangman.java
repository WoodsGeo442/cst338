/**
 * Author: Geoffrey Woods
 * Title: Hangman.java
 * Date: 2/21/2020
 * Abstract: This program is meant to function as a game of hangman.  If you guess wrong, you get an incorrect guess taken off, but if you get it right, you keep a guess.  you can ask for a hint, but it will take a guess away.  If an input is not the correct type, you will simply have to retype your input.
 */

import java.util.InputMismatchException;
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
            if(inputnew[i] == ' '){
                inputnew[i] = '#';
            }
            System.out.print(inputnew[i] + " ");
        }
    }



    public static String letterCheck(char input, String source, String copy){
        char[] sourcechars = source.toCharArray();
        char[] lineschars = copy.toCharArray();
        boolean correct = false;
        boolean samecheck = false;

        for(int i = 0; i < sourcechars.length; i++) {
            if (sourcechars[i] == input && lineschars[i] == '_') {
                correct = true;
            }
            if (sourcechars[i] == input && lineschars[i] != '_') {
                samecheck = true;
            }
        }
        if(correct == true){
            copy = updater(lineschars, sourcechars, input);
            System.out.println("That's right! " + input + " is in the word.");
        } else if(samecheck == true){
            copy = updater(lineschars, sourcechars, input);
            System.out.println("Not valid input. You already guessed " + input + "." );
        } else {
            copy = updater(lineschars, sourcechars, input);
            System.out.println("Sorry, " + input + " isn't in the word");
        }
        return copy;
    }

    public static String hintPrint(char input, String source, String copy){
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
        } else {
            copy = updater(lineschars, sourcechars, input);
        }
        return copy;
    }

    public static boolean correctCheck(char input, String source, String copy){
        char[] sourcechars = source.toCharArray();

        for(int i = 0; i < sourcechars.length; i++) {
            if (sourcechars[i] == input) {
                return true;
            }
        }
        return false;

    }

    public static boolean complete(String copy){
        char[] lineschars = copy.toCharArray();
        for(int i = 0; i < lineschars.length; i++){
            if(lineschars[i] == '_'){
                return false;
            }
        }
        return true;
    }

    public static char giveHint(String source, String copy){
        char[] sourcechars = source.toCharArray();
        char[] copychars = copy.toCharArray();
        char error = '$';
        for(int i = 0; i < sourcechars.length; i++){
            if(copychars[i] == '_'){
                char hint = sourcechars[i];
                return hint;
            }
        }
        return error;
    }

    public static void main(String[] args){
        int guessCounter = 4;
        String message;
        String answer;
        char[] trackguesses = new char[100];
        int guesses = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------- Welcome to Hangman ---------\n");
        System.out.print("Enter a word: ");
        answer = scanner.nextLine();
        String copy = guessName(answer);
        for(int i = guessCounter; i > 0; i--) {
            int choice = 0;

            System.out.print("\nSo far, the word is: ");
            display(copy);
            System.out.println("\nYou have " + i + " incorrect guesses left.");
            System.out.print("Enter either 1 for guessing or 2 for hint: ");


            boolean success = false;
            do{
                try{
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    if(choice == 1 || choice == 2)
                        success = true;
                    else {
                        System.out.println("Incorrect Input");
                        System.out.print("Enter either 1 for guessing or 2 for hint: ");
                    }
                }
                catch(InputMismatchException e){
                    System.out.println("Incorrect Input");
                    System.out.print("Enter either 1 for guessing or 2 for hint: ");
                    scanner.nextLine();
                }
            }while(!success);

            if (choice == 1) {
                for (int k = 0; k < 100; k++) {
                    System.out.print("Enter your guess: ");
                    message = scanner.nextLine();

                    while (!message.matches("[A-Za-z]")) {
                        System.out.println("Incorrect input.");
                        System.out.print("Enter your guess: ");
                        message = scanner.nextLine();
                    }
                    copy = letterCheck(message.charAt(0), answer, copy);
                    trackguesses[guesses] = message.charAt(0);
                    guesses++;
                    if (correctCheck(message.charAt(0), answer, copy) == true) {
                        i++;
                    }

                    break;
                }
            } else if (choice == 2) {
                char hint = giveHint(answer, copy);
                copy = hintPrint(hint, answer, copy);
                System.out.print("OK! The hint is " + hint);
                System.out.println("\nBut since you used the hint, you can guess " + (i-1) + " more times.\n");
            }
            if(complete(copy)){
                System.out.print("\nCongratulations! The word was ");
                display(answer);
                break;
            }

        }
        if(!complete(copy)){
            System.out.print("\nYou failed. The word was ");
            display(answer);
        }
    }
}
