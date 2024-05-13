

/**
 * This class represents the information required to price and register the car model
 */

public class CarRegistration extends CarSelection {
    // Variables
    private double basePrice;
    private double upgradeCoefficient;
    private double colorIndex;
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private String occupation;
    private double yearlyIncome;
    private int customerAge;

    // Static variable
    public static int currentYear = 2024;

    // Constructor
    public CarRegistration(double basePrice, double upgradeCoefficient,
                           double colorIndex, String firstName, String lastName, String gender,
                           int birthYear, String occupation, double yearlyIncome) {
        super();
        this.basePrice = basePrice;
        this.upgradeCoefficient = upgradeCoefficient;
        this.colorIndex = colorIndex;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.occupation = occupation;
        this.yearlyIncome = yearlyIncome;
        this.customerAge = currentYear - birthYear; // Calculate customer's age
    }

    // Getters and setters we use it to access the private variables 
    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getUpgradeCoefficient() {
        return upgradeCoefficient;
    }

    public void setUpgradeCoefficient(double upgradeCoefficient) {
        this.upgradeCoefficient = upgradeCoefficient;
    }

    public double getColorIndex() {
        return colorIndex;
    }

    public void setColorIndex(double colorIndex) {
        this.colorIndex = colorIndex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getYearlyIncome() {
        return yearlyIncome;
    }

    public void setYearlyIncome(double yearlyIncome) {
        this.yearlyIncome = yearlyIncome;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
    

    // Method to check if the customer is pre-approved for car purchase
    public boolean isPreapproved() {
        double twentyPercentYearlyIncome = yearlyIncome * 0.20;
        double affordablePrice = yearlyIncome + twentyPercentYearlyIncome;
        return (basePrice <= affordablePrice);
    }

    // Method to check if the customer is eligible to drive
    public boolean isEligibleToDrive() {
        return (customerAge >= 16);
    }

    // Method to retrieve customer information
 // Method to retrieve customer information
    public String retrieveCustomerInfo() {
        String preApprovalStatus = isPreapproved() ? "Yes" : "No";
        return String.format("Customer Information:%n" +
                "First Name: %s%n" +
                "Last Name: %s%n" +
                "Gender: %s%n" +
                "Age: %d%n" +
                "Birth Year: %d%n" +
                "Occupation: %s%n" +
                "Yearly Income: $%.2f%n" +
                "Base Price for Car: $%.2f%n" +
                "Upgrade Coefficient: %.2f%n" +
                "Color Index: %.2f%n" +
                "Eligible to Drive: %s%n" +
                "Pre-approval Status: %s",
                firstName, lastName, gender, customerAge, birthYear, occupation, yearlyIncome, basePrice,
                upgradeCoefficient, colorIndex, isEligibleToDrive() ? "Yes" : "No", preApprovalStatus);
    }
}
// here i used .Format it's basically work as sysout but it returns the string insted of giving it to console 

