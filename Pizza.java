//Carl Charlet

import java.util.Scanner;
import java.lang.Math;

class Pizza
{

    double CostOfPizza;
    String Name;
    int Slice;
    double Radius;
    
    //Constructors and Geeters
    
     Pizza (String pName,int pSlice,double pCost,double pRadius)
    {
        CostOfPizza = pCost;
        Name = pName;
        Slice = pSlice;
        Radius = pRadius;
    }
    
    public double PizzaSliceCost()
    {
        return CostOfPizza / Slice;
    }
    
    public String GetName()
    {
        return Name; 
    }
    
    public double SliceArea()
    {
        return ((1.0 / Slice) * Math.PI * (Math.pow(Radius, 2)));
    }
    public double SquareInchCost()
    {
        return (PizzaSliceCost() / SliceArea());
    }

}
     
    
