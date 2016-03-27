import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;

/**
 * Kelas Abstrak LineOfCredit adalah kelas extends dari Checking Account. Kelas ini adalah
 * salah satu jenis Checking Account khusus yang memberikan Credit Limit untuk penarikan
 * melebihi saldo Saving Account
 * 
 * @author Akhmad Muntako
 * @version 24/03/2016
 */
public class LineOfCredit extends Checking {
    private double creditBalance;
    private double creditLimit;
    
    /**
     * Method Constructor LineOfCredit 
     * @param cust Obyek Customer acuan
     * @param amount Jumlah Saldo Checking Account
     * @param creditAmount Jumlah nilai limit kredit
     */
    public LineOfCredit (Customer cust, double amount, double creditAmount) {
        super();
        id = Integer.toString(cust.getCustID());
        balance = amount;
        creditBalance = creditAmount;
        creditLimit = creditAmount;
    }
    
    /**
     * Method feeAssessment Perhitungan biaya kredit
     */
    public void feeAssessment() {
        int days = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
        double deficit = creditLimit - creditBalance; 
        double amt = Math.pow(deficit* (1+0.21 / 365),(365*days));
        monthlyFee = amt - deficit;
    }
    
    /**
     * Method withdraw Menarik sejumlah Saldo dari Line-of-Credit Account
     * @param amount Jumlah Saldo
     */
    public boolean withdraw (double amount) {
        if(amount > balance + creditBalance){
            return false;
        }else if (amount > balance){
            balance = 0;
            creditBalance -= (amount - balance);
            return true;
        }else{
            balance = balance - amount;
            return true;
        }
    }
    
    /**
     * Method getCreditBalance Memberikan nilai saldo kredit
     * @return Nilai saldo kredit
     */
    public double getCreditBalance () {
        return creditBalance;
    }
    
    /**
     * Method getCreditLimit Memberikan nilai limit kredit
     * @return Nilai limit kredit
     */
    public double getCreditLimit () {
        return creditLimit;
    }
    
    /**
     * Method setCreditBalance Menentukan nilai saldo kredit
     * @param amount Jumlah nilai untuk saldo kredit
     */
    public void setCreditBalance (double amount) {
        creditBalance = amount;
    }
    
    /**
     * Method setCreditLimit Menentukan nilai limit kredit
     * @param amount Jumlah nilai untuk limit kredit
     */
    public void setCreditLimit (double amount) {
        creditLimit = amount;
    }
}
