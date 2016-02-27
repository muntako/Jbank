/**
 * A class to control 
 * 
 * @author Akhmad Muntako
 * @version 27/2/2016
 */
public class Bank
{
    // dekralari variabel
    private static double creditInterestRate;
    private static double investmentInterestRate;
    private static double premiumInterestRate;
    private static int lastCustID = 1000;
    private static int nextCustID = 1000;
    private static int numOfCurrentCustomer;
    private static int nextID ;
    private static String closeTime;
    private static String phone;
    private static String startTime;
    public static String website;
    public static String bankName = "JBANK";
    public static String bankAddress = "1234 JavaStreet, AnyCity, ThisState, 34567";
    public static int maxNumOfCustomers = 20;
    

    /**
     * Constructor for objects of class Bank
     * @return 
     */
    public static String getAdress()
    {
        
       return bankAddress;
    }

    /**
     * Gets current credits rate
     * @return 0
     */
    public static double getCreditRate()
    {
        return 0;
    }
    
    /**
     * Gets current investment rate
     * return 0
     */
    public static double getInvestmentRate()
    {
        return 0;
    }
    
    /**
     * Gets hours of opration the bank
     * @return ""
     */
    public static String getHoursOfOperation()
    {
        return "";
    }
    
    /**
     * Gets customers last ID to identify customers account type
     * @return 0
     */
    public static int getLastID()
    {
        return 0;
    }
    
    /**
     * Gets max customers
     * @return 0
     */
    public static int getMaxCustomers()
    {
        return 0;
    }
    
    /**
     * Gets current customers number
     * @return current customers number
     */
    public static int getNumOfCurrentCustomers(){
        return numOfCurrentCustomer;
    }
    
    /**
     * Get customers name
     * 
     * @return ""
     */
    public static String getName()
    {
        return "";
    }
    
    /**
     * Gets Customers next ID
     * @return 0
     */
    public static int getNextID()
    {
        nextCustID = lastCustID + 1;
        return nextCustID;
    }
    
    /**
     * Gets banks website
     * @return ""
     */
    public static String getWebsite()
    {
        return "";
    }
    
    /**
     * Gets premium rate 
     * @return 0
     */
    public static double getPremiumRate()
    {
        return 0;
    }
    
    /**
     * Gets Customers phone numbers
     * return ""
     */
    public static String getPhone()
    {
        return "";
    }
    
    /**
     * Set Credit rate
     * @param rate input rate of credit
     */
    public static void setCreditRate(double rate)
    {
        
    }
    
    /**
     * set investment rate
     * @param rate input rate of investment
     */
    public static void setInvestmentRate(double rate)
    {
        
    }
    
    /**
     * set premium rate
     * @param rate input rate of premium
     */
    public static void setPremium(double rate)
    {
        
    }
}
