import FilesCreater.CreateFile;
import Tokenizing.Sentence;
import channel.LoggerIm;
import random.Champion;
import random.Password;
import random.Payment;
import static channel.Pusher.*;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Product {

    public  String title = "Product";
    private final String keyField = "12344";

    public Product(String newTitle){
            this.title  = newTitle;
    }



    public void calculator(){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter First number :");
        int n1 = 19;
//        System.out.println("Enter Second number :");
        int n2 = 9;

        System.out.println("Sum is "+ (n1 + n2));
        System.out.println("Product is "+ (n1 * n2));
        System.out.println("Division is "+ (n1 / n2));
        System.out.println("Multiplication is "+ (n1 * n2));
        System.out.printf("Subtraction is %d + %d = %d%n",n1, n2, n1+n2);

        /*
          y = mx + b
         */
        int y ,m,x,b;
         x=45; b= 90; m= 45;
        y = m*x + b;
        System.out.printf("Linear Line(y=mx + b) %d=%d*%d+%d :",y,m,x,b);
        System.out.printf("%nFullname %s - %s - %s%n","Wilbroad","Francis","Mark");

        Bank bank = new Bank("Wilbroad",500);
        bank.setBalance(9000.677);
        System.out.printf("Balance is %.2f", bank.getBalance());

        for(int i = 1; i < 100; i++)
        {
            System.out.printf("Number %d is %s%n",i, bank.isPrime(i) ? "Prime" : "Not Prime");
        }
        System.out.print("%Number 40 is visible by "+ 20+ "\t");
        int[] divBy = bank.isDivisibleBy(40);
        for(int n : divBy){
            System.out.printf("%d ",n);
        }

        Password password = new Password();
        password.generatePassword();
//        System.out.printf("%ndeterministic%n");
//        password.unDeterministicPassword();

        Payment pay = new Payment();
        System.out.println("Time is :"+ pay.toTime(12,96,1));
        System.out.println(password.User(pay , "Wilbroad Mark"));


        for(Champion champion : Champion.values()){
             System.out.printf("Title : %s - %s%n",champion.title,champion.price);
        }


        System.out.println("Pusher :"+ initiateConnection());
        System.out.println("Pusher :"+ closeConnection());

        /**
         * Interest Calculations Using BigDecimal
         */
        BigDecimal priceData = BigDecimal.valueOf(200000.0);
        BigDecimal priceData_two = BigDecimal.valueOf(19070.0);
        System.out.println("BigDecimal :"+ priceData.add(priceData_two));
        System.out.println("BigDecimal :"+ priceData.subtract(priceData_two));
        System.out.println("BigDecimal :"+ priceData.multiply(priceData_two));
        NumberFormat.getCurrencyInstance().setCurrency(Currency.getInstance("TZS"));
        System.out.println("BigDecimal :"+ NumberFormat.getCurrencyInstance().format(priceData));


//        LoggerIm logger = new LoggerIm();
//        logger.getLogs();
//        System.out.println("Loggs :");

        int numberTest = 23;
//        assert  numberTest <= 6 : "Number for test is not allowed";
        System.out.println("assert  Test Number is " + numberTest);


        char[] letters = {'a','b','c', 'd', 'e'};
        System.out.println(Reverse(String.valueOf("WILBROAD")));
        StringBuilder buffer1 = new StringBuilder();
        buffer1.append("WILBROAD");
        buffer1.append("FRANCIS");
        buffer1.append("WILBROAD");
        buffer1.append("FRANCIS");
        buffer1.reverse();
        System.out.println("Buffer value : "+ buffer1);

        Sentence sent = new Sentence();
        sent.word("When you read a sentence, your mind breaks it into tokens—individual words");

        CreateFile file = new CreateFile();
        file.createFile();


    }

    private  String Reverse(String str){
        System.out.printf("substring from word %s is  %s%n",str,str.substring(0,2));
        return new StringBuilder(str).reverse().toString();
    }







}
