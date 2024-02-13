/**Class: Triangle
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#7 in HW)
 * Purpose - calculates the perimeter of the triangle if the
 * user input is valid, otherwise it prints "invalid input".
 */

public class Triangle {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter length of the first side of triangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter length of the second side of triangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter length of the third side of triangle: ");
        int side3 = input.nextInt();
        int perimeter = side1 + side2 + side3;

        if( ((side1 + side2) > side3) && ((side2 + side3) > side1) && ((side3 + side1) > side2)){
            System.out.print("This triangle's perimeter is " + perimeter);
        }
        else{
            System.out.print("Invalid input");
        }
    }
}
