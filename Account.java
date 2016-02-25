 


/**
 * Account Class
 * 
 * @author Akhmad Muntako
 * @version 1.0
 */
public class Account
{
    // deklarasi variabel
    private char acctType;
    private double balance;
    private String id;

    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
       
    }

    /**
     * method untuk membuat account
     * 
     * @type 
     * @amount
     */
   public Account(char type, double amount)
    {
        
    }
    
    private void deposit(double amount)
    {
        
       
    }
    
    public char getAcctType()
    {
        return acctType;
    }
    
    public double getBalance()
    {
         return balance;
    }
    
    public String getId()
    {
         return id;
    }
    
    public void setBalance(double amount)
    {
       this.balance = amount;
       return;
    }
    
    public void setID(String acctId)
    {
        this.id = acctId;
        return;
    }
    
    public void setAcctType()
    {
        this.acctType = acctType;
        return;
    }
    
    private void withdraw(double amount)
    {
        return;
    }
}
