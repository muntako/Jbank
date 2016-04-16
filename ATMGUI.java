/**
*Class ATMGUI untuk menampilkan tampilan GUI dari sebuah ATM yang mengimplementasikan
*fungsi dari JBANK
*/
import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class ATMGUI extends JFrame {

    private JButton depositbt;
    private JButton withdrawbt;
    private JButton exitbt;
    private JButton totalbt;
    private JLabel label1;
    private JLabel label2;
    private JRadioButton savingbt;
    private JRadioButton investbt;
    private JRadioButton creditbt;
    private JRadioButton overbt;
    private JTextArea textarea1;
    private JTextField textfield1;
    private JTextField textfield2;
    private JScrollPane scroll;
    private WindowHandler wh = new WindowHandler();
    private String Text;
    private int ID;
    private long saldo;
    private long Nominal;
    private Customer customer;
    

    //Constructor 
    public ATMGUI(){
        Color putih = new Color(255,255,255);
        Color hitam = new Color(0,0,0);
        setTitle("ATMGUI");
        depositbt = new JButton();
        withdrawbt = new JButton();
        exitbt = new JButton();
        totalbt = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        
        savingbt = new JRadioButton();
        investbt = new JRadioButton();
        creditbt = new JRadioButton();
        overbt = new JRadioButton();
        
        textarea1 = new JTextArea();
        textfield1 = new JTextField();
        textfield2 = new JTextField();
        
        textfield1.setBackground(putih);
        textfield1.setForeground(hitam);
        textfield2.setBackground(putih);
        textfield2.setForeground(hitam);
        depositbt.setText("Deposit");
        withdrawbt.setText("Withdraw");
        totalbt.setText("Total");
        exitbt.setText("Exit");
        
        label1.setText("Enter customer id");
        label1.setBackground(putih);
        
        savingbt.setBackground(putih);
        savingbt.setText("Savings");
        
        investbt.setBackground(putih);
        investbt.setForeground(hitam);
        investbt.setText("Investment");
        
        creditbt.setBackground(putih);
        creditbt.setForeground(hitam);
        creditbt.setText("Line of Credit");
        
        overbt.setBackground(putih);
        overbt.setForeground(hitam);
        overbt.setText("Overdraft");
        
        textarea1.setText("Welcome");
        textarea1.enableInputMethods(false);
        textarea1.setBorder(BorderFactory.createBevelBorder(1));
        
        label2.setBackground(putih);
        label2.setForeground(hitam);
        label2.setText("Enter amount here:");
        buildGUI();
        addWindowListener(wh);        
        
        depositbt.addActionListener(new ButtonHandler(this));
        withdrawbt.addActionListener(new ButtonHandler(this));
        totalbt.addActionListener(new ButtonHandler(this));
        exitbt.addActionListener(new ButtonHandler(this));
        

    }

   
    public void buildGUI(){
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints g= new GridBagConstraints();
        panel.setBackground(new Color(255,255,255));
        
        JPanel infoPanel = new JPanel();
        JPanel radiogrup = new JPanel();
        JPanel textPanel = new JPanel();
        JPanel buttongroup = new JPanel();
        
        //setting layout panel
        infoPanel.setLayout(new GridLayout(1,5));
        radiogrup.setLayout(new GridLayout(4,1));
        textPanel.setLayout(new GridLayout(1,2)); 
        buttongroup.setLayout(new GridLayout(4,1));
        
        //menambahkan komponen ke panel
        radiogrup.add(savingbt);
        radiogrup.add(investbt);
        radiogrup.add(creditbt);
        radiogrup.add(overbt);
        infoPanel.add(label2);
        infoPanel.add(textfield2);
        
        buttongroup.add(depositbt);
        buttongroup.add(withdrawbt);
        buttongroup.add(totalbt);
        buttongroup.add(exitbt);
        //membuat border pada text area dan menambahkan scroll bar
        textarea1.setLayout(new BorderLayout());
        scroll = new JScrollPane(textarea1);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
        
        //setting letak dan ukuran komponen pada Frame
        g.fill = GridBagConstraints.HORIZONTAL;        
        g.gridx = 0;
        g.gridy = 0;
        g.gridwidth = 1;
        panel.add(label1,g);
        
        g.fill = GridBagConstraints.HORIZONTAL;        
        g.gridx = 1;
        g.gridy = 0;
        g.ipadx = 100;
        panel.add(textfield1,g);

        g.fill = GridBagConstraints.HORIZONTAL;        
        g.gridx = 2;
        g.gridy = 0;
        panel.add(radiogrup,g);
        
        g.fill = GridBagConstraints.HORIZONTAL;        
        g.gridx = 3;
        g.gridy = 0;
        panel.add(label2,g);
        
        g.fill = GridBagConstraints.HORIZONTAL;        
        g.gridx = 4;
        g.gridy = 0;
        panel.add(textfield2,g);
                
        g.fill = GridBagConstraints.HORIZONTAL;
        g.gridx = 0;
        g.gridy = 1;
        g.ipady = 300;
        g.gridwidth = 4;
        panel.add(scroll,g);
        
        g.fill = GridBagConstraints.HORIZONTAL;
        g.gridx = 4;
        g.gridy = 1;
        panel.add(buttongroup,g);
        
      
        //menambahkan panel ke JFrame dan setting posisi window serta operasi close
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

     public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ATMGUI();
            }
        });
       
    }
    
    public int getID (){
        ID = Integer.parseInt(textfield1.getText());
        return ID;
    }
    
    public long getNominal(){
       Nominal = Long.parseLong(textfield2.getText());
       return Nominal;
    }
    
    public  void setTextArea (String str){
         textarea1.append(str);
    }
   
}