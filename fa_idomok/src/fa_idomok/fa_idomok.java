/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fa_idomok;

import idomok.Fa_idom;
import idomok.Gomb;
import idomok.Hasab;
import java.util.ArrayList;
import java.util.List;

public class fa_idomok {

    private List<Fa_idom> fa_idom;

    public fa_idomok() {
        run();
    }

    public static void main(String[] args) {
        new fa_idomok();
    }

    private void run() {
        fa_idom = new ArrayList<>();
        fa_idom.add(new Gomb(3));
        fa_idom.add(new Hasab(1, 2, 3));
        System.out.println(fa_idom.toString());
        System.out.println("Öszsúly: " + osszSuly());
        
         System.out.println("Ösz Göm súly:"+ osszGombSuly());
        
        
    }

    public double osszSuly() {
        double oszsuly = 0;
        for (Fa_idom fa_idom : fa_idom) {
            if (fa_idom != null) {

                oszsuly += fa_idom.suly();
            }

        }
        return oszsuly;

    }

    public double osszGombSuly() {
        double oszsuly = 0;
        for (Fa_idom faidom : fa_idom) {
            if (fa_idom != null) {
                if (faidom instanceof Gomb) {
                    oszsuly += faidom.suly();
                }
            }
        }

        return oszsuly;

    }
}
