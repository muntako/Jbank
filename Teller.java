
/**
 * Write a description of class Teller here.
 * 
 * @author Akhmad Muntako
 *  1
 */
public class Teller
{
    public Customer c1=new Customer();
    public Account a1=new Account();
    private Account akun1;
    public String blabla;
    public double saldo, balance;
    
    public static void main(String[] args){
    
    }
    
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

