package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {

        super(name,balance,0);
        this.rate=rate;
        this.maxWithdrawalLimit=maxWithdrawalLimit;
    }
    public void withdraw(double amount) throws Exception {

        if (amount <= this.maxWithdrawalLimit) {
            super.withdraw(amount);
        }
        else {
            throw new Exception("Maximum Withdraw Limit Exceeded");
        }
    }

    public double getSimpleInterest(int years){

        return  getBalance()*(1+rate/100*years);
    }

    public double getCompoundInterest(int times, int years){

        return   getBalance()*Math.pow((1+(rate/100)/times),(times*years));
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getMaxWithdrawalLimit() {
        return maxWithdrawalLimit;
    }

    public void setMaxWithdrawalLimit(double maxWithdrawalLimit) {
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }
}
