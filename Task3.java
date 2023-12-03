import java.util.Scanner;

public class  Task3{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // User authentication
        System.out.println("Enter card number: ");
        String cardNumber = scanner.nextLine();

        System.out.println("Enter PIN: ");
        int pin = scanner.nextInt();

        if (validateCredentials(cardNumber, pin)) {
            System.out.println("Login successful. Welcome to the ATM.");

            // Transaction processing
            displayMainMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawCash();
                    break;
                case 3:
                    depositCash();
                    break;
                case 4:
                    transferFunds();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } else {
            System.out.println("Invalid card number or PIN. Please try again.");
        }
    }

    private static boolean validateCredentials(String cardNumber, int pin) {
        // Simulate user authentication using a predefined set of credentials
        String validCardNumber = "1234567890";
        int validPin = 1234;

        return cardNumber.equals(validCardNumber) && pin == validPin;
    }

    private static void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Transfer Funds");
        System.out.print("Enter your choice: ");
    }

    private static void checkBalance() {
        // Simulate checking account balance
        System.out.println("Your current balance is: $500.00");
    }

    private static void withdrawCash() {
        System.out.println("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        // Simulate checking withdrawal limit and updating balance
        if (amount > 500.00) {
            System.out.println("Withdrawal amount exceeds limit. Please enter a smaller amount.");
        } else {
            System.out.println("Your balance has been updated to: $" + (500.00 - amount));
        }
    }

    private static void depositCash() {
        System.out.println("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        // Simulate updating account balance
        System.out.println("Your balance has been updated to: $" + (500.00 + amount));
    }

    private static void transferFunds() {
        System.out.println("Enter recipient's account number: ");
        String recipientAccountNumber = scanner.nextLine();

        System.out.println("Enter transfer amount: ");
        double amount = scanner.nextDouble();

        // Simulate validating account number and updating balances
        if (!isValidAccountNumber(recipientAccountNumber)) {
            System.out.println("Invalid recipient account number. Please try again.");
        } else {
            System.out.println("Your balance has been updated to: $" + (500.00 - amount));
            System.out.println("The amount of $" + amount + " has been transferred to account number: " + recipientAccountNumber);
        }
    }

    private static boolean isValidAccountNumber(String accountNumber) {
        // Simulate validating account number (e.g., length, format)
        return accountNumber.length() == 10 && accountNumber.startsWith("1");
    }
}
