/**
 * A class to describe customers data
 * 
 * @author Akhmad Muntako  
 * @version 10/3/2016
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer
{
    // instance variables 
    private String cityAddress;
    private Date dateOfBirth;
    private String email;
    public static String firstName;
    public static String lastName;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;
    private static int custId;
    private int numberOfCurrentAccounts;
    private Account accounts = new Account ();
    private static final String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String fname, String lname)throws Exception
    {
        this(fname,lname,"none");
        
    }

    public Customer(){}
    
    /**
     *  Constructor for objects of class Customer
     *  @param fname customers firstname
     *  @param lname customers lastname
     *  @param dob customers date of birth (Format dd-mm-yyyy)
     */
    public Customer(String fname, String lname, String dob)throws Exception
    {
        this.firstName = fname;
        this.lastName = lname;
        String date = dob;
        DateFormat df =new SimpleDateFormat("dd-mm-yyyy");  //Date format
        this.dateOfBirth = df.parse(date);//convert string DOB to Date     
        
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
        custId = Bank.getNextID();
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
    public int getCustomerId()
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
     * Gets customers dob
     */
    public Date getDob (){
        return dateOfBirth;
    }
    
    /**
     * Gets customers name
     * @return custumers lastname and firstname
     */
    public String getName()
    {
        return lastName + " " + firstName;
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
    public String getPhoneNumber()
    {
        
        return phoneNumber;
    }
    
    /**
     * 
     * sets customer ID
     * 
     
     
    public void setCustId (int custID){
        custId = custID ;       
    }*/
    
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
    public void setPhoneNumber(String phoneNum)
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
