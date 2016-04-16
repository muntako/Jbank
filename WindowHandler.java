import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
/**
 * class window handler berfungsi untuk menampilkan pesan saat window ditutup
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    public class WindowHandler extends WindowAdapter
    {
      public void windowClosing(WindowEvent e)
      {
            JOptionPane.showMessageDialog(null,"You are exitting, goodbye","exit",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
      }
    }
