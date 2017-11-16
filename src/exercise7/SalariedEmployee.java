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
public class SalariedEmployee extends employee {
    private double salary;
    
    public SalariedEmployee(double salary, String name, String ssn){
        super(name, ssn);
        this.salary = salary;
        
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public void printWeeklyCheck(String name){
        System.out.println(name + "'s weekly pay is " + salary);
    }
    
   
    
    
}
