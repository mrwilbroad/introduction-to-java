package serialization;


import java.io.*;

/**
 * Classes ObjectInputStream and ObjectOutputStream (package java.io), which respectively
 * implement the ObjectInput and ObjectOutput interfaces, enable entire objects to
 * be read from or written to a stream (possibly a file)
 */

public class SendingReceiving implements Serializable {

    private int accountChannel;
    private String fullName;
    private double balance;



    public SendingReceiving(int accountChannel, String fullName, double balance){
        this.accountChannel = accountChannel;
        this.fullName = fullName;
        this.balance = balance;
    }
    public int getAccount(){
        return this.accountChannel;
    }

    public String getFullName(){
        return this.fullName;
    }
    public double getBalance(){
        return this.balance;
    }

    public void setAccount(int accountChannel){
        this.accountChannel = accountChannel;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }



    /**
     * This section  create and manipulate sequential-access files using object
     * serialization
     */
    public void ReadBySerialization(){

    }
}
