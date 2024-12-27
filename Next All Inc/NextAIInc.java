/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package driver.mainproject;

/**
 *
 * @author subek
 */
public class NextAIInc {
    
    //method to calculate and print total weekly pay or display an error message
    public void totalweeklypay(double basepay, int hoursworked ){
        
        //check if base pay is less than the minimum wage.
        if (basepay < 30000){
            System.out.println("error, base pay must not be less than ugx 30000");
        }
        
        //check if hursworked exceed the maximum limit
        if (hoursworked > 72){
            System.out.println("Error, hours worked must not be grater than 72 hours");
        }
        
        // clculate total pay and overtime.
        double totalpay;
        if(hoursworked <= 48){
            totalpay = basepay * hoursworked;
        }
        else{
            int regularhours = 48;
            int overtime = hoursworked - regularhours;
            totalpay = (regularhours * basepay) + (basepay * 2 * overtime);
        }
        
        //print the weekly total pay
        System.out.println("Weekly Total pay: ugx " + totalpay);
    }
    
   public static void main(String [] args){
       NextAIInc  nextAllnc = new NextAIInc();
       
       //test caes A.
       System.out.println("Case A.");
       nextAllnc.totalweeklypay(30000, 51);
       System.out.println();
       
       //Case B
       System.out.println("Case B:");
       nextAllnc.totalweeklypay(20000, 40);
       System.out.println();
       
   }
}


