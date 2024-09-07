package Lambda_stream;


/**SINGLE ABSTRACT METHOD-SAM
 * Meaning that this interface won't have more than one abstract method
 */
@FunctionalInterface
public interface Notification {

    boolean isSent(String message);

}
