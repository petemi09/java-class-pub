/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author petemi09
 */
public class EmployeeTester {
    public static void main(String[] args){
        // I find it funny to see that a years age would be 40,000 yet each pay week is fairly low
        HourlyEmployee me = new HourlyEmployee("Mitchell O. Petellin", "777-77-777", 25.00, 1600.00);
        SalariedEmployee me2 = new SalariedEmployee("Madeline W. Petellin", "171-71-717", 10000);
        
        System.out.println(me2.getName());
        System.out.println(me2.getSsn());
        System.out.println(me2.getSalary());
        
        
        me2.printWeeklyCheck();
        
        System.out.println("Full Name: " + me.getName());
        System.out.println("SSN: " +me.getSsn());
        System.out.println("my hourly pay: " + me.getWageRate()+"0!");
        System.out.println("This years hours that have been logged : "+ me.getHours()+"0 (this is in one year)");
        
        me.printWeeklyCheck();
        
        //-------------------------------------------
        
        System.out.println("Full Name: " + me.getName());
        System.out.println("SSN: " +me.getSsn());
        System.out.println("my hourly pay: " + me.getWageRate()+"0!");
        System.out.println("This years hours that have been logged : "+ me.getHours()+"0 (this is in one year)");
        
        me.printWeeklyCheck();
    }
}
    
