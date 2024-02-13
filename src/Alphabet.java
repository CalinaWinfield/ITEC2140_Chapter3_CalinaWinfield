import java.util.Random;

/**Class: Alphabet
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 6, 2024
 *
 * (#9 in HW)
 * Purpose - classify a randomly generated alphabet as a consonant
 * or vowel, as well as the first four letters of the alphabet.
 */

public class Alphabet {
    public static void main(String[] args){

        //Pretty much copied from Feb 6th's lecture
        Random ran = new Random();
        int b = 122;
        int a = 65;
        char chRandom = (char)(ran.nextInt(b - a + 1) + a);


        switch(Character.toUpperCase(chRandom)){

            case 'A':
                System.out.println("The alphabet '" + chRandom + "' is in the first four letters.");
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The alphabet '" + chRandom + "' is a vowel.");
                break;
            case 'B':
            case 'C':
            case 'D':
                System.out.println("The alphabet '" + chRandom + "' is in the first four letters.");
            case 'F':
            case 'G':
            case 'H':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                System.out.println("This alphabet '" + chRandom + "' is a consonant.");
                break;
            default:
                System.out.print("The character '" + chRandom + "' is not an alphabet character.");
        }
    }
}