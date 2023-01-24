import java.time.LocalDate;

public class BankAccount {

    //    Create a BankAccount class which has a firstName, lastName, dateOfBirth (you may wish to investigate LocalDate, although a String would be fine), accountNumber and balance (which should start at 0).
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private int accountNumber;
        private int balance;


    public void BankAccount (String inputFirstName, String inputLastName, LocalDate inputDateOfBirth, int inputAccountNumber) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.balance = 0;
        this.accountNumber = inputAccountNumber;

    }


    //    Write and test getters and setters for all these properties.

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getLocalDate(){
        return dateOfBirth;
    }

    public void setLocalDate(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    // Create a method called deposit() that takes in an amount updates the balance of the BankAccount.

    public void deposit(double amount) {
        this.balance += amount;
    }
    //    Create a method called withdrawal() that takes in an amount and updates the balance of the BankAccount.

    public void withdrawal(double amount){
        this.balance -= amount;
    }

    //    Ensure you have tests for both these methods.


    //    provide a method to allow the account to pay interest

    public void payInterest(double rate){
       double interest = this.balance *= rate;
       this.balance += interest;

    }



}
