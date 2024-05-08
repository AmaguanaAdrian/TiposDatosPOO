/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        //TIPOS DE DATOS
        //1.- ENTERO
        //1.1.- DECLARACION CON VALOR 
        int numeroUno = 0;
        int numeroDos = 0;
        
        //SOBRE ESCRIBIR EL VALOR
        numeroUno = 17;
        numeroDos = 43;
        
        //SUMA 2 NÚMEROS
        int resultado = numeroUno + numeroDos;
        
        //IMPRIMIR CADENA SALIDA DE INFORMACIÓN
        System.out.println("El resultado es:"+resultado);
        
        //1.3.- UTILIZACIÓN DE ENTRADAS
        Scanner s = new Scanner(System.in);
        
        //TRANSFORMAR DE DATO PRIMITIVO A OBJETO
        System.out.println("Ingrese numero 1");
        int num1 = Integer.parseInt(s.next());
        
        System.out.println("Ingrese numero 2");
        int num2 = Integer.parseInt(s.next());
        
        num1+=num2; // num1 = num1 + num2
        
        System.out.println("El resultado es: " + num1);
        
        //TRANSFORMAR DE OBJETO A DATO PRIMITIVO
        String cadena = "La suma de 2 números enteros es:";
        
        System.out.println("Ingrese número 1:");
        int n1 = Integer.parseInt(s.next());
        
        System.out.println("Ingrese número 2:");
        int n2 = s.nextInt();
        
        int resul = n1 + n2;
        // +"" TRANSFORMA CUALQUIER TIPO DE DATO A CADENA
        cadena+=resul+"";
        
    }
}
