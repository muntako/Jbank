import java.io.*;
import java.util.ArrayList;
import java.util.*;
/**
 * Write a description of class CustomerFileWriter here.
 * 
 * @author Akhmad Muntako
 * @version 21/4/2016
 */
public class CustomerFileWriter implements Serializable
{
    private File objectFile;
    private FileOutputStream fileOutputStream;
    //private ObjectOutputStream objectOutputStream;
    
    /**
     * Constructor for objects of class CustomerFileWriter
     */
    public CustomerFileWriter()
    {
        
    }
    
    public void saveCustomers(ArrayList<Customer> customers)
    {
        try {
            objectFile = new File("data/customers.dat");
            fileOutputStream = new FileOutputStream(objectFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customers);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveCustomer(SortedSet<Customer> customers)
    {
        try {
            objectFile = new File("data/customers.dat");
            fileOutputStream = new FileOutputStream(objectFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customers);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
