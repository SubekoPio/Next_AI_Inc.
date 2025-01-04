/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package driver.mainproject;

/**
 *
 * @author subek
 */
public class Next_AI_Inc {
    
    
     //method to calculate and print total weekly pay or display an error message
    public void totalweeklypay(double basepay, int hoursworked){
        //check if base pay is below the minimum wages.
        
        if (basepay < 30000){
            System.out.println("Error, Base pay must not be less the ugx 30000");
            return;
        }
        //check if hours worked exceed the maximum limit
        if(hoursworked > 72){
            System.out.println("Error, hours worked must not exceed 72 hours per week");
            return;
        }
        
        //calculate regular and overtime hours.
        double totalpay;
        if(hoursworked <= 48){
            totalpay = basepay * hoursworked;
        }
        else{
            int regularhours = 48;
            int overtimehours = hoursworked - regularhours;
            
            totalpay = (basepay * regularhours) + (basepay * 2 * overtimehours);
        }
        
        //print the total weekly pay
        System.out.println("");
        System.out.println("Total Weekly pay " + totalpay);
    }
    public static void main (String [] args){
        Next_AI_Inc cases = new Next_AI_Inc();
        
        //testing the programm using the given test cases.
        
        //test case A
        System.out.println();
        System.out.println("Contracto A:");
        cases.totalweeklypay(30000, 51);
        System.out.println();
        
        //contractor B
        System.out.println();
        System.out.println("Contracto B:");
        cases.totalweeklypay(20000, 40);
        System.out.println();
        
        //contractor c
         System.out.println();
         System.out.println("Contracto C:");
        cases.totalweeklypay(35000, 96);
        System.out.println();
        
     
       
    }
    
}
