/**Class: CarInsurance
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#6 in HW)
 * Purpose - to calculate the user's insurance surcharge
 * based on their age and number of accidents.
 */

public class CarInsurance {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your number of accidents: ");
        int accidents = input.nextInt();

        int baseCost = 300;
        int ageCharge = 100;
        int oneAccident = 100;
        int twoAccident = 150;
        int threeAccident = 250;
        int fourMoreAcc = 1000;

        if(age < 27){
            baseCost += ageCharge;
        }

        switch(accidents){
            case 1:
                baseCost += oneAccident;
                break;
            case 2:
                baseCost += twoAccident;
                break;
            case 3:
                baseCost += threeAccident;
                break;
            default:
                if(accidents >= 4){
                    baseCost += fourMoreAcc;
                }
        }
        System.out.println("The cost for your insurance, based on your age and accident record is $" + baseCost);
    }
}
