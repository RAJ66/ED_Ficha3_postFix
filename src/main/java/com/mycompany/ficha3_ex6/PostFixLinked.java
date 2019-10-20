/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha3_ex6;

/**
 *
 * @author vitor
 */
public class PostFixLinked {
     private LinkedStack<Double> calc;

    public PostFixLinked() {
        this.calc = new LinkedStack<>();
    }

    public Double calcular(String texto) throws EmptyCollectionException {

        String[] partes = texto.split(" ");

        for (int i = 0; i < partes.length; i++) {
            switch (partes[i]) {
                case "+":
                    if (calc.size() < 2) {
                        System.out.println("Nao tem 2 elementos");
                        return null;
                    } else {
                        double numero1 = calc.pop();
                        double numero2 = calc.pop();
                        calc.push(numero1 + numero2);
                    }
                    break;

                case "-":
                    if (calc.size() < 2) {
                        System.out.println("Nao tem 2 elementos");
                        return null;
                    } else {
                        double numero1 = calc.pop();
                        double numero2 = calc.pop();
                        calc.push(numero1 - numero2);
                    }
                    break;

                case "*":
                    if (calc.size() < 2) {
                        System.out.println("Nao tem 2 elementos");
                        return null;
                    } else {
                        double numero1 = calc.pop();
                        double numero2 = calc.pop();
                        calc.push(numero1 * numero2);
                    }
                    break;

                case "/":
                    if (calc.size() < 2) {
                        System.out.println("Nao tem 2 elementos");
                        return null;
                    } else {
                        double numero1 = calc.pop();
                        double numero2 = calc.pop();
                        calc.push(numero2 / numero1);
                    }
                    break;

                default:
                    if (isDouble(partes[i])) {
                        calc.push(Double.parseDouble(partes[i]));
                    } else {
                        return null;
                    }

                    break;

            }

        }
        return calc.pop();
    }

    boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
