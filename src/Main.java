import Lambda_stream.HistoryModel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int Rercusive(int no){
        if(no < 1){
            return 1;
        }else {
            return no * Rercusive(no-1);
        }
    }


    static double Calculator(char sign , double ...arguments){
       double res;

      switch(sign) {
           case '+' :
               res = 0;
               for (double argument : arguments) {
                   res += argument;
               }
               break;
          case '-' :
              res = 0;
              for (double argument : arguments) res -= argument;
              break;
          case '/' :
              res = 1;
              for (double argument : arguments) res /= argument;
              break;
          case '*' :
              res = 1;
              for (int i=0 ; i < arguments.length; i ++) {
                  res *= arguments[i];
              };
              break;
          default :
              res = 0;
       };
       return res;
    }
    public static void main(String[] args) {


        System.out.println("First code to write .....");
        System.out.println("Another line to code with java");
        System.out.print("Line cont where it end ...");
        System.out.print("Line cont where it end ...");
        /*
          this is multiline comment
          type variableName = value;
         */
        int firstNumber = 45;
        int n2;
        n2 = 56;
        int sum = firstNumber + n2;

        final int baseKey = 19645;
        float price = 4000.5f;
        double discount = 3.1d;
        char gender = 'M';
        boolean isAuthenticated = true;
        System.out.println("\nPrice :" + price);

        String firstName = "Wilbroad";
        System.out.println("Firstname is "+ firstName);

        int maxScore = 56;
        int userScore = 45;
        float percentage = (float)userScore/maxScore * 12.0f;
        System.out.println("Percentage is "+ percentage);

        String text= "Wilbroad Francis  Mark";
        System.out.println("text length :"+ text.length());
        System.out.println("text lowercase :"+ text.toLowerCase());
        System.out.println("text replaceAll repeat :"+ text.replaceAll(" ","-").repeat(5));
        System.out.println("text substring :"+ text.substring(0,5));
        System.out.println("text length :"+ text.concat(" | Software Developer"));


        String word;
        word = "Tanzania for Life \n\"Being software developer from Tanzania\"";
        System.out.println("Word is\t"+ word);


        /*
        Area of rectangle
         */
        int length = 50;
        int width = 439;
        int area = length * width;
        System.out.println("\n\nArea of rectangle :"+ area+" m2");

        int maxNumber = Math.max(34,89);
        double sqrt = Math.sqrt(900);

        System.out.println("sqrt  is "+ sqrt);

       for (int i= 0 ; i < 2; i++) {
           double randomNumber = Math.random() *10000 % 50;
           if(randomNumber > 30){
               System.out.println("randomNumber  is "+ randomNumber);
               break;
           }else continue;
       }

       String caseName = "school";
        String resultOf;
       switch (caseName){
           case "school":
               resultOf = "Case is School";
               break;
           case "work":
                   resultOf = "Case is Work";
                   break;
           default:
               resultOf = "Case does not exist";
               break;
       }
       System.out.println("resultOf is "+ resultOf);


       String newCase = "second";
        String outofSwitch  = switch (newCase) {
           case "first" -> "Case match to First";
           case "second" -> "Case match to Second";
           default -> "Case does not match";
       };
        System.out.println("outofSwitch is "+ outofSwitch);

        String[] names = {"Amina" , "Ally" , "Abbas"};
        System.out.print("Names ");
        for(String name : names){
            System.out.print(name + ",");
        }
        
        double sumofNumbers = Calculator('-',1,3);
        System.out.println("\nTotal :"+ sumofNumbers);
        int reNo = Rercusive(4000);
        System.out.println("\nResursive  :"+ reNo);

          try{
              Product product = new Product("Tanzania for everybody");
              System.out.println(product.title);

              Scanner input = new Scanner(System.in);
              System.out.print("Enter title ");
//        product.title = input.nextLine();
//        System.out.println(product.title);

              product.calculator();

              HistoryModel hmodel =new HistoryModel();
              hmodel.messageVia();
              hmodel.Talk(hmodel);


//              instead of passing object that implement the method messageVia But just pass implementation
//              aim is to override what is implemented inside TalkWithLambda
              hmodel.TalkWithLambda(
                       ()->{
                           System.out.println("After overriding method messageVia through lambda");
              }
              );



          }
          catch (NullPointerException e) {
              System.out.printf("NullPointerException General %s", e.getMessage());
          }
          catch(InputMismatchException e){
              System.out.printf("InputMismatchException General %s", e.getMessage());
          }
          catch (ArithmeticException e){
              System.out.printf("ArithmeticException General %s", e.getMessage());
          }
          catch (Exception e) {
              System.out.printf("Exception General %s", e.getMessage());
          }finally {
              System.out.printf("%n%n finally block reached %n");
          }


    }
}