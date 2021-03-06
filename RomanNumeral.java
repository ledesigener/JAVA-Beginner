//Carl Charlet
// Extra Credit I did some research and incorporate both Roman to Arabic and Arabic to Roman Conversion.

public class RomanNumeral 
   { 
       //Two define Table one for RomanStringCharacter the other for Match Arabic Character
    
       private static String[] RomanEquivalent = { "M",  "CM",  "D",  "CD", "C",  "XC", "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
       private static int[] ArabicEquivalent = { 1000,  900,  500,  400,  100,   90,  50,   40,   10,    9,    5,    4,    1 };
       private final int num;   
       
       
       private int conversion(char letter) 
       {
             /*Validatating RomanStringNumeral Value Using Switch Statement*/
        switch (letter) 
          {
             default:   return 0;
             case 'I':  return 1;
             case 'V':  return 5;
             case 'X':  return 10;
             case 'L':  return 50;
             case 'C':  return 100;
             case 'D':  return 500;
             case 'M':  return 1000;
             //case '(M-bar)' return 1000000;
             //
          }
       }
 
       public RomanNumeral(int ArabicImput) 
       {
            
          if (ArabicImput < 1) System.out.println("Value of RomanNumeral must be positive.");
          if (ArabicImput > 3999) System.out.println("Value of RomanNumeral must be 3999 or less.");
          num = ArabicImput;
       }
       
       
       public String ConvertToString() 
           {
              String RomanString= "";  
              int N = num; 
              for (int i = 0; i < ArabicEquivalent.length; i++) 
              {
                 do
                 {
                    RomanString+= RomanEquivalent[i];
                    N -= ArabicEquivalent[i];
                 }while (N >= ArabicEquivalent[i]);
              }
              return RomanString;
           }
           
         
           public int ConvertToInt() 
           {
              return num;
           }
    
       public RomanNumeral(String roman) 
       {
            
          if (roman.length() == 0) System.out.println("You Enter an Empty Line Please Enter an ARABIC Or RomanStringCHARACTER");
             
            roman= roman.toUpperCase();  // Convert to upper case RomanEquivalent.
          
          int i = 0;       
          int ArabicImput = 0;
          
          while (i < roman.length()) 
          {
          
             char letter = roman.charAt(i);        
             int number = conversion(letter);
             
             if (number < 0)  System.out.println("Cannot do Negative for Now. That will be for Next UpGrade!!");
             i++;
             
             if (i != roman.length())
             {
                int nextNumber = conversion(roman.charAt(i));
                if (nextNumber <= number) ArabicImput += number;
                else 
                {
                   ArabicImput += (nextNumber - number);
                   i++;
                }
             }
             else  ArabicImput += number;
          }  
          
          if (ArabicImput > 3999) System.out.println("This Number is Too Big My Friend!! I will have an Headache.. Must be less than 3999 ");
          num = ArabicImput;
       }
    
       
       
        
    } 
