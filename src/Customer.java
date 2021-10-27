public class Customer {
    private Account  account;
    private String   firstName;
    private String   lastName;
    private int age;
    public Customer(String f, String l, int cAge) {
        firstName = f;
        lastName = l;
        age = cAge;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Account getAccount() {
        return account;
    }
    public int getAge(){
        return age;
    }
    public void setAccount(Account acct) {
        account = acct;
    }

}

class Account {
    private double   balance;
    public Account(double bal) {
        balance = bal;
    }
    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount) {
        balance = balance + amount;
        return true;
    }
    public boolean withdraw(double amount) {
        boolean result = true;
        if ( balance < amount ) {
            result = false;
        } else {
            balance = balance - amount;
        }
        return result;
    }
}

class TestBanking {
    public static void main(String[] args) {
        Customer customer;
        Account  account;
        // Create an account that can has a 500.00 balance.
        System.out.println("Creating the customer Jane Smith.Age:");
        customer = new Customer("Jane", "Smith",20);
        System.out.println("Creating her account with a 500.00 balance.");
        customer.setAccount(new Account(500.00));
        account = customer.getAccount();
        System.out.println("Her age is:"+customer.getAge());
        // Perform some account transactions
        System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
        System.out.println("Deposit 22.50: " + account.deposit(22.50));
        System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
        System.out.println("Withdraw 400.00: " + account.withdraw(400.00));
        // Print out the final account balance
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }
}
