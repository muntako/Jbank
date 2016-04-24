import java.lang.Exception;
/**
 * Kelas Customer adalah kelas untuk membuat objek Customer 
 *
 * @author Akhmad Muntako
 * @version 27/3/2016
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer implements Comparable<Customer>{

    // instance variables 
    private String cityAddress;
    public static Date dateOfBirth;
    private String email;
    public String firstName;
    public String lastName;
    public String streetAddress;
    public static String phoneNumber;
    private String zipOrPostalCode;
    public  static int custId;
    private int indexArrayAccount = 0;
    private int numOfAccounts;
    private static int[] MAX_NUM_OFCUSTOMERS;
    private Account[] accounts = new Account[4];
    private Account a;
    private char type;
    private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * konstruktor kelas Customer
     * @param fname nama depan customer
     * @param lname nama belakang customer
     */
    public Customer(String fname, String lname) throws Exception {
        this(fname, lname, null);

    }

    public Customer() {
    }

    /**
     * konstruktor kelas Customer
     * @param fname nama depan customer
     * @param lname nama belakang customer
     * @param dob tanggal lahir customer (Format dd mm yyyy)
     */
    public Customer(String firstName, String lastName, Date DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = DOB;
        this.custId = Bank.getNextID();
    }
    /*
     public Customer(String fname, String lname, String dob)throws Exception
     {
     this.firstName = fname;
     this.lastName = lname;
     String date = dob;
     DateFormat df =new SimpleDateFormat("dd/mm/yyyy");  //Date format
     this.dateOfBirth = df.parse(date);//convert string DOB to Date     
     this.custId = Bank.getNextID();
     }*/

    /**
     * konstruktor kelas Customer
     * 
     * @param fname nama depan customer
     * @param lname nama belakang customer
     * @param dob tanggal lahir customer 
     * @param custId nomor ID customer
     */
    public Customer(String firstName, String lastName, String dateOfBirth, int custId) {
        firstName = firstName;
        lastName = lastName;
        dateOfBirth = dateOfBirth;
        custId = Bank.getNextID();
    }

    
    /**
     * method untuk mendapatkan alamat customer dengan mengembalikan nilai nama jalan, nama kota, kode pos
     *
     * @return alamat customer (nama jalan, nama kota, kode pos)
     */
    public String getAddress() {
        return streetAddress + "," + cityAddress + "," + zipOrPostalCode;
    }
    
    @Override
    public int compareTo(Customer other){
        return Integer.compare(this.custId, other.custId);
    }
    
    /**
     * method untuk mendapatkan nomor ID dan type account dari objek customer
     *
     * @return accounts
     */
    public Account getAccount(char type) throws AccountTypeNotFoundException {
        Account acct = null;
        for (Account a: accounts ) {
            switch (type) {
                case 'S' :
                    if( (a instanceof Savings) && !(a instanceof Investment) ) {
                        acct = a;
                    }
                    break;
                case 'L' :
                    if(a instanceof LineOfCredit) {
                        acct = a;
                    }
                    break;
                case 'O' :
                    if(a instanceof OverDraftProtect) {
                        acct = a;
                    }
                    break;
                case 'I' : 
                    if(a instanceof Investment) {
                        acct = a;
                    }
                    break;
                default:
                    throw new AccountTypeNotFoundException(type);
            }   
        }
        return acct;
    }

    public boolean removeAccount(char type) {
        Account a = null;
        boolean accountRemoved = false;
        for (int i = 0; i<=3; i++) {
            switch (type) {
                case 'S' : 
                    if ( accounts[i] instanceof Savings && !(accounts[i] instanceof Investment)) {
                        accounts[i] = null;
                        indexArrayAccount--;
                        numOfAccounts--;
                        accountRemoved = true;
                    }
                    break;
                case 'L' : 
                    if ( accounts[i] instanceof LineOfCredit) {
                        accounts[i] = null;
                        indexArrayAccount--;
                        numOfAccounts--;
                        accountRemoved = true;
                    }
                    break;
                case 'O' : 
                    if ( accounts[i] instanceof OverDraftProtect) {
                        accounts[i] = null;
                        indexArrayAccount--;
                        numOfAccounts--;
                        accountRemoved = true;
                    }
                    break;
                case 'I' : 
                    if ( accounts[i] instanceof Investment) {
                        accounts[i] = null;
                        indexArrayAccount--;
                        numOfAccounts--;
                        accountRemoved = true;
                    }
                    break;
            }
            
            if (accounts[i] == null && accountRemoved) {
                if ( i != 3) {
                    a = accounts[i];
                    accounts[i] = accounts [i+1];
                    accounts [i+1] = a;
                }
            }
        }
        return accountRemoved;
    }
    /**
     * method untuk mendapatkan nomor ID customer
     *
     * @return customers ID
     */
    public static int getCustID() {
        return custId;
    }

    /**
     * method untuk mendapatkan info email dari customer
     * @return email customers 
     */
    public String getEmail() {
        return email;
    }

    /**
     * method untuk mendapatkan data tanggal lahir customer
     * @return dateOfBirth tanggal lahir customer
     */
    public Date getDob() {
        return dateOfBirth;
    }

    /**
     * method untuk mendapatkan nama dari customer
     *
     * @return lastname and firstname, nama belakang dan nama depan custumers 
     */
    public String getName() {
        return lastName + " " + firstName;
    }

    /**
     * method untuk mendapatkan jumlah account dari customer
     *
     * @return 0
     */
    public int getNumOfAccounts() {
        return 0;
    }

    /**
     * method untuk mendapatkan nomor telepon customer
     *
     * @return phone number, nomor telepon customer
     */
    public String getPhoneNumber() {

        return phoneNumber;
    }

    /**
     * method untuk meng assign customer ID object customer
     * 
     * @param custID ID customer
     */
    public void setCustId(int custID) {
        custId = custID;
    }

    /**
     * method untuk meng assign alamat dari custom
     *
     * @param street input nama jalan alamat customer
     * @param city input nama kota alamat customer
     * @param zipOrPostalCode input  Posrtal Code customers
     */
    public void setAddress(String street, String city, String code) {
        streetAddress = street;
        cityAddress = city;
        zipOrPostalCode = code;
    }

    /**
     * method untuk meng assign alamat email customer
     *
     * @param emailAddress input email customers 
     */
    public boolean setEmail(String emailAddress) {
        this.email = emailAddress;
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailAddress);
        return matcher.matches();
    }

    /**
     * method untuk meng assign nama customer
     *
     * @param lname input nama belakang customers 
     * @param fname input nama depan customers 
     */
    public void setName(String lname, String fname) {
        lastName = lname;
        firstName = fname;
    }

    /**
     * method untuk meng assign nomor telepon customer
     *
     * @param phoneNum input nomor telepon customers
     */
    public static void setPhoneNumber(String phoneNum) {
        phoneNumber = phoneNum;
    }

    /**
     * method untuk menambahkan account pada object customer
     *
     * @param balance jumlah saldo akun
     * @param type tipe akun customer
     */
    public boolean addAccount(Account acct) throws AccountTypeAlreadyExistsException {
        boolean accountAdded = false, sameType = false;
        int index = -1;
        if ( numOfAccounts < 5 ) {
            for (int i = indexArrayAccount; i < 4; i++) {
                if (accounts[i] == null && index == -1) {
                    index = i;
                } else if (accounts[i] != null ) {
                    if (accounts[i].getClass().equals( acct.getClass() )){
                        sameType = true;
                        
                        if (acct.getClass().equals("Savings")){
                            type = 'S';
                        }else if (acct.getClass().equals("Investment")){
                            type = 'I';
                        }else if (acct.getClass().equals("LineOfCredit")){
                            type = 'L';
                        }else if (acct.getClass().equals("Overdraft")){
                            type = 'O';
                        }
                        throw new AccountTypeAlreadyExistsException(type) ;
                    }
                }
            }
            if (!sameType && index != -1){
                accounts[index] = acct;
                accountAdded = true;
                numOfAccounts++;
                indexArrayAccount++;
            }
        }
        return accountAdded;
    }
    
    public void printAllAccounts() {
        for (Account a : accounts) {
            if (a!=null)
                System.out.println(a);
        }
    }
    
}
