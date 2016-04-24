import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class ButtonHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonHandler implements  ActionListener{
    private ATMGUI gui;
    private int ID;
    private long Nominal,saldo;
    public ButtonHandler(ATMGUI atmgui){
         gui = atmgui;
    }
    
    public void actionPerformed(ActionEvent e){
        ID = gui.getID();
        Nominal = gui.getNominal();
       if(e.getActionCommand().equals("Deposit")){
           gui.setTextArea("\nCustomer: " + gui.getID() +" saves an amount of money: Rp " + gui.getNominal() );
           saldo += gui.getNominal();
       }else if(e.getActionCommand().equals("Withdraw")){
           if (gui.getNominal()>saldo){
               JOptionPane.showMessageDialog(null,"transtraction error, saldo not enough","alert",JOptionPane.INFORMATION_MESSAGE);
            }
           gui.setTextArea("\nCustomer: " + gui.getID() +" withdraws an amount of money: Rp " + gui.getNominal());
           saldo -= gui.getNominal();
       }else if(e.getActionCommand().equals("Total")){
           gui.setTextArea("\nTotal of Moneys: Rp" + saldo);
       }else if(e.getActionCommand().equals("Exit")){
           int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Close?",  JOptionPane.YES_NO_OPTION);
           if (reply == JOptionPane.YES_OPTION)
           {
               JOptionPane.showMessageDialog(null,"You are exitting, goodbye","exit",JOptionPane.INFORMATION_MESSAGE);
               System.exit(0);
           }
        }
   }
   
   public Account locateAccount()
    {
        Account a = null;
        Customer c = null;
        try {
            c = Bank.getCustomer(gui.getID());
            try {
                a = c.getAccount(gui.getAcctType());
            } catch (AccountTypeNotFoundException notfound) {
                gui.setTextArea(notfound.getMessage());
            }
        } catch (NullPointerException e) {
            gui.setTextArea("Customer ID does not exist");
        }
        return a;
    }
    
   
}

