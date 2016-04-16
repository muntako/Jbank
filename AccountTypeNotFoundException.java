
/**
 * Write a description of class AccountTypeNotFoundException here.
 * 
 * @author Akhmad Muntako 
 * @version 14/4/2016
 */
public class AccountTypeNotFoundException extends Exception
{
    // instance variables - replace the example below with your own
    private char acctType;

    /**
     * Constructor for objects of class AccountTypeAlreadyExistsException
     */
    public AccountTypeNotFoundException(char type)
    {
        // initialise instance variables
        super("Account does not exist");
        acctType = type;
    }
    
    public String getMessage(){
        switch(acctType){
            case 'S' : return "Savings "+super.getMessage();
            case 'I' : return "Investmet "+super.getMessage();
            case 'O' : return "Overdraft Protection "+super.getMessage();
            case 'C' : return "Line-Of-Credit "+super.getMessage();
        }
        return "";
    }    
}
