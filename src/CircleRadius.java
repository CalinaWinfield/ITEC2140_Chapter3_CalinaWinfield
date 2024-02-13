/**Class: CircleRadius
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#2 in HW)
 * Purpose - calculate the area of a circle
 * based on the radius input by the user.
 */

public class CircleRadius {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a radius: ");
        int radius = input.nextInt();
        double area = 3.14 * radius * radius;

        if(radius < 0){
            System.out.print("Invalid Entry, the radius should be positive.");
        }
        else{
            System.out.print("The area of a circle with this radius is " + area);
        }
    }
}
