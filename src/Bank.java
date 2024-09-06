public class Bank {

    /**
     * The name of the bank.
     */
    public String name;

    /**
     * The balance of the bank account.
     *
     * This variable holds the current amount of money available
     * in the bank account represented by this instance.
     * It is always non-negative.
     */
    private double balance;

    Bank(String newName ,double balance){
        this.name = newName;
        if( balance  >= 0)
            this.balance = balance;
    }

    /**
     * Sets the balance for the bank account.
     *
     * @param newBalance the new balance to be set.
     */
    public void setBalance(double newBalance){
        if(newBalance >= 0)
            this.balance = newBalance;

    }

    /**
     * Retrieves the current balance.
     *
     * @return the balance as a double.
     */
    public double getBalance(){
       return this.balance;
    }

    public boolean isOdd(int number){
        return number % 2 != 0;
    }

    public boolean isPrime(int number){
        if(number == 1)
            return false;
        for(int i = 2 ; i < number ; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public int[] isDivisibleBy(int number){
        int[] result = new int[number];
        number = Math.abs(number);
        int counter = 0;
        for(int i=1; i < number; i++){
            if(number % i == 0){
                result[counter] = i;
            }
          counter ++;
        }
        return result;
    }

}
