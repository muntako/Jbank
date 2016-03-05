/**
 * A class to control 
 * 
 * @author Akhmad Muntako
 * @version 3/3/2016
 */
public class Bank
{
    // dekralari variabel
    private static double creditInterestRate;
    private static double investmentInterestRate;
    private static double premiumInterestRate;
    private static int lastCustID ;
    private static int nextCustID ;
    private static int numOfCurrentCustomer;
    private static int nextID ;
    private static String closeTime;
    private static String phone;
    private static String startTime;
    public static String website;
    public static String BANK_NAME = "JBANK";
    public static String BANK_ADDRESS = "1234 JavaStreet, AnyCity, ThisState, 34567";
    public static int maxNumOfCustomers = 20; 
    
    
    /**
     * Construct bank object
     */
    public Bank (){
        
    }
    
    /**
     * Constructor for objects of class Bank
     * @return bankAddress address bank
     
    public static String getAdress()
    {
        return bankAddress;
    }
    */
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
        if (lastCustID != 0){
            if (nextCustID == 0){
                return lastCustID;
            }else {
                lastCustID = nextCustID; 
            }
        }else {
            lastCustID = 0;
        }
        return lastCustID;
    }
   
    
    /**
     * Gets max customers
     * @return maxNumOfCustomers maximal customer number
     
    public static int getMaxCustomers()
    {
        return maxNumOfCustomers;
    }
    */
        
    /**
     * Get bank name
     * 
     * @return BANK_NAME bank name
     
    public static String getName()
    {
        return BANK_NAME;
    }
    */
    
    /**
     * Gets current customers number
     * @return numOfCurrentCustomer current customers number
     */
    public static int getNumOfCurrentCostumers(){
       return numOfCurrentCustomer;
    }
    
    /**
     * Gets Customers next ID
     * @return nextCustID
     */
    public static int getNextID()
    {
        if (nextCustID == 0){
            nextCustID = 1000 ; //1000 is first customers ID 
            lastCustID = 1000 ;
            numOfCurrentCustomer ++;                        
        }
        else if (numOfCurrentCustomer == maxNumOfCustomers)
        {
            nextCustID = 0;            
        }
        else {
            lastCustID = nextCustID ; // 
            nextCustID ++;
            numOfCurrentCustomer++;            
        }
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
