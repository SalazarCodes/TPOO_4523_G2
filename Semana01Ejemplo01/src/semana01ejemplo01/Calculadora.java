/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana01ejemplo01;

import java.util.List;

/**
 *
 * @author luisfelipe.salazar
 */
public class Calculadora {
    
    // Clase que almacena un método de suma con sobrecarga
    
    /**
     * Suma dos números enteros
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Suma dos números decimales (sobrecarga)
     */
    public double sumar(double a, double b) {
        return a + b;
    }
    
    /**
     * Suma tres números enteros (sobrecarga)
     */
    public int sumar(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("No se permiten números negativos en la suma de tres números");
        }
        return a + b + c;
    }
    
    /**
     * Suma todos los números de una lista (sobrecarga con colecciones)
     * Retornará un error si la lista está vacía o es null
     */
    public int sumarLista(List<Integer> numeros) {
        // Manejo de errores
        if (numeros == null) {
            throw new IllegalArgumentException("La lista no puede ser null");
        }
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }
        
        int suma = 0;
        for (Integer numero : numeros) {
            if (numero != null) {
                suma += numero;
            }
        }
        return suma;
    }
}
