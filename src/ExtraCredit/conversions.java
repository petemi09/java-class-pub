/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtraCredit;

/**
 *
 * @author petemi09
 */
public class conversions {
    public Double y2m(Double valueFrom) {
        return valueFrom * 0.91;
    }
    
    public Double m2y(Double valueFrom) {
        return valueFrom * 1.09;    
    }
    
    
    
    
    public Double f2m(Double valueFrom) {
        return valueFrom * 0.3048 * 0.3048;
    }
    
    public Double m2f(Double valueFrom) {
        return valueFrom / 0.3048 / 0.3048;
    }
    
    
    
    
    
    public Double Vm2f(Double valueFrom) {
        return valueFrom * 0.3048 * 0.3048 * 0.3048;
    }
    
    public Double Vf2m(Double valueFrom) {
        return valueFrom / 0.3048 / 0.3048 / 0.3048;
    }
    
    
    
    public Double Mg2p(Double valueFrom) {
        return valueFrom * 2.2046;
    }
    
    public Double Mp2g(Double valueFrom) {
        return valueFrom / 2.2046;
    }
    
    
    
    public Double PPSQFT2KGPSQM(Double valueFrom) {
        return valueFrom * 0.006944;
    }
    
    public Double KGPSQM2PPSQFT(Double valueFrom) {
        return valueFrom * 0.204816;
    }
    
}
