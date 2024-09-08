package Lambda_stream;


/**SINGLE ABSTRACT METHOD-SAM
 * Meaning that this interface won't have more than one abstract method
 */
@FunctionalInterface
public interface Notification {

    boolean isSent(String message);

    /**SINGLE ABSTRACT METHOD-SAM
     * It accept default method with full implementation
     */
    default  String getNotificationDefaultMethod(){
        return "Notification from default method in interface";
    }

    static void NotiPamSticMethod(){
        System.out.println("Also accept static method");
    }

}
