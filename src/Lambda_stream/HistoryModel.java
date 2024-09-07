package Lambda_stream;


/**
 * Java support 3 programming Paradigm
 * procedural programming,
 * object-oriented programming
 * generic programming
 *
 * Java SE 8 adds functional programming.
 */



public class HistoryModel implements  History{

   @Override
    public void messageVia() {
        System.out.println("HistoryModel");

    }


    public  void Talk(History message){
       System.out.println("use case for Passing Interface as argument");
       message.messageVia();
    }

    /**
     * instead of passing object that implement the method messageVia But just pass implementation
     * @param message
     */
    public  void TalkWithLambda(History message){
        System.out.println("use case for Passing Interface as argument");
        message.messageVia();
    }



}
