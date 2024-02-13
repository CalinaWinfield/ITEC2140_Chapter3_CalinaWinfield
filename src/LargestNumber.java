/**Class: LargestNumber
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#3 in HW)
 * Purpose - print the largest number from three user-input integers
 */

public class LargestNumber {
    public static void main(String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a number: ");
    int number1 = input.nextInt();
    System.out.print("Enter a second number: ");
    int number2 = input.nextInt();
    System.out.print("Enter a third number: ");
    int number3 = input.nextInt();

    if(number1 > number2 && number1 > number3){
        System.out.print(number1 + " is the largest number of the three.");
    }
    else if(number2 > number1 && number2 > number3){
        System.out.print(number2 + " is the largest number of the three.");
    }
    else{
        System.out.print(number3 + " is the largest number of the three.");
    }
    }
}
