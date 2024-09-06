package channel;


import java.util.ArrayList;



public class LoggerIm implements  Logger
{
    ArrayList<String> loggMessage;


    @Override
    public void setLoggs(String message) {
        this.loggMessage.add(message);
    }

    @Override
    public void getLogs() {

        for(String lo : this.loggMessage){
            System.out.println(lo);
        }

    }

    @Override
    public boolean isPresent(String user) {
        return false;
    }

    @Override
    public void setN(){

    }


}

