package FilesCreater;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

//Also java.io.PrintWriter can be used to write to a file ... because it has format method ..

public class CreateFile {

    private static Formatter output;


    public  void createFile(){
        openFile();
        addRecord();
        closeFile();
    }

    private  static  void openFile(){
        try{
            output = new Formatter("./src/FilesCreater/lecture.txt");
        }
        catch(SecurityException e){
            System.out.printf("%n SecurityException %s" , e.getMessage());
            System.exit(1);
        }
        catch(FileNotFoundException e){
            System.out.printf("%n FileNotFoundException %s" , e.getMessage());
            System.exit(1);
        }
    }

    private  static void addRecord(){
        try{
            Scanner input = new Scanner(System.in);
            System.out.printf("%n%s%n ? :","Thanks for choosing Innovation Hub Africa");
            String fullName = input.nextLine();
            output.format("%s%n",fullName);
            System.out.printf("%s ? :%n","Thanks for choosing Innovation Hub Africa");
            String countryName = input.nextLine();
            output.format("%s%n",countryName);

            System.out.printf("%s","Thanks for choosing Innovation Hub Africa");


        }catch(Exception e){

            System.out.println("General Exception :"+ e.getMessage());

        }
    }


    private  static  void closeFile(){
        if(output != null){
            output.close();
        }
    }
}
