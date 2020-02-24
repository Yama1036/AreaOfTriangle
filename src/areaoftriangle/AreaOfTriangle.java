/*
 * Yama
 * 24/02/2020
 * This code output the area of the triangle by three different side length.
 */

package areaoftriangle;
import javax.swing.*;
/**
 *
 * @author ayyam8774
 */
public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        int num = 0;
        double a,b,c; // ← side lengths.
        double semi = 0; // ← this is variable of semi-paramiter.
        double area; // ← total area.
        double round; // ← round version of total area.
        
        // use try and catch statement to avoid error.
        
        try
        {
                // getting side lengths from user.
                a = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Length A in cm"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Length B in cm"));
                c = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Length C in cm"));
                
                // make sure the triangle is Scalene triangle(Every side lenghs are different)
                if (a == b || a == c || b == c) {
                    System.out.println("Number of sidelengths must all be different");
                    num = 0;
                } else {
                    num = 1;
                }
                
                
            while (num != 1);
                {
                    // calculate semi paramiter.
                    semi = (a + b + c) / 2;
                    
                    // make sure that data entered is valid
                    if(semi == 0 || a >= semi || b >= semi || c >= semi)
                    {
                        throw new Exception();
                    }
                    
                // calculating the area by using Heron's formula.
                    area = Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c));
                    
                    System.out.println("The area of this triangle is : " + area + "cm^2");
                    
                    round = Math.round(area);
                    
                    System.out.println("Round : " + round + "cm^2");
            } 
}
        catch (Exception e) {
            System.err.println("Impossible side length data entered...");
        }
    }
}
    
