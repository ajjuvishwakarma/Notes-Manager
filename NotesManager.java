import java.io.*;
import java.util.Scanner;
public class NotesManager 
{
    public static void main(String args[])
    {

        Scanner scanner=new Scanner(System.in);
        //Name of file in which notes will be stored
        String  fileName="notes.txt";
        //use of try-with-resources:To auto-close the file writer
        try(FileWriter writer= new FileWriter(fileName,true))
        {
            System.out.println("Enter your note:");
            String note=scanner.nextLine();
            //FileWriter opened in append mode(true)
            writer.write(note+"\n");
            System.out.println("Note saved successfully.");

        } 
        catch(IOException e)
        {
            //Exception handled(check exception)
            System.out.println("Error while writing note:"+e.getMessage());
        }
        //Reading a file using BufferedReader for efficient reading
        try(BufferedReader reader=new BufferedReader(new FileReader(fileName)))
        {
            System.out.println("\n--Saved Notes---");
            String line;

            //We read line by line until we get null
            while((line=reader.readLine()) !=null)
            {
                System.out.println(line);
            }
            
        }
        catch(IOException e)
            {
                //Handling errors while reading
                System.out.println("Error while reading notes:"+e.getMessage());
                


            }
    }
}
