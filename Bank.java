import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    private static Date closeTime;
    private static Date startTime;
    private static String phone;
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
        SimpleDateFormat startclose = new SimpleDateFormat ("h:m a");
        Calendar start = new GregorianCalendar();
                start.set(Calendar.HOUR_OF_DAY,8);
                start.set(Calendar.MINUTE, 0);
                Date startTime = start.getTime();
                Calendar close = new GregorianCalendar();
                close.set(Calendar.HOUR_OF_DAY, 17);
                close.set(Calendar.MINUTE, 0);
                Date closeTime = close.getTime();
        return startclose.format(startTime) + " to " + startclose.format(closeTime);        
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
   
    public static Date getStartTime (){
        return startTime;
    }
    
    public static Date getCloseTime (){
        return closeTime;
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
     * Sets Bank Start Time 
     */
    public static void setStartTime( int hour, int min){
        startTime = new GregorianCalendar (0,0,0, hour , min).getTime();
    }
    
    /**
     * Sets Bank Close Time 
     */
    public static void setCloseTime( int hour, int min){
        closeTime = new GregorianCalendar (0,0,0, hour , min).getTime();
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
