
import java.util.Scanner;

public class CarRegistrationTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for customer data
        System.out.println("Enter customer details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Birth Year: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String gender;
        do {
            System.out.print("Gender (m/f): ");
            gender = scanner.nextLine();
        } while (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f"));

        System.out.print("Yearly Income: ");
        double yearlyIncome = scanner.nextDouble();
        System.out.print("Occupation: ");
        String occupation = scanner.next();
        System.out.print("Base Price for Car: ");
        double basePrice = scanner.nextDouble();
        System.out.print("Car Upgrade Coefficient: ");
        double upgradeCoefficient = scanner.nextDouble();
        System.out.print("Car Color Index (1-5, with 1 and 2 being premium): ");
        double colorIndex = scanner.nextDouble();

        // Create CarRegistration object
        CarRegistration customer = new CarRegistration(basePrice, upgradeCoefficient, colorIndex, firstName, lastName, gender, birthYear, occupation, yearlyIncome);

        // Display customer information
        System.out.println(customer.retrieveCustomerInfo());

        scanner.close(); // Close the scanner
    }
}