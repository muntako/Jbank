import java.util.Scanner;
import java.io.InputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.*;
import java.math.BigDecimal;
import java.math.MathContext;
import java.io.Console;

/**
 * Class that controlle the bank
 * <p/>
 * import java.util.Scanner;
 * import java.io.InputStream;
 * import java.io.IOException;
 * import java.text.ParseException;
 * import java.util.Date;
 * import java.text.SimpleDateFormat;
 * import java.text.DateFormat;
 * import java.util.Calendar;
 * import java.util.GregorianCalendar;
 * import java.io.*;
 * import java.math.BigDecimal;
 * import java.math.MathContext;
 * import java.io.Console;
 * <p/>
 * /**
 * Class that controlle the bank
 *
 * @author Akhmad Muntako
 * @version 17/3/2016
 */
public class Teller {
    //declaration variable
    public static Customer cus = new Customer();
    //public Account a1 = new Account();
    private Account akun1;
    public String blabla;
    public static double saldo, balance;
    public Customer newCustomer = new Customer();
    public static int Round_Unnecessary;
    private static MathContext mc = new MathContext(8), mc1 = new MathContext(3);
    private static Customer[] customers;

    public Customer createNewCustomer(String fname, String lname, Date DOB) {
        return newCustomer;
    }


    public static final String getHoursOfOperation() throws Exception {

        Console console = System.console();
        Scanner reader = new Scanner(System.in);
        Bank.getHoursOfOperation();
        int max = Bank.getMaxNumOfCustomers();
        int c = 0;
        Customer[] customers = new Customer[max];
        Account[] accounts = new Account[4];

        do {
            System.out.println("Apakah Anda ingin membuat akun Customers?");
            String pilih = reader.next();
            Boolean cek = Bank.addCustomer(cus);
            if (pilih.equals("y") || pilih.equals("Y")) {
                if (c <  customers.length ) {
                String result = Boolean.toString(cek);
                System.out.println(result);
                //read firstname input
                System.out.println("Nama depan:");
                String firstName = reader.next();

                //read lastname input
                System.out.println("Nama belakang:");
                String lastName = reader.next();
                /*
                System.out.println("City Address:");
                String cityAddress = reader.next();

                System.out.println("Street Address:");
                String streetAddress = reader.next();

                System.out.println("email:");
                String email = reader.next();

                System.out.println("Phone number:");
                String phoneNumber = reader.next();
                */

                System.out.println("Date of birth:(dd/mm/yyy)");
                String dateOfBirth = reader.next();
                
                
               for (int i = 0; i < customers.length; i++) {
                 customers[i] = new Customer(firstName, lastName, dateOfBirth);
                 Bank.addCustomer(customers[i]);
                 System.out.println("Customer ditambahkan");
                 c++;
                 accounts[i] = new Account(customers[i],1000,'C');
               }
                    
                   
                } else {
                    System.out.println("Maaf anda tidak dapat menambahkan cutomer lagi");
                    break;
                }
            } else if (pilih.equals("n") || pilih.equals("N")) {
                break;
            } else {
                System.out.println("Maaf pilihan yang anda masukkan salah");
            }

        } while (true);
        System.out.println("###############Data Customer#################");
        for (int i = 0; i < customers.length; i++) {
            System.out.println("Customer " + i);
            System.out.println("Customer ID   :" + customers[i].custId);
            System.out.println("First name    :" + customers[i].firstName);
            System.out.println("Last name     :" + customers[i].lastName);
            System.out.println("Date of Birth :" + customers[i].dateOfBirth);
            System.out.println("Account Balance:" + Account.getBalance());
            System.out.println("Account Type:" + Account.getAcctType());
        }
        System.out.println("#############################################");
        return "terima kasih";

    }


    /**
     * Construct the Teller object
     */
    public Teller() {

    }
}

