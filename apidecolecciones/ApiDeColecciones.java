/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apidecolecciones;

/**
 *
 * @author
 * x
 */

import java.util.*;
public class ApiDeColecciones {

    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // import java.util.*; el ide no lo importa
        // arraylist crecen dinamicamente
        List miLista = new ArrayList();
        
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        for (Object object : miLista) {
            System.out.println("Valor="+object);
        }
        
        //con lambda recibe por parametro el tipo de dato que quiera llamarlo
        // en este caso lo llame object, es el objeto a iterar
        // y dentro de {} va el cuerpo de la funcion
        //donde se especifica que hace, en este caso
        //es un print
        
        miLista.forEach(object ->{
            System.out.println("Valor con lambda="+object);
        });
    }
    
}
