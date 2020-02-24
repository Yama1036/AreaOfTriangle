/*
 * Yama
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        // use try and catch statement to avoid error.
        
        try 
        {
            do
            {
                // getting side lengths from user.
                a = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Lenth A in cm"));
                b = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Lenth B in cm"));
                c = Double.parseDouble(JOptionPane.showInputDialog("Enter Side Lenth C in cm"));
                
                // make sure the triangle is Scalene triangle(Every side lenghs are different)
                if (a == b || a == c || b == c) {
                    System.out.println("Values of sidelengths must all be different");
                    num = 0;
                } else {
                    num = 1;
                }
                
                
        } while (num != 0);
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
                    
                    System.out.println("The area of this triangle is : " + area);      
            } catch (Exception e)
            {
                System.err.println("Impossible side length data entered");
            }
}
    
