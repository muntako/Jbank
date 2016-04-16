
/**
 * Write a description of class AmountOverDraftException here.
 * 
 * @author Akhmad Muntako 
 * @version 14/4/2016
 */
public class AmountOverDrawnException extends Exception
{
    // instance variables - replace the example below with your own
    private char acctType ;
    private Account account;

    public AmountOverDrawnException(Account a){
        super("Insufficient funds");
        account = a;
    } 
    
    public String getMessage(){
        if(account instanceof Savings){
            return super.getMessage()+" in Saving Account";
        }else if(account instanceof Investment){
            return super.getMessage()+" in Investment Account";
        }else if(account instanceof LineOfCredit){
            return super.getMessage()+" in Line-Of-Credit Account";
        }else
            return super.getMessage()+" in Overdraft Protect Account";
        
    }
}

