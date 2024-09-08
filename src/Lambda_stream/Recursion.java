package Lambda_stream;

public class Recursion {


    public void recursion(){
  for(int i= 0 ;i< 10;i++){
      System.out.printf("%s! = %s%n",i, factorial(i));
  }

  System.out.println("Fibonacci Series ");
  for(int i= 0 ;i< 10;i++){
      System.out.printf("%s = %s%n",i, fibonacci(i));
  }
    }


    public int factorial(int n){
        if(n <= 1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }

    public  int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
