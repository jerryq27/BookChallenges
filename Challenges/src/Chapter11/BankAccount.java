package Chapter11;

/**
 * Created by Gerardo on 1/1/2015.
 */
public abstract class BankAccount {

    private double balance;
    private byte numOfDeposits = 0;
    private byte numOfWithdrawals = 0;
    private float annualInterestRate;
    private float monthlyServiceCharges;

    public BankAccount(double bal, float ann) {
        balance = bal;
        annualInterestRate = ann;
    }

    public void deposit(double depositAmount) {
        numOfDeposits++;

        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        numOfWithdrawals++;

        balance -= withdrawAmount;
    }

    public void calcInterest() {
        float monthlyRate = annualInterestRate/12;
        double interestAmount = balance * monthlyRate;

        balance += interestAmount;
    }

    public void monthlyProcess() {
        balance -= monthlyServiceCharges;
        calcInterest();

        numOfWithdrawals = 0;
        numOfDeposits = 0;
        monthlyServiceCharges = 0;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public byte getNumOfDeposits() {
        return numOfDeposits;
    }

    public void setNumOfDeposits(byte numOfDeposits) {
        this.numOfDeposits = numOfDeposits;
    }

    public byte getNumOfWithdrawals() {
        return numOfWithdrawals;
    }

    public void setNumOfWithdrawals(byte numOfWithdrawals) {
        this.numOfWithdrawals = numOfWithdrawals;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    public void setMonthlyServiceCharges(float monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }
}