package Lambda_stream;

/**
 * Single Abstract method-SAM
 */
public interface History
{
    void messageVia();

    default  void Great(){
        System.out.println("Greating from default method in interface");
    }

}