
/**
 * Write a description of class AccountTypeAlreadyExistsException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AccountTypeAlreadyExistsException extends Exception
{
    // instance variables - replace the example below with your own
    private char acctType;

    /**
     * Constructor for objects of class AccountTypeAlreadyExistsException
     */
    public AccountTypeAlreadyExistsException(char type)
    {
        // initialise instance variables
        super("Unable to create duplicate account of type");
        acctType = type;
    }
    
    public String getMessage(){
        switch(acctType){
            case 'S' : return super.getMessage()+" Savings";
            case 'I' :  return super.getMessage()+" Investmet";
            case 'O' :  return super.getMessage()+" Overdraft Protection";
            case 'C' :  return super.getMessage()+" Line-Of-Credit";
        }
        return "";
    }    
}
