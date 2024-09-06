package random;


import java.security.SecureRandom;
import java.util.Random;

/**
 * Case Study: Secure Random-Number Generation
 * We now take a brief diversion into a popular type of programming application
 */
public class Password {


    /**
     * Deterministic Password Generator
     */
    public  void generatePassword(){
        Random random = new Random();
        for(int i = 0; i < 12; i++){
            System.out.printf("Random %d%n", random.nextInt(30));
        }
    }


    /**
     * nondeterministic random numbers that cannot be predicted
     */
    public  void unDeterministicPassword(){
        SecureRandom random = new SecureRandom();

        byte[] bytes = new byte[45];
        byte veNo = 100;
        random.nextBytes(bytes);
       for(byte t : bytes){
           System.out.printf("%s ",t);
       }

    }


    public  void dArray(){
        System.out.println("issuing Array");
//        size 4
        int[] ar1 = new int[4];
        int[] vVote = {1 ,2 ,4,6,7,8,9};

        int[][] seatPlan = {{1,2,3}, {3,5,6}};
    }

    public String User(Payment payment, String fullname){
     try{
         return "Payment Type :" + payment.getPayment()[5]+" from :" + fullname;
     }
     catch(NullPointerException e){
         return "NullPointerException occurred ...."+ e.getMessage();
     }
     catch(Exception e){
         return "Exception occurred ...." + e.getMessage();
     }
    }



}

