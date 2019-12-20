/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Laboratorio
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    public abstract void 
        setNombre(String nombre);
    public abstract String getNombre();
    public abstract void 
        setApellido(String apellido);
    public abstract String getApellido();
    public abstract void setEdad(int edad);
    public abstract int getEdad();
    public static void saludar(){
        System.out.println("Hola!");
    }
    
}
