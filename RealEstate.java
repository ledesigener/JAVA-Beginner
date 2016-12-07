
//Carl Charlet


import java.util.Scanner;

class RealEstate
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome....Enter a Real Estate AD Please: ");
        
        String ad = keyboard.nextLine();
        
        Advertise(ad);
        
    }
    
    public static void Advertise(String ad)
    {
        System.out.println("The Reverse of the AD is: ");
        System.out.println(modify(ad));
    }
    
    public static String modify(String TempAd)
    {
        
        String s = "";
        
        for (int i = 0; i < TempAd.length(); i++)
        {
            char Vowel = ' ';
            char Consonant = ' ';
            Consonant = Vowel;
            Vowel = TempAd.charAt(i);
            
            if ((Vowel == 'a' || Vowel == 'e' || Vowel == 'y' || Vowel == 'u' || Vowel == 'o' || Vowel == 'i')) continue;
            
            s += Vowel;
        }
        return s;
    }
}
