
/**
 * Write a description of class Savings here.
 *
 * @author Akhmad Muntako
 * @version 24/3/2016
 */
public class Savings extends Account {

    protected double interestEarned;
    protected String ID;

    /**
     * Constructor for objects of class Savings
     */
    public Savings(Customer cust, double amount) {
        super();

        if (amount >= 10) {
            ID = String.valueOf(cust.getCustID());
            balance = amount;
        }
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void withdraw(double amount)throws AmountOverDrawnException {
        //boolean chk = false;
        if (balance - amount >= 10) {
            balance = balance - amount;
            //chk = true;
        }
        //return chk;
        throw new AmountOverDrawnException(this);
    }

    public void addDailyInterest(int days) {
        double f;
        f = Math.pow(((1 + (.03 / 365))), (1 * days));
        interestEarned = (balance * f) - balance;
        balance = balance * f;
    }
}
