/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idomok;

/**
 *
 * @author TegzesMárton(SZF_202
 */
public abstract class Fa_idom {
    private static double fajsuly = 0.8;

    public Fa_idom() {
        
    }
    public abstract double terfogat();  
    public double suly(){
        return this.terfogat()*fajsuly;
    }

    @Override
    public String toString() {
        return "Fa_idom{" + "suly="+ suly() +'}';
    }
    
    
}
