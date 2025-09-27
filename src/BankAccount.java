public class BankAccount {
    
    private String firstName;
    private String lastName;
    private int age;
    private double balance;

    public BankAccount(String firstName, String lastName, int age, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
    }
    
    public void printDetails() {
        System.out.println("=== BANK ACCOUNT DETAILS ===");
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Age: " + this.age);
        System.out.printf("Balance (USD): $%.2f%n", this.balance);
    }
}