/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7;

/**
 *
 * @author petemi09
 * exercise_7
 */
public class employee {
    protected String name;
    protected String ssn;
    private double netPay;
    
    
public employee(String name, String ssn){
    this.name = name;
    this.ssn = ssn;
    netPay = 0.0;
}

public String getName(){
    return name;
}

protected void setName(String name){
    this.name = name;
}

public String getSsn(){
    return ssn;
}

public void setSsn(String ssn){
    this.ssn = ssn;
}




protected double getNetPay(){
    return netPay;
}


protected void printWeeklyCheck() {
    System.out.println(name + "'s pay this week is nothing");
}


}

