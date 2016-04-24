import java.lang.Exception;
/**
 * A bank account has a balance that can be changed by deposits and withdrawals
 *
 * @author Akhmad Muntako
 * @version 26/02/2016
 */
public abstract class Account {

    // deklarasi variabel
    //private char acctType; //tipe akun
    protected double balance; //
    public String id;  //id akun
    //Customer customer = new Customer();

        /**
     * Construct a bank accout with a given Customer, account type and account
     * amount
     *
     * @param type the acount type
     * @param amount the amount account
     */
    /*
   public Account(Customer customer, double amount,char type)
    {
       customer = customer;
       acctType = type;
       balance = amount ;
       String ID =  customer.getCustomerId() + ""+ type;
    } */

    public String toString() {
        if ( this instanceof Savings && !(this instanceof Investment)) {
            System.out.println("SAVING");
        } else if ( this instanceof LineOfCredit) {
            LineOfCredit l = (LineOfCredit)this;
            System.out.println("Line Of Credit");
            System.out.println("    Credit Balance:   "+ l.getCreditBalance());
            System.out.println("    Monthly Fee   :   "+ l.getMonthlyFee());
        } else if ( this instanceof OverDraftProtect) {
            OverDraftProtect o = (OverDraftProtect)this;
            System.out.println("Overdraft Protection");
            System.out.println("    Monthly Fee   :   "+ o.getMonthlyFee());
        } else if ( this instanceof Investment) {
            System.out.println("Investment");
        }
        System.out.println("    Balance       :   " + balance);
        return "";
    }
    /**
     * Deposits money into the bank account
     *
     * @param amount the amount to deposit
     * @return
     */
    public boolean deposit(double amount) {
        if (amount < 0) {
            return false;
        } else {
            balance = balance + amount;
            return true;
        }

    }

    /**
     * Withdraw money from the bank account
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) throws AmountOverDrawnException {
        if (balance - amount < 0) {    
            throw new AmountOverDrawnException(this);
        } else {
            balance = balance - amount;
            //return true;
        }

    }

    /**
     * Gets the Acount type from account
     *
     * @return the account type
     */
    /*
     public char getAcctType()
     {
     return acctType;
     }
     */
    /**
     * Gets the cuurent balance of theBank Account
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the Account ID from accounts
     *
     * @return accont id
     */
    public String getId() {
        return id;
    }

    /**
     * Set balance
     *
     * @param amount input amount
     */
    public void setBalance(double amount) {
        balance = amount;
    }

    /**
     *
     * Set account type
     *
     * @param type input account type
     */
    /*
     public void setAcctType(char type)
     {
     acctType = acctType;
     }*/
}
