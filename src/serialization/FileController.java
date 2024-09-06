package serialization;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileController {

    private static ObjectOutputStream output; //output data to a file


    private static void openFile(){
        try{
            output = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("./src/FilesCreater/lecture.txt"))
            );

        }
        catch (IOException e) {

            System.err.println("IOException Exception :"+ e.getMessage());
            System.exit(1);
        }
        catch (Exception e){
            System.err.println("General Exception :"+ e.getMessage());
            System.exit(1);
        }
    }

    public static void addRecord(Object record ){
        openFile();
        try{
            output.writeObject(record);
            System.out.println("Record saved successfully");

        }catch (Exception e){
            System.err.println("General Exception :"+ e.getMessage());
        }finally {
            closeFile();
        }
    }

    private static void closeFile(){
        try{
            if(output != null){
                output.close();
            }
        }
        catch (IOException e){
            System.err.println("IOException Exception :"+ e.getMessage());
        }
    }

}
