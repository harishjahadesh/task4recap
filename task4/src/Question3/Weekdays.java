package Question3;

import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day position (0-6): ");
        int dayIndex = scanner.nextInt();

        try {
            System.out.println("Day: " + days[dayIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid day index! Please enter a number between 0 and 6.");
        }
        
        scanner.close();
    }
}
