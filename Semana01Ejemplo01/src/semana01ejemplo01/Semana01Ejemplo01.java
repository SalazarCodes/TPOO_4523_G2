/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana01ejemplo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Semana01Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumando1; //tipo de variable nombre de variable;
        int sumando2 = 10; // inicialización de variable
        
        sumando1 = 15;
        
        int suma = sumando1 + sumando2;
        
        //System.out.println("hola mundo!!"); // comentario de una línea
        /**/ // comentario de varias líneas
        System.out.println(suma);
        
        System.out.println("La suma es: " + suma);
        System.out.println(sumando1 + " + " + sumando2 + " es " + suma);
        
        System.out.println("\nCalculadora con metodos en sobrecarga");
        Calculadora calc = new Calculadora();
        
        int resultadoTresNumeros = calc.sumar(328, 123, 1234);
        System.out.println("La suma de los 3 numeros es: " + resultadoTresNumeros);
        
        //Suma con colecciones (listas)
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1785);
        listaNumeros.add(175);
        listaNumeros.add(348);
        listaNumeros.add(412);
        listaNumeros.add(9642);
        listaNumeros.add(6749);
        
        int sumaLista = calc.sumarLista(listaNumeros);
        System.out.println("La suma de la lista es: " + sumaLista);
        
        
        
    }
    
}
