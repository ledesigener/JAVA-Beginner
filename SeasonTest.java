import java.util.Scanner;

class SeasonTest
{

    // Define globalstatic constant in order to be call in a static method.

    private static final String FALL   = "fall";
    private static final String WINTER = "winter";
    private static final String SUMMER = "summer";
    private static final String SPRING = "spring";
    private static final String IMPOSSIBLE = "Impossible!";
    
    public static void main (String[] args)
    {

        //Keyboard Entry from user. Month and day from user

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print( "What month: ");
        int month = keyboard.nextInt(); 
        
        System.out.print( "What day: ");
        int day = keyboard.nextInt();

        // Print the season

        System.out.println(season(month, day) + " is The season ");
    }
    
    // Season Calculation Method
    
    private static String season (int Month, int Day)
    {
            //Ivalid Cate Calucation
            
        if (check(Month, Day)) return IMPOSSIBLE; 
            //System.out.println("Month Should be no Greater than 12 and day No Greater than 31"); 
            
            // Evaluate Date Range
        if (SeasonRange(Month, Day, 9, 16, 12, 15)) return FALL;
        else if (SeasonRange(Month, Day, 3, 16, 6, 15)) return SPRING;
        else if (SeasonRange(Month, Day, 6, 16, 9, 15)) return SUMMER;
        else return WINTER; 
        
    }
    
      private static boolean check (int month, int day)
    {
        // 30 days per month verification.

        if ((day <= 0) || (day > 31)) return true; 
            
        // 12 months per year verification

        if ((month <= 0) || (month > 12))      return true; 

        if (((month == 4) || (month == 46) || (month == 9) || (month == 11)) && (day > 30)) return true;
        
        // Check February for 28 days (we will neglect when February has 29 days).
        
        if (month == 2 && day > 28) return true; 
        
        return false;
    }

    private static boolean SeasonRange (int Month, int Day, int M1, int D1, int M2, int D2)
    {
        if (Month == M1 && Day >= D1) return true;  
        if (Month == M2 && Day <= D2) return true;
        if (Month > M1 && Month < M2) return true; 
        return false;
    }
}