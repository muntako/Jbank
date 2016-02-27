/**
 * A bank account has a balance that 
 * can be changed by deposits and withdrawals
 *  
 * @author Akhmad Muntako
 * @version 26/02/2016
 */
public class Account
{
    // deklarasi variabel
    private char acctType; //tipe akun
    private double balance; //
    private String id;  //id akun

    /**
     * Constructs a bank account with a zero balance
     */
    public Account()
    {
       balance = 0;
       
    }

    /**
     * Construct a bank accout with a given account type and account amount
     * 
     * @param type the acount type 
     * @param amount the amount account
     */
   public Account(char type, double amount)
    {
       
    }
    
    /**
     * Deposits money into the bank account
     * @param amount the amount to deposit
     * @return 
     */
    public boolean deposit(double amount)
    {
        if (amount < 0){
            return false;}
        else {
            balance = balance + amount; 
            return true;
            }
       
    }
    
      /**
     * Withdraw money from the bank account
     * @param amount the amount to withdraw
     */
    public boolean withdraw(double amount)
    {
        if (balance < 0){
            return false;}
        else {
            balance = balance - amount;
            return true;
            }       
       
    }
    
    /**
     *  Gets the Acount type from account
     *  @return the account type
     */
    
    public char getAcctType()
    {
        return acctType;
    }
    
    /**
     * Gets the cuurent balance of theBank Account
     * @return the current balance
     */
    public double getBalance()
    {
         return balance;
    }
    
    
    /**
     * Gets the Account ID from accounts
     * @return accont id
     */
    public String getId()
    {
         return id;
    }
    
    
    /**
     * Set balance 
     * @param amount input amount 
     */
    public void setBalance(double amount)
    {
        balance = amount;
    }
    
    /**
     * Set account ID
     * @param acctId input account ID
     */
    public void setID(String acctId)
    {
        id = acctId;
    }
    
    /**
     * 
     * Set account type
     * @param type input account type
     */
    public void setAcctType(char type)
    {
        acctType = acctType;
    }
     
}
