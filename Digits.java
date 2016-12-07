import java.util.Scanner;

class Digits
{
 static int ReverseMethod(int number)
   {
      int test;
      int reversenumber;
      
      reversenumber = 0;
      test  = number;
      number = test * 4;
         
         System.out.println("You entered the number: " +test);
         
         for(;number != 0;)
         {
             reversenumber = reversenumber * 10;
             reversenumber = reversenumber + number%10;
             number = number / 10;
         }
         
        if(reversenumber == test) System.out.println("The Reverse of the 4 factor of "+test+" is: " +reversenumber);
        else System.out.println(" The imput  is not equal to: " +test);
        
      return number;
   }
   
   public static void main(String [] args)
   {
      
      int number;
      System.out.println("Please type any 5 digits number and press enter: ");
      
      Scanner keyboard = new Scanner(System.in);
      number = keyboard.nextInt();
      
      ReverseMethod(number);
   }
}