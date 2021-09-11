public class Account {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    // Getter and Setter for account number
    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for bank number

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter and Setter for Customer name


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter and Setter for email


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for phone number


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        double oldBalance = this.balance;
        this.balance+=deposit;
        System.out.println(deposit+" have been deposited into your bank account.\nNew balance is "+this.balance);
    }

    public void withdrawFunds(double withdraw){
        double oldBalance = this.balance;
        this.balance-=withdraw;
        System.out.println(withdraw+" have been withdrawn from your bank account.\nNew balance is "+this.balance);
    }
}