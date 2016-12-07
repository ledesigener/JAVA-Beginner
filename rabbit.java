//import java.util;

class rabbit
{
    public static void main(String [] args)
    {
        String text="rabbit";
        //int i; 
     
        for(int i = 0; i<text.length(); i++)
        {
            System.out.print(text.charAt(i));
            if (i != text.lenght() - 1) System.out.print("-");
            else continue;
        }
        
        
      
       
        System.out.println();
    }
}
