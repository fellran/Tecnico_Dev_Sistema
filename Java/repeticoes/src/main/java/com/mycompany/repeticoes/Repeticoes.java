/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repeticoes;

/**
 *
 * @author ead
 */
public class Repeticoes {

    public static void main(String[] args) {
        int cont = 0;
        
        while (cont <= 10){
            cont = cont + 1;
            if (cont == 6 || cont == 8) {
                continue;
            }
            System.out.println(cont);
        }
    }
}
