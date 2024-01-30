package com.vsk.practice.oops;

public class BankAccountChallenge {
    private String Number;
    private double balance;
    private String customerPhoneNumber;
    private String customerName;
    private String customerEmailAddress;

    public BankAccountChallenge(){
        this("000000",0.00,"0000000000",
                "XXXXXXXXX","aaaa@b.ccc");
        System.out.println("Empty Bank Account Constructor");
    }


    public BankAccountChallenge(String Number, double balance, String customerPhoneNumber , String customerName,
                                String customerEmailAddress){
        System.out.println("Bank Account Original!");
        this.Number = Number;
        this.balance = balance;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+ depositAmount + " made. New balance is "+ this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("Only " + balance + " available, Withdrawal not Processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "  + withdrawalAmount + " Processed . Remaining balance " + this.balance);
        }
    }

    public String getNumber() {
        return this.Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }




}
