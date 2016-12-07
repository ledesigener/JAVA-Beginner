public class Name
{

    // Initialize the attributes

    String FirstName  = null;
    String MiddleName = null;
    String LastName   = null;
    
    // we will accept only one Character for Middle name
    
    Name (String First, char Middle, String Last)
    {
        FirstName  = First; 
        MiddleName = Middle + "";
        LastName   = Last;
    }
    
    Name (String First, String Last)
    {
        FirstName  = First; 

        LastName   = Last;
    }
    
    public String getNormalOrder()
    {
        return Combine( " ", FirstName, CallCombine( MiddleName != null, "", MiddleName, "." ), LastName);
    }

    public String getReverseOrder()
    {
        return Combine( " ", Combine("", LastName, ","), FirstName, CallCombine(MiddleName != null, "", MiddleName, "."));
    }
    
    public String getInitials()
    {
        return Combine("", FirstName.charAt(0), MiddleName, LastName.charAt(0) );
    }
    private String CallCombine(boolean condition, Object delimiter, Object... item)
    {
        return condition? Combine(delimiter, item) : null;
    }
    
    private String Combine(Object delimiter, Object... item)
    {
        String s = ""; 
        Object x;
        
        for (int j = 0; j < item.length; j++) 
        {
            x = item[j];
            
            if (x != null) 
            {
                s += (j == 0) ? ("" + x) : ("" + delimiter + x);
            }
        }
        
        return s;
    }

}