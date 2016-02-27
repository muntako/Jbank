/**
 * A class to describe customers data
 * 
 * @author Akhmad Muntako  
 * @version 27/2/2016
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer
{
    // instance variables 
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
    private static final String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        
       
    }

    /**
     *  Constructor for objects of class Customer
     *  @param fname customers firstname
     *  @param lname customers lastname
     *  @param dob customers date of birth
     */
    public Customer(String fname, String lname, String dob)
    {
        firstName = fname;
        lastName = lname;
        dateOfBirth = dob;
        
    }
    
    /**
     * Constructor for objects of class Customer
     *  @param fname customers firstname
     *  @param lname customers lastname
     *  @param dob customers date of birth
     *  @param cusrId customers ID
     */
    public Customer(String firstName, String lastName, String dateOfBirth, int custId)
    {
        firstName = firstName;
        lastName = lastName;
        dateOfBirth = dateOfBirth;
        custId = custId;
    }
    
    /**
     * Gets the customers address
     * @return the customers address
     */
    private String getAddress()
    {
        return streetAddress + "," + cityAddress + "," + zipOrPostalCode;
    }
    
    /**
     * Gets the Account 
     * @return accounts 
     */
    public Account getAccount()
    {
        return accounts;
    }
    
    /**
     * Gets customers ID
     * @return customers ID
     */
    private int getCustomerId()
    {
        return custId;
    }
    
    /**
     * Gets customers email
     * return customers email
     */
    public String getEmail()
    {
        
        return email;
    }
    
    /**
     * Gets customers name
     * @return custumers lastname and firstname
     */
    public String getName()
    {
        return lastName + "," + firstName;
    }
    
    /**
     * Gets number of Account
     * @return 0
     */
    public int getNumOfAccounts()
    {
        return 0;
    }
    
    /**
     * Gets customers phone number
     * @return phone number
     */
    private String getPhoneNumber()
    {
        
        return phoneNumber;
    }
    
    /**
     * Set customers address
     * @param street input customers street address
     * @param city input customers city address
     * @param zipOrPostalCode input customers Posrtal Code
     */
    private void setAddress(String street, String city, String code)
    {
        streetAddress = street;
        cityAddress = city;
        zipOrPostalCode = code;
    }
    
    /**
     * Set customers email address
     * @param emailAddress input customers email address
     */
    public boolean setEmail(String emailAddress)
    {
      this.email = emailAddress;
                
      Pattern pattern = Pattern.compile(EMAIL_PATTERN);
      Matcher matcher = pattern.matcher(emailAddress);
      return matcher.matches();
     }
      
    /**
     * Set customers name
     * @param lname input customers last name
     * @param fname input customers first name
     */
    public void setName(String lname, String fname)
    {
        lastName = lname;
        firstName = fname;
    }
    
    /**
     * set customers phone number
     * @param phoneNum input customers phone number
     */
    private void setPhoneNumber(String phoneNum)
    {
        phoneNumber = phoneNum;
    }
    
    /**
     * Set customers Account
     * @param account input customers account from class account
     */
     public void setAccount(Account account){
        accounts = account;
    }
  
}
