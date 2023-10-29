import java.util.Scanner;

public class umurr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Enter your birth day (1-30): ");
        int birthDay = scanner.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter current month (1-12): ");
        int currentMonth = scanner.nextInt();
        System.out.print("Enter current day (1-30): ");
        int currentDay = scanner.nextInt();

        int years = currentYear - birthYear;
        int months = currentMonth - birthMonth;
        int days = currentDay - birthDay;

        if (days < 0) {
            days += 30; // Assuming each month has 30 days
            months--;
        }

        if (months < 0) {
            months += 12; // Assuming 1 year has 12 months
            years--;
        }

        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
    }
}