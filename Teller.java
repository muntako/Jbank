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

/**
 * Class that controlle the bank
 * 
 * @author Akhmad Muntako
 * @version 3/3/2016
 */
public class Teller
{
    //declaration variable
    public static Customer c1 = new Customer();
    public Account a1 = new Account();
    private Account akun1;
    public String blabla;
    public static double saldo, balance;
    public Customer newCustomer = new Customer ();
    public static int Round_Unnecessary ;
    private static MathContext mc = new MathContext(8), mc1 = new MathContext(3);
    
    
    public Customer  createNewCustomer ( String fname, String lname, Date DOB){
        return newCustomer;
    }
        
    /**
     * main 
     */
    public static void main(String[] args) throws Exception{
        /**
         * c1.setName("Sanadhi","Sutandi");
            blabla = c1.getName();
            a1.setBalance (1000000);
            c1.setAccount(a1);
            akun1=c1.getAccount();
            balance=akun1.getBalance();
            System.out.println(balance);
            System.out.println(blabla);
         */
        Account a1;
        String firstName;
        String lastName;
        String dob;
        String phoneNumber;
        char acctType;
        String NextID;
        int custID;
        String pilih;
        BigDecimal bunga;
        Scanner reader = new Scanner(System.in);

        System.out.println("Selamat Datang di JBANK");
        System.out.println("Apakah Anda ingin membuat akun nasabah?(y/n)");
        pilih = reader.next();
        do {        
            if ( pilih.equals("y") || pilih.equals("Y")){
                //read firstname input
                System.out.println("Nama depan: ");
                firstName = reader.next();
                //read lastname input
                System.out.println("Nama belakang:");
                lastName = reader.next();
                //read dob input
                System.out.println("Tanggal lahir: (DDMMYYYY)");
                dob = reader.next();
                //read date input by type
                int day = Integer.parseInt(dob.substring (0,2));
                int month = Integer.parseInt(dob.substring (2,4))-1;
                int year = Integer.parseInt(dob.substring (4,8));
                //make GregorianCalendar with format 
                Date date = new GregorianCalendar(year, month, day).getTime();
                DateFormat df =new SimpleDateFormat("dd-mm-yyyy");
                //read telephone input
                System.out.println("Nomor Telepon:");
                phoneNumber = reader.next();
                //create account
                c1.setName(firstName,lastName);
                c1.setPhoneNumber(phoneNumber);                    
                
                //set customers id 
                custID = new Bank().getNextID();
                    do{
                //choose customers ID
                    System.out.print("Pilih jenis akun (S, O, I, C, N): ");
                    System.out.print("\nS = Saving \nO = Overdraft\nI = Investment\nC = Credit Cecking\nN = Tidak membuat akun\n");
                    String input = reader.next();
                        //read input condition
                    if (input.equals("n") || input.equals("N") ){
                        //user didn't make a account
                        System.out.print("Anda memilih tidak membuat akun\n");  
                        System.out.print("Terima kasih atas kedatangannya");
                    }
                    else if(input.equals("s") || input.equals("o") || input.equals("i") || input.equals("S") || input.equals("O") || input.equals("I") ){
                        acctType = input.charAt(0);
                        do {
                            //set user balance
                            System.out.print("Masukkan nilai balance: ");
                            int balanc = reader.nextInt();
                            if (balanc<=0) {
                                System.out.println("Balance tidak boleh negatif");
                            } 
                            else {
                                balance = balanc;
                                break;
                            }
                        } while(true);
                        
                        if (c1 != null) {
                            c1.setAccount(new Account(acctType,balance));
                            c1.getAccount().setID(String.valueOf(acctType));
                        }
                    }
                    else {
                       System.out.print("Input Tidak Sesuai"); 
                    }
                   }while (false);
                    Bank bank = new Bank();

                   Account saving = new Account('S',1000.00);//Saving Account with balance USD 1000.00
                   Account invest = new Account('I',1000.00);//Investment Account with balance USD 1000.00
                   Account creditline = new Account('C',500.00);//Line of Credit Account with balance USD 500.00
                   
                                     
                   //BigDecimal savingInterest = new Bigdecimal 
                   
                   BigDecimal savingBal = new BigDecimal(saving.getBalance());
                   BigDecimal investBal = new BigDecimal(invest.getBalance());
                   BigDecimal creditBal = new BigDecimal(creditline.getBalance());
                   
                   BigDecimal bal = new BigDecimal(balance);
                   BigDecimal n = new BigDecimal(360.0);
                   BigDecimal t = new BigDecimal (1.0);
                   BigDecimal savingRate = new BigDecimal(.03);
                   BigDecimal investRate = new BigDecimal(.07);
                   BigDecimal creditRate = new BigDecimal(.18);
                   
                   BigDecimal f1S = savingRate.divide(n, mc).add(new BigDecimal(1.0));
                   BigDecimal f1I = investRate.divide(n, mc).add(new BigDecimal(1.0));
                   BigDecimal f1L = creditRate.divide(n, mc).add(new BigDecimal(1.0));
                   
                   BigDecimal f2 = n.multiply(t, mc);
        
                   BigDecimal f3S = new BigDecimal (Math.pow(f1S.doubleValue(), f2.doubleValue()),mc);
                   BigDecimal f3I = new BigDecimal (Math.pow(f1I.doubleValue(), f2.doubleValue()),mc);
                   BigDecimal f3L = new BigDecimal (Math.pow(f1L.doubleValue(), f2.doubleValue()),mc);
                    
                    
                   BigDecimal f4S = f3S.multiply(savingRate, mc);
                   BigDecimal f4I = f3I.multiply(investRate, mc);
                   BigDecimal f4L = f3L.multiply(creditRate, mc);
        
        
                    System.out.println("\nBalance Saving : " +saving.getBalance());
                    System.out.println("Balance Investment : "+invest.getBalance());        
                    System.out.println("Balance Saving : " +f4S.doubleValue());
                    System.out.println("Balance Investment : " +f4I.doubleValue());
                    System.out.println("Balance Credit : " +f4L.doubleValue());      
                
                   System.out.println("\nData Customer :: \n");
                   System.out.println("#####################################################");                    
                   System.out.println("##Nama        = " + c1.getName());
                   System.out.println("##DOB         = " + date);
                   System.out.println("##Telepon     = " + c1.getPhoneNumber());
                   System.out.println("##Customer ID = " + c1.getAccount().getId());
                   System.out.println("##Balance     = " + c1.getAccount().getBalance());
                   System.out.println("##Jam operational = "+ Bank.getHoursOfOperation()); 
                   System.out.println("#####################################################");
                 
                   System.out.println("\n\nApakah Anda ingin membuat akun nasabah?(y/n)");
                   pilih = reader.next();                       
            }
            else if (pilih.equals("n")|| pilih.equals("N")){
                System.out.println("Terima kasih atas kedatangannya"); 
                break;
            }
            else {
            System.out.println("Masukkan input dengan benar");}
                    
        }while(true);      
    
    }
   
     
    /**
     * Construct the Teller object
     */
    public Teller(){
    
    }
}

