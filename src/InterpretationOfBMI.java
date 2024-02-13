/**Class: InterpretationOfBMI
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#8 in HW)
 * Purpose - to calculate the user's BMI and BMI interpretation
 * based on the weight and height they input (which were
 * converted from pounds to kilograms and inches to meters).
 */

public class InterpretationOfBMI {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        int pounds = input.nextInt();
        System.out.print("Enter your height in inches: ");
        int inchHeight = input.nextInt();

        double KGS_PER_LB = 0.4536;
        double kilograms = pounds * KGS_PER_LB;
        System.out.println(pounds + " pounds = " + kilograms + " kilograms");
        double M_PER_INCH = 0.0254;
        double meters = inchHeight * M_PER_INCH;
        System.out.println(inchHeight + " inches = " + meters + " meters");

        double BMI = kilograms / (meters * meters);
        System.out.printf("Your BMI is %.1f",BMI);

        if(BMI < 18.5){
            System.out.print(", which is Underweight");
        }
        else if(BMI >= 18.5 && BMI < 25.0){
            System.out.print(", which is Normal.");
        }
        else if(BMI >= 25.0 && BMI < 30.0){
            System.out.print(", which is Overweight.");
        }
        else{
            System.out.print(", which is Obese.");
        }
    }
}
