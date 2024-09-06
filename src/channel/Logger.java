package channel;

public interface Logger {


    void setLoggs(String message);

    void getLogs();

    boolean isPresent(String user);


    abstract void setN();

}
