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
public class employeeChecker {
    public static void main(String[] args){
        HourlyEmployee me = new HourlyEmployee("Mitchell Petellin", "777-77-777", 25.00, 1600);
        
        System.out.println(me.getName());
        System.out.println(me.getSsn());
        System.out.println(""+ me.getHours());
        System.out.println("" + me.getWageRate());
        me.printWeeklyCheck();
        
    }
}
