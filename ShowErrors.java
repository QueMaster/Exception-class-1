import javax.swing.JOptionPane;
import java.util.Scanner;

public class ShowErrors
{
   public static void main(String[] args)
   {
   Scanner scan = new Scanner(System.in);
   
   String myString = "This is a string to explain exception.";
   String myString2 = null;
   
   int number = 20;
   
   try
   {
    char theCharacter = myString.charAt(10);
     System.out.println("The character is: " + theCharacter);
   }
   catch(StringIndexOutOfBoundsException e)
   {
   System.out.println("The index value is to high no such character in this string");
   number = 80;
   }
  finally
   {
     number = 100;
   }
  System.out.println(number);
   }
}