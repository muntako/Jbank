import java.io.*;
import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class CustomerFileReader here.
 * 
 * @author Akhmad Muntako
 * @version 21/4/2016
 */
public class CustomerFileReader
{
    private FileInputStream fileInputStream;
    //private ObjectInputStream objectInputStream;
    private File objectFile;
    
    /**
     * Constructor for objects of class CustomerFileReader
     */
    public CustomerFileReader()
    {
        
    }
    
    public ArrayList<Customer> readCustomer()
    {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        try {
            objectFile = new File("data/customers.dat");
            fileInputStream = new FileInputStream(objectFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customers = (ArrayList<Customer>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return customers;
    }
    
    public SortedSet<Customer> read()
    {
        SortedSet<Customer> customers = new TreeSet<Customer>();
        try {
            objectFile = new File("data/customers.dat");
            fileInputStream = new FileInputStream(objectFile);
           ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            customers = (SortedSet<Customer>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
        return customers;
    }
}
