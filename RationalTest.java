//Carl Charlet
// Main class calling fot Classs Rational.. Finally it Works..

class RationalTest
{


 //// Main Method
    public static void main (String [] args)
    {
        Rational RationalCase1 = new Rational( 42, 27 );
        Rational RationalCase2 = new Rational( 25, 7 );
        
        System.out.println();
        TrueRational(RationalCase1,RationalCase2);
        System.out.println();
        TrueRational(RationalCase2,RationalCase1);
        System.out.println();
 
    }
    
 private static void TrueRational(Rational RationalCase1, Rational RationalCase2)
    {
      System.out.println(RationalCase1.ConvertToString() + " < " + RationalCase2.ConvertToString() + " is " + RationalCase1.Rat(RationalCase2) );
    }



}