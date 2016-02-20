 


/**
 * Write a description of class Customer here.
 * 
 * @author Akhmad Muntako  
 * @version 1.0
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String cityAddress, dateOfBirth, email, firstName, lastName, streetAddress, phoneNumber, zipOrPostalCode;
    private int custId, numberOfCurrentAccounts;
    private Account accounts = new Account ();

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Customer(String fname, String lname, String dob)
    {
        
    }
    
    public Customer(String firstName, String lastName, String dateOfBirth, int custId)
    {
        
    }
    
    private String getAddress()
    {
        return "";
    }
    
    public Account getAccount()
    {
        return accounts;
    }
    
    private int getCustomerId()
    {
        return 0;
    }
    
    private String getEmail()
    {
        return "";
    }
    
    private String getCustomerName()
    {
        return "";
    }
    
    public int getNumOfAccounts()
    {
        return 0;
    }
    
    private String getPhoneNumber()
    {
        return "";
    }
    
    private void setAddress(String street, String city, String code)
    {
        return;
    }
    
    private void setEmail(String emailAddress)
    {
        return;
    }
    
    private void setCustomerName(String lname, String fname)
    {
        return;
    }
    
    private void setPhoneNumber(String phoneNum)
    {
        return;
    }
}
