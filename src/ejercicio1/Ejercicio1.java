/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.*;
/**
 *
 * @author Maria Jose Bastidas
 * @version 1
 * @since 9/08/2017
 */
public class Ejercicio1 {
    /**
     * @param args the command line arguments
     */
        
public static double calcularSalario (int horas, int valor){
    
    double totalSalario = 0;


    return totalSalario;
}
        
        
    public static void main(String[] args) {
        
      Scanner flujoEnt = New Scanner (System.in);
//Declaracion de variables
 String nombre = null;
int numHoras = 0;
double valorHora = 0;
double valorPagar = 0;
// TODO code application logic here
 //lectura de datos
System.out.printIn ("Nombre:");
nombre = flujoEnt.next();

System.out.printIn ("Horas trabajadas");
numHoras = flujoEnt.nextInt ();

    
System.out.printIn ("Valor hora");
valorHora = flujoEnt.nextDouble ();

// invocamdo la funcion

valorPagar = calcularSalario (numHoras, numHoras);
System.out.printIn ("nombre" + nombre + "pago" + valorPagar);
        }
}