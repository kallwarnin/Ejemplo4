/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Instrumento;
import java.util.Scanner;

/**
 *
 * @author ADRIANA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Atributos
        String Nombre="";
        String Tipo="";
        String Num_serie="";
        int Año_fabricacion=0;
        int Año_acual=2023;
        
        //creacion de objetos
         Instrumento objinstrumento = new Instrumento();
         Scanner scan = new Scanner (System.in);
         
         
         System.out.println("ingrese el nombre del instrumento");
         Nombre= scan.nextLine();
         objinstrumento.setNombre(Nombre);
         
         System.out.println("ingrese el tipo de instrumento");
         Tipo= scan.nextLine();
         objinstrumento.setTipo(Tipo);
         
         System.out.println("ingrese el numero de serie del instrumento");
         Num_serie= scan.nextLine();
         objinstrumento.setNum_serie(Num_serie);
         
         System.out.println("ingrese el año de fabricacion del instrumento ");
         Año_fabricacion= scan.nextInt();
         objinstrumento.setAño_fabricacion(Año_fabricacion);
        int Año_actual = 2023;
         
         
         //operacion
         int resultado= Año_actual - objinstrumento.getAño_fabricacion();
         
         System.out.println("el nombre del instrumento es:"+"\t"+objinstrumento.getNombre());
         System.out.println("el tipo de instrumento es:"+"\t"+objinstrumento.getTipo());
         System.out.println("el numero de serie del instrumento es:"+"\t"+objinstrumento.getNum_serie());
         System.out.println("los años que lleva el instrumento desde su fabricacion es:"+"\t"+resultado);
    }
    
}
