package FilesCreater;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Also java.io.PrintWriter can be used to write to a file ... because it has format method .

public class CreateFile {

    private static Formatter output;
    private static Scanner input;


    public  void createFile(){
//        openFile();
//        addRecord();
//        closeFile();

//        open for reading file
        openForRead();
        readFile();
        closeWhileReadFile();
    }

    private  static  void openFile(){
        try{
            output = new Formatter("./src/FilesCreater/lecture.txt");
        }
        catch(SecurityException e){
            System.err.printf("%n SecurityException %s" , e.getMessage());
            System.exit(1);
        }
        catch(FileNotFoundException e){
            System.err.printf("%n FileNotFoundException %s" , e.getMessage());
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

            System.err.println("General Exception :"+ e.getMessage());

        }
    }

    private static void openForRead(){
         try{
             input = new Scanner(Paths.get("./src/FilesCreater/lecture.txt"));

         }catch(IOException e){
             System.err.println("IOException :"+ e.getMessage());
             System.exit(1);
         } catch (Exception e) {
             System.err.println("Exception :"+ e.getMessage());
             System.exit(1);
         }
    }

    private static void readFile(){
        try{
            String fullname = input.nextLine();
            String countryName = input.nextLine();

            System.out.printf("fullname %s%nCountry Name %s%n",fullname, countryName);
            System.out.printf("%s %s %n",fullname,countryName);

        }catch(NoSuchElementException e){
            System.err.println("NoSuchElementException :"+ e.getMessage());
        }catch(IllegalStateException e){
            System.err.println("IllegalStateException-Error reading from file. Terminating. :"+ e.getMessage());
        }
    }


    private  static  void closeFile(){
        if(output != null){
            output.close();
        }
    }


    private  static  void closeWhileReadFile(){
        if(input != null){
            input.close();
        }
    }



}
