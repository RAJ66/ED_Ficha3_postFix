/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha3_ex6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PostFix c = new PostFix();
        try {
            System.out.println(c.calcular("4 2 /"));
            System.out.println(c.calcular("3 4 + 2 *"));
            System.out.println(c.calcular("3 + + 2 *"));
            System.out.println(c.calcular("7 4 -3 * 1 5 + / *"));

        } catch (EmptyCollectionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
