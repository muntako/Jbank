
/**
 * Kelas Abstrak OverDraftProtect adalah kelas extends dari Checking Account. 
 * Kelas ini meruppakan representasi rekening ObverDraftProtection dan terhubung ke kelas Savings
 * 
 * @author Akhmad Muntako
 * @version 24/03/2016
 */
public class OverDraftProtect extends Checking {
    private Savings savingsAccount;

    /**
     * Method Constructor dari OverDraftProtect
     * @param cust Obyek Customer yang bersangkutan
     * @param amount Jumlah saldo yang ingin dimasukkan
     * @param save Obyek Savings Account sebagai acuan
     */
    public OverDraftProtect(Customer cust, double amount, Savings save) {
        super();
        balance = amount;
        savingsAccount = save;
        id = Integer.toString(cust.getCustID());
    }
    
    /**
     * Method feeAssessment Perhitungan biaya proteksi Overdraft
     */
    public void feeAssessment () {
        monthlyFee += 3;
        balance -= 3;
    }
    
    /**
     * Method withdraw Menarik sejumlah Saldo dari Overdraft Account
     * @param amount Jumlah Saldo
     */
    public boolean withdraw (double amount) {
        if ( ( balance + savingsAccount.getBalance() ) - amount >= 10) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                savingsAccount.withdraw(amount - balance);
                balance = 0;
                feeAssessment();
            }
            return true;
        } else {
            return false;
        }
    }
}
