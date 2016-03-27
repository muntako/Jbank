
import java.util.Scanner;
import java.io.InputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.math.BigDecimal;
import java.math.MathContext;
import java. io.*;

/**
 * Teller Class
 *
 * @author Akhmad Muntako
 * @version 17/3/2016
 */
public class Teller {

    //declaration variable
//     public Customer cus = new Customer();
//     public Account a1 = new Account();
//     private Account akun1;
//     public String blabla;
//     public double saldo, balance;
//     public Customer newCustomer = new Customer();
//     public int Round_Unnecessary;
//     private MathContext mc = new MathContext(8), mc1 = new MathContext(3);
    private Customer[] customers;

    public static void main(String[] args) throws Exception {
        //modul 6
        Customer c = new Customer("Akhmad","Muntako", null);
        Savings s = new Savings(c,500);
        s.addDailyInterest(280);
        Investment i = new Investment(c, 1000, 12);
        i.addDailyInterest(280);
        OverDraftProtect o = new OverDraftProtect(c, 1500, s);
        LineOfCredit l = new LineOfCredit (c, 3000, 1000);
        c.addAccount(s);
        c.addAccount(i);
        c.addAccount(o);
        c.addAccount(l);
        System.out.println("Sebelum di Tarik\n");
        c.printAllAccounts();
        System.out.println("Setelah di Tarik\n");
        o.withdraw(1000);
        o.withdraw(800);
        l.withdraw(2000);
        l.withdraw(2000);
        c.printAllAccounts();
    }
    
      
    
    /*
     public static void main(String[] args) throws Exception {
        Bank.getHoursOfOperation();
//        Scanner reader = new Scanner(System.in);
//        Bank.getHoursOfOperation();
        
        Customer c1 = new Customer("Akhmad", "Muntako", null);
        Savings s1 = new Savings(c1, 500);
        Investment i1 = new Investment(c1, 1000, 12);
        s1.addDailyInterest(280);
        i1.addDailyInterest(280);*/

        /*//Tugas Tambahan modul 5
         customers[0] = new Customer("Akhmad","Muntako","15/12/1995");
         customers[0].addAccount(500,'S');
         customers[0].addAccount(1500,'C');
         customers[0].removeAccount('S');        
        
         customers[1] = new Customer("Akhmad","bukan","15/12/2000");
         customers[1].addAccount(700,'S');
         customers[1].addAccount(500,'I');
         customers[1].addAccount(1200,'S');
        
        
        
         System.out.println("Customer " + 1);
         System.out.println("Nama          :" + customers[0].getName());
         System.out.println("DOB           :" + customers[0].getDob());
         System.out.println("Customer ID   :" + customers[0].getCustID());
            
         System.out.println("Account        :" + accounts[0].getAcctType());
         System.out.println("Saldo          :" + accounts[0].getBalance());
         System.out.println("Account        :" + accounts[1].getAcctType());
         System.out.println("Saldo          :" + accounts[1].getBalance());
            
         System.out.println("Customer " + 2);
         System.out.println("Nama          :" + customers[1].getName());
         System.out.println("DOB           :" + customers[1].getDob());
         System.out.println("Customer ID   :" + customers[1].getCustID());
            
         System.out.println("Account       :" + accounts[2].getAcctType());
         System.out.println("Saldo         :" + accounts[2].getBalance());
         System.out.println("Account       :" + accounts[3].getAcctType());
         System.out.println("Saldo         :" + accounts[3].getBalance());
          
        
         do {
         System.out.println("Apakah Anda ingin membuat akun Customers?(y/n)");
         String pilih = reader.next();
         Boolean cek = Bank.addCustomer(cus);
         if (pilih.equalsIgnoreCase("y")) {
         if (i <  customers.length ) {
         String result = Boolean.toString(cek);
         //read firstname input
         System.out.println("Nama depan:");
         String firstName = reader.next();

         //read lastname input
         System.out.println("Nama belakang:");
         String lastName = reader.next();
                
         System.out.println("Date of birth:(dd/mm/yyy)");
         String dateOfBirth = reader.next();
         customers[i] = new Customer(firstName, lastName, dateOfBirth);
                
         System.out.println("City Address:");
         String city = reader.next();
         System.out.println("Street Address:");
         String street = reader.next();
         System.out.println("Zip Code:");
         String code = reader.next();
         System.out.println("email:");
         String email = reader.next();
         System.out.println("Phone number:");
         String phone = reader.next();
                
         customers[i].setEmail(email);
         customers[i].setAddress(street,city, code);
         customers[i].setPhoneNumber(phone);
                
         Bank.addCustomer(customers[i]);
         System.out.println("Customer ditambahkan");
         System.out.println("Apakah Anda ingin membuat Account?(y/n)");
         String acc = reader.next();
         if (acc.equalsIgnoreCase("y")){
         for ( int a = 0 ; i < 5; i++){
         System.out.println("S = Saving\nO = Overdraft\nI = Investment\nL = Line of Credit");
         System.out.println("Masukkan tipe akun yang anda inginkan (S/O/I/L): ");
         char type = reader.next().charAt(0);
         char acctType = Character.toUpperCase(type);
         if(acctType == 'S' || acctType == 'O' || acctType == 'I' || acctType == 'L') {
         System.out.println("Masukkan jumlah uang penyimpanan awal: ");
         double balance = reader.nextDouble();
         type = acctType;
         customers[i].addAccount(balance,type);
         }else {
         System.out.println("Input salah. Masukkan karakter S/O/I/L");
         }
         }
                        
         }else if(acc.equalsIgnoreCase("n")){
         System.out.println("Terima kasih atas kunjungan Anda");
         }else {
         System.out.println("Input salah. masukkan y atau n");
         }
         i++;   
         } else {
         System.out.println("Maaf anda tidak dapat menambahkan cutomer lagi");
         break;
         }
         } else if (pilih.equalsIgnoreCase("n")) {
         break;
         } else {
         System.out.println("Maaf pilihan yang anda masukkan salah");
         }

         } while (true);
        
         System.out.println("###############Data Customer#################");
            
         for (i = 0; i < customers.length; i++) {
         
        //          System.out.println("First name    :" + customers[i].getName());
//             System.out.println("Last name     :" + customers[i].lastName);
//             System.out.println("Address       :" + customers[i].getAddress());
//             System.out.println("Nomor         :" + customers[i].getPhoneNumber());
//             System.out.println("Email         :" + customers[i].getEmail());
//             System.out.println("Date of Birth :" + customers[i].dateOfBirth);
        //System.out.println("Account Balance:" + Account.getBalance()); 
        System.out.println("Nama                : " + c1.getName());
        System.out.println("ID Customer         : " + s1.getId());
        System.out.println("Saldo Saving        : " + s1.getBalance());
        System.out.println("Interest Saving     : " + s1.getInterestEarned());
       // System.out.println("Saldo Investment    : " + i1.getBalance());
        //System.out.println("Interest Investment : " + i1.getInterestEarned());
        System.out.println("Saldo ODP           : " + ODP.getBalance());
        //System.out.println("Fee Assesment       :" + ODP.feeAssessment());
        //}
        //System.out.println("#############################################");
    }
*/
    /**
     * Construct the Teller object
     */
    public Teller() {

    }
}

