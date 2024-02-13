/**Class: DaysOfWeek
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: February 1, 2024
 *
 * (#5 in HW)
 * Purpose - determines the day of the week
 * based on what number (1-7) the user input.
 */

public class DaysOfWeek {
    public static void main(String[] args){

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a day 1 - 7: ");
        int day = input.nextInt();

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Day " + day + " is a weekday.");
                if(day == 1)
                    System.out.print("Day " + day + " is Monday.");
                else if(day == 2)
                    System.out.print("Day " + day + " is Tuesday.");
                else if(day == 3)
                    System.out.print("Day " + day + " is Wednesday.");
                else if(day == 4)
                    System.out.print("Day " + day + " is Thursday.");
                else
                    System.out.print("Day " + day + " is Friday!");
                break;
            case 6:
            case 7:
                System.out.println("Day " + day + " is a weekend.");
                if(day == 6)
                    System.out.print("Day " + day + " is Saturday!");
                else
                    System.out.print("Day " + day + " is Sunday.");
                break;
            default:
                System.out.print("Invalid day.");
        }
    }
}
