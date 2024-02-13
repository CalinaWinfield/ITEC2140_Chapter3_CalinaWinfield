import java.util.Scanner;

/**Class: ThreeAndFive
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#4 in HW)
 * Purpose - to check if user-input number
 * is divisible by 3, 5, both, or neither.
 */

public class ThreeAndFive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if((number % 3 == 0) ^ (number % 5 == 0)){
            System.out.println(number + " is a multiple of either 3 or 5, but not both.");
            if(number % 3 == 0){
                System.out.print("To specify, " + number + " is a multiple of 3.");
            }
            else if(number % 5 == 0){
                System.out.print("To specify, " + number + " is a multiple of 5.");
            }
        }
        else if((number % 3 == 0) && (number % 5 == 0)){
            System.out.print(number + " is a multiple of both 3 and 5.");
        }
        else{
            System.out.print(number + " is NOT a multiple of either 3 or 5.");
        }
    }
}