/*public static void main() 
 {
        
 Account saving = new Account('S',1000);
 Account invest = new Account('I',1000);
 Account creditline = new Account('L',500);
        
 MathContext mc = new MathContext(10, RoundingMode.HALF_UP);
        
 BigDecimal balS = new BigDecimal(saving.getBalance());
 BigDecimal balI = new BigDecimal(invest.getBalance());
 BigDecimal balL = new BigDecimal(creditline.getBalance());
 BigDecimal credit = new BigDecimal(250);
        
 BigDecimal nd = new BigDecimal(360.0); //compound harian
 BigDecimal nm = new BigDecimal(12.0); //compound bulanan
 BigDecimal t1 = new BigDecimal(1.0); //untuk 1 tahun
 BigDecimal t2 = new BigDecimal(.5); //untuk 6 bulan
 BigDecimal rs = new BigDecimal(.03); //tingkat suku bunga saving
 BigDecimal ri1 = new BigDecimal(.05); //tingkat suku bunga invest 6 bulan
 BigDecimal ri2 = new BigDecimal(.07); //tingkat suku bunga invest 12 bulan
 BigDecimal rl = new BigDecimal(.18); //tingkat rate creditline
        
 //balance saving
 BigDecimal f1S = rs.divide(nd, mc).add(new BigDecimal(1.0));
 BigDecimal f2S = nd.multiply(t1, mc);
 BigDecimal f3S = new BigDecimal(Math.pow(f1S.doubleValue(), f2S.doubleValue()), mc);
 BigDecimal balanceS = f3S.multiply(balS, mc);
        
 //balance invest 6 bulan pertama
 BigDecimal f1I6 = ri1.divide(nm, mc).add(new BigDecimal(1.0));
 BigDecimal f2I6 = nm.multiply(t2, mc);
 BigDecimal f3I6 = new BigDecimal(Math.pow(f1I6.doubleValue(), f2I6.doubleValue()), mc);
 BigDecimal balanceI6 = f3I6.multiply(balI, mc);
 //balance invest satu tahun
 BigDecimal f1I = ri2.divide(nm, mc).add(new BigDecimal(1.0));
 BigDecimal f2I = nm.multiply(t1, mc);
 BigDecimal f3I = new BigDecimal(Math.pow(f1I.doubleValue(), f2I.doubleValue()), mc);
 BigDecimal balanceI = f3I.multiply(balanceI6, mc);
        
 //balance creditline
 BigDecimal f1L = rl.divide(nd, mc).add(new BigDecimal(1.0));
 BigDecimal f2L = nd.multiply(t1, mc);
 BigDecimal f3L = new BigDecimal(Math.pow(f1L.doubleValue(), f2L.doubleValue()), mc);
 BigDecimal creditL = f3I.multiply(credit, mc);
 BigDecimal balanceL = balL.subtract(creditL, mc);
        
 System.out.println("Balance Saving awal                     : " + balS.doubleValue());
 System.out.println("Balance Saving setelah interest         : " + balanceS.doubleValue());
 System.out.println("Balance Investment awal                 : " + balI.doubleValue());
 System.out.println("Balance Investment setelah interest     : " + balanceI.doubleValue());
 System.out.println("Balance Line of Credit awal             : " + balL.doubleValue());
 System.out.println("Balance Line of Credit setelah interest : " + balanceL.doubleValue());
 }*/
