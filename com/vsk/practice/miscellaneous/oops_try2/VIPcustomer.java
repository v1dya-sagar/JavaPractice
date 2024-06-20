package com.vsk.practice.miscellaneous.oops_try2;

public class VIPcustomer {
    private String VIPName;
    private double VIPCreditLimit;
    private String VIPEmail;

    public VIPcustomer() {
        this("DefaultName",0.0  ,"default@VIP.com");
    }

    public VIPcustomer(String VIPName, double VIPCreditLimit) {
        this(VIPName,VIPCreditLimit,"default@VIP.com");
    }

    public VIPcustomer(String VIPName, double VIPCreditLimit, String VIPEmail) {
        this.VIPName = VIPName;
        this.VIPCreditLimit = VIPCreditLimit;
        this.VIPEmail = VIPEmail;
    }

    public String getVIPName() {
        return VIPName;
    }

    public double getVIPCreditLimit() {
        return VIPCreditLimit;
    }

    public String getVIPEmail() {
        return VIPEmail;
    }
}
