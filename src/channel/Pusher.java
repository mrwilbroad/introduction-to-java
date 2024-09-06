package channel;

import java.util.InputMismatchException;

public class Pusher extends  Country{

    public String title;
    public String message;

    public static String initiateConnection(){
        return "Channel is successfull initialized ";
    }

    public static String closeConnection(){
        return "Channel is successfull closed";
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    String setMessage(String message) {
        return this.message = message;
    }

    @Override
    String getMessage() {
        return this.message;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Divides two double values.
     *
     * @param n1 the numerator
     * @param n2 the q
     * @return the result of the division
     * @throws ArithmeticException if the denominator is zero
     */
    double divide(double n1 , double n2) throws ArithmeticException , InputMismatchException {

        if(n1 < 0)
            throw new InputMismatchException("Negative numbers are not allowed");
        if(n2 == 0)
            throw new ArithmeticException("Division by zero is not possible");
        return n1/n2;
    }


}
