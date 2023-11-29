/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idomok;

/**
 *
 * @author TegzesMárton(SZF_202
 */
public class Hasab extends Fa_idom{
    
    private double a, b, magassag;

    public Hasab(double a, double b, double magassag) {
        this.a = a;
        this.b = b;
        this.magassag = magassag;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getMagassag() {
        return magassag;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }

    @Override
    public double terfogat() {
       return a * b* magassag; 
    }
    
     @Override
    public String toString() {
        return "Hasab{" + "a=" + a + " b=" + b + " magassag=" + magassag + " suly=" + super.suly() + " terfogat=" + terfogat() +'}';
    }
    
}
