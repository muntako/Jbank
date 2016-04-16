import java.util.*;
/**
 * Write a description of class Investment here.
 * 
 * @author Akhmad Muntako 
 * @version (a version number or a date)
 */
public final class Investment extends Savings
{
    private Date startDate;
    private Date endDate;
    private double interestRate;
    private int term;
    
    public Investment(Customer cust, double amount, int months)
    {
        super(cust, amount);
        if(amount >= 100){
            balance = amount;
        }
        
        if(months >= 6) {
            term = months;
        }
        else {
            term = 6;
        }
        
        Calendar s = new GregorianCalendar();
        
        startDate = s.getTime();
        s.add(Calendar.MONTH, term);
        endDate = s.getTime();
        
        if(term > 0 || term <= 6) {
            interestRate = .05;
        }
        else if(term > 6 || term <= 12) {
            interestRate = .06;
        }
        else if(term > 12) {
            interestRate = .07;
        }
    }
    
    @Override
    public void addDailyInterest(int days)
    {
        double f;
        f = Math.pow(((1 + (interestRate/365))), (1 * days));
        interestEarned = (balance * f) - balance;
        balance = balance * f;
    }
    
    @Override
    public void withdraw(double amount)
    {
        boolean check = false;
        if(amount > balance) {
            check = false;
        }
        else if(Calendar.getInstance().before(endDate)) {
            check = false;
        }
        else if(amount > balance - (balance * (20/100))) {
            check = false;
        }
        else {
            balance = balance - (balance * (20/100)) - amount;
            check = true;
        }
        //return check;
    }
}
