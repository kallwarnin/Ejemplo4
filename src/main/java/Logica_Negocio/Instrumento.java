/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ADRIANA
 */
// Atributos
public class Instrumento {
    public String Nombre;
    public String Tipo;
    public String Num_serie;
    public int Año_fabricacion;
    
    //constructor no parametrizado
    public Instrumento (){
        
    }
    
    //constructor parametrizado

    public Instrumento(String Nombre, String Tipo, String Num_serie, int Año_fabricacion) {
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Num_serie = Num_serie;
        this.Año_fabricacion = Año_fabricacion;
    }
    
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setNum_serie(String Num_serie) {
        this.Num_serie = Num_serie;
    }

    public void setAño_fabricacion(int Año_fabricacion) {
        this.Año_fabricacion = Año_fabricacion;
    }
    
    //getters

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getNum_serie() {
        return Num_serie;
    }

    public int getAño_fabricacion() {
        return Año_fabricacion;
    }
    
}
    

