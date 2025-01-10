/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.polimorfismoestatico;

import ec.edu.espoch.polimorfismoestatico.clases.Calculadora;

/**
 *
 * @author SO-LAB1-PC14
 */
public class PolimorfismoEstatico {

    public static void main(String[] args) {
 Calculadora objCalculadora= new Calculadora();
 int result = objCalculadora.sumar(5, 7);
 int result2 = objCalculadora.sumar(5, 5, 5);
double result3= objCalculadora.sumar(5, 5);
double result4= objCalculadora.sumar(7, 7);
 
    }
}