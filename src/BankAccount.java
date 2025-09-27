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

        public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}