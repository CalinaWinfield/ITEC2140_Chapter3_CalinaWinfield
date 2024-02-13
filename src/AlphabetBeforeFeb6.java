/**Class: AlphabetBeforeFeb6
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#9 in HW)
 * Purpose - classify a randomly generated alphabet as a consonant
 * or vowel, as well as the first four letters of the alphabet.
 * (This is how I did it before we were taught how to properly do it in Feb 6th's lecture.)
 */

public class AlphabetBeforeFeb6 {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a character: ");
        String letter = input.next();



        switch (letter){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("The alphabet '" + letter + "' is a vowel.");
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "X":
            case "Y":
            case "Z":
                System.out.println("The alphabet '" + letter + "' is a consonant.");
                break;
            default:
                System.out.print("Invalid alphabet character.");
        }

        switch (letter){
            case "a":
            case "b":
            case "c":
            case "d":
            case "A":
            case "B":
            case "C":
            case "D":
                System.out.print("The alphabet '" + letter + "' is in the first four letters.");
        }
    }
}