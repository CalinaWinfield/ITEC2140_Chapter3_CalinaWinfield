/**Class: RandomNumber
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#1 in HW)
 * Purpose - to generate a random number
 * and have the user input a guessed number.
 */

public class RandomNumber {
    public static void main(String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);
    int rand = (int)(Math.random() * 11);
    System.out.println("Enter a random number: ");
    int userRand = input.nextInt();

    if(userRand == rand){
        System.out.print("Hooray, you guessed the number!");
    }
    else{
        System.out.print("You Lost! The number was " + rand);
    }
    }
}
