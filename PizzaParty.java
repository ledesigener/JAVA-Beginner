//Carl Charlet

import java.util.Scanner;
import java.lang.Math;

public class PizzaParty
{
     public static void main (String [] args)
    {
        Pizza lunch = new Pizza("Chiken", 7, 12.6, 8);
        Pizza dinner = new Pizza("Peperoni and cheese", 14, 13.6, 7);
        System.out.println();
        printPizzaStats(lunch);
        System.out.println();
        printPizzaStats(dinner);
        System.out.println();
    }
    
    private static void printPizzaStats (Pizza pizza)
    {
        System.out.printf( "Your %s pizza has %.2f square inches per slice. ",pizza.GetName(), pizza.SliceArea());
        System.out.println();
        System.out.printf ("One slice costs $%.2f, which comes to $%.3f per square inch.",pizza.PizzaSliceCost(), pizza.SquareInchCost());
        System.out.println();
    }
}