import java.util.Scanner;
import java.io.InputStream;
import java.io.IOException;

/**
 * Class that controlle the bank
 * 
 * @author Akhmad Muntako
 * @version 3/3/2016
 */
public class Teller
{
    //declaration variable
    public Customer c1=new Customer();
    public Account a1=new Account();
    private Account akun1;
    public String blabla;
    public double saldo, balance;
    public Customer newCustomer = new Customer ();
        
    /**
     * main 
     */
    public static void main(String[] args){
        Account a1;
        String firstName;
        String lastName;
        String dob;
        String phoneNumber;
        char acctType;
        String NextID;
        int custID;
        int balance;
        char pilih;
        Scanner reader = new Scanner(System.in);
        System.out.println("Selamat Datang di JBANK");
        System.out.println("Apakah Anda ingin membuat akun nasabah?(y/n)");
        pilih = reader.next().trim().charAt(0);                 
        
        do
        {
            System.out.println("Nama depan: ");
            firstName = reader.next();
            System.out.println("Nama belakang:");
            lastName = reader.next();
            System.out.println("Tanggal lahir:");
            dob = reader.next();
            System.out.println("Nomor Telepon:");
            phoneNumber = reader.next();
            
            //create account 
            Customer c1 = new Customer(firstName, lastName, dob);
            c1.setPhoneNumber(phoneNumber);
                                 
            //set customers id 
            custID = new Bank().getNextID();
            
            //choose customers ID
            System.out.print("Pilih jenis akun (S, O, I, C, N): ");
            System.out.print("\nS = Saving \nO = Overdraft\nI = Investment\nC = Credit Cecking\nN = Tidak membuat akun\n");
            acctType = reader.next().trim().charAt(0);
                        
            
            a1 = new Account();
            a1.setAcctType(acctType);
            
            //set balance
            System.out.print("Masukkan jumlah tabungan: ");
            balance = reader.nextInt();
            if  (balance <= 0) {             
                 System.out.print("Maaf silahkan masukkan jumlah tabungan dengan benar\n");
                 System.out.print("Masukkan jumlah tabungan: ");
                 balance = reader.nextInt();
                }else{
                    balance = balance; 
                }
            a1.setBalance(balance);  
            
           System.out.println("\nData Customer :: \n");
                    
           System.out.println("Nama        = " + firstName + " " + lastName);
           System.out.println("DOB         = " + dob);
           System.out.println("Telepon     = " + phoneNumber);
           System.out.println("Customer ID = " + custID + acctType);
           System.out.println("Balance     = " + balance);  
         
           System.out.println("\n\nApakah Anda ingin membuat akun nasabah?(y/n)");
           pilih = reader.next().trim().charAt(0); 
                   
        }while(pilih == 'y');
        
        System.out.println("Terima Kasih atas kedatangannya");      
    
    }
     
     
    /**
     * Construct the Teller object
     */
    public Teller(){
    c1.setName("Sanadhi","Sutandi");
    blabla = c1.getName();
    a1.setBalance (1000000);
    c1.setAccount(a1);
    akun1=c1.getAccount();
    balance=akun1.getBalance();
    System.out.println(balance);
    System.out.println(blabla);
    }
}

