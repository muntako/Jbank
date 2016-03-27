
/**
 * Kelas Abstrak Checking merupakan kelas extends dari Account. Kelas ini memeriksa jika
 * Customer ingin menarik saldo melebihi dari saldo yang disimpan di Saving Account
 * 
 * @author Akhmad Muntako
 * @version 24/03/2016
 */
public abstract class Checking extends Account {
    protected double monthlyFee;
    /**
     * Method abstrak untuk mengecek biaya Checking Account
     */
    protected abstract void feeAssessment();
    
    /**
     * Method abstrak untuk mengecek biaya Checking Account
     */
    public void resetMonthlyFee() {
        monthlyFee = 0;
    }
    
    public double getMonthlyFee() {
        return monthlyFee;
    }
}
