package edu.guilford;

import java.util.ArrayList;

public class CoffeeDriver {
    public static void main(String[] args) {
         
         // Declare an ArrayList of Coffee objects
            ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        
            // Add 5 Coffee objects to the ArrayList given a specific length
            for (int i = 0; i < 10; i++) {
                coffees.add(new Coffee(5));
            }
           
            
            

            // Print out the ArrayList
            System.out.println(coffees);

  
    }

    }
