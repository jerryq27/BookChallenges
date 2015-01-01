package Chapter11;

/**
 * Created by Gerardo on 1/1/2015.
 */
public class SavingsAccount extends BankAccount {

    private boolean isActive; //If over $25 true, under, false.

    public SavingsAccount(double bal, float ann) {
        super(bal, ann);

        if(bal >= 25.00)
            isActive = true;
    }

    public void withdraw(double withdrawAmount) {
        if(getBalance() < 25.00)
            isActive = false;

        if(isActive)
        {
            super.withdraw(withdrawAmount);
        }
    }

    public void deposit(double depositAmount) {
        if(!isActive)
        {
            if(getBalance() + depositAmount >= 25.00)
            {
                isActive = true;
                super.deposit(depositAmount);
            }
        }
        else
            super.deposit(depositAmount);
    }

    public void monthlyProcess() {
        if(getNumOfWithdrawals() > 4)
        {
            setMonthlyServiceCharges(getNumOfWithdrawals() - 4);
        }
        super.monthlyProcess();

        if(getBalance() < 25.00)
            isActive = false;
    }

    public static void main(String[] args) {
        BankAccount acct = new SavingsAccount(20.00, 0.2f);
    }
}