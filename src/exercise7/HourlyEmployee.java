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
public class HourlyEmployee extends employee {
    private double wageRate;
    private double hours;

    
    public HourlyEmployee(String name, String ssn, double wageRate, double hours){
        super(name, ssn);
        this.wageRate = wageRate;
        this.hours = hours;
    }
    
    public double getWageRate(){
        return wageRate;
    }
    public void setWageRate(double wageRate){
        this.wageRate = wageRate;
    }
    
    public double getHours(){
        return hours;
    }
    public void setHours(double hours){
        this.hours = hours;
    }
        
    
    public void printWeeklyCheck() {
        double check = ((hours * wageRate / 52));
        //String check <
        System.out.printf(name + "'s weekly pay is, $ %.02f", check);
    }
}






    
