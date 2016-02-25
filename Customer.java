 


/**
 * Write a description of class Customer here.
 * 
 * @author Akhmad Muntako  
 * @version 1.0
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String cityAddress;
    private String dateOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;
    private int custId;
    private int numberOfCurrentAccounts;
    private Account accounts = new Account ();

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        
       
    }

    /**
      
     */
    public Customer(String fname, String lname, String dob)
    {
        firstName = fname;
        lastName = lname;
        dateOfBirth = dob;
        
    }
    
    public Customer(String firstName, String lastName, String dateOfBirth, int custId)
    {
        firstName = firstName;
        lastName = lastName;
        dateOfBirth = dateOfBirth;
        custId = custId;
    }
    
    private String getAddress()
    {
        return streetAddress+","+cityAddress+","+zipOrPostalCode;
    }
    
    public Account getAccount()
    {
        return accounts;
    }
    
    private int getCustomerId()
    {
        return custId;
    }
    
    private String getEmail()
    {
        return email;
    }
    
    public String getName()
    {
        return lastName + "," + firstName;
    }
    
    public int getNumOfAccounts()
    {
        return 0;
    }
    
    private String getPhoneNumber()
    {
        
        return phoneNumber;
    }
    
    private void setAddress(String street, String city, String code)
    {
        this.streetAddress = street;
        this.cityAddress = city;
        this.zipOrPostalCode = code;
        return;
    }
    
    private void setEmail(String emailAddress)
    {
        this.email = emailAddress;
        return;
    }
    
    public void setName(String lname, String fname)
    {
        this.lastName = lname;
        this.firstName = fname;
        return;
    }
    
    private void setPhoneNumber(String phoneNum)
    {
        this.phoneNumber = phoneNum;
        return;
    }
    
     public void setAccount(Account account){
        accounts = account;
    }
}
