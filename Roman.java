    public class Roman
    {
    
       public static void main(String[] args) 
       {
          
          TextIO.putln();
          System.out.println("****** Roman to Arabic Conersion and Vice Versa ************");
          System.out.println("****** Press 'ENTER' to quit The application ***************");
          
          // Do While Loop to iterate until user decide to quit!
          do 
          {
    
             TextIO.putln();
             TextIO.put("Type an ARABIC or ROMAN: ");
             
             while (TextIO.peek() == ' ' || TextIO.peek() == '\t')
                TextIO.getAnyChar();
             if ( TextIO.peek() == '\n' ) break;
                
              //Convert from Roman to Arabic and Arabic To Roman
                
             if ( Character.isDigit(TextIO.peek()) ) 
             {
                int arabic = TextIO.getlnInt();
              
                    RomanNumeral N = new RomanNumeral(arabic);
                    TextIO.putln(N.ConvertToInt() + " = " + N.ConvertToString());
             
             }
             else 
             {
                String roman = TextIO.getln();
               
                    RomanNumeral N = new RomanNumeral(roman);
                    TextIO.putln(N.ConvertToString() + " = " + N.ConvertToInt());
              
             }
    
          } while (true);
          System.out.println("BYE BYE.....");
          System.out.println("Hasta La Vista.....");
          System.out.println("AU REVOIR.....");
          System.out.println();
    
       } 
    }
