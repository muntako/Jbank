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
    private ATMGUI atm;
    private int ID;
    private long Nominal,saldo;
    public ButtonHandler(ATMGUI atmgui){
         atm = atmgui;
    }
    
    public void actionPerformed(ActionEvent e){
        ID = atm.getID();
        Nominal = atm.getNominal();
       if(e.getActionCommand().equals("Deposit")){
           atm.setTextArea("\nCustomer: " + atm.getID() +" saves an amount of money: Rp " + atm.getNominal() );
           saldo += atm.getNominal();
       }else if(e.getActionCommand().equals("Withdraw")){
           if (atm.getNominal()>saldo){
               JOptionPane.showMessageDialog(null,"transtraction error, saldo not enough","alert",JOptionPane.INFORMATION_MESSAGE);
            }
           atm.setTextArea("\nCustomer: " + atm.getID() +" withdraws an amount of money: Rp " + atm.getNominal());
           saldo -= atm.getNominal();
       }else if(e.getActionCommand().equals("Total")){
           atm.setTextArea("\nTotal of Moneys: Rp" + saldo);
       }else if(e.getActionCommand().equals("Exit")){
           int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Close?",  JOptionPane.YES_NO_OPTION);
           if (reply == JOptionPane.YES_OPTION)
           {
               JOptionPane.showMessageDialog(null,"You are exitting, goodbye","exit",JOptionPane.INFORMATION_MESSAGE);
               System.exit(0);
           }
        }
   }
}

