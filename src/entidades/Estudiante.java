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
public class Estudiante extends Persona{
    public Estudiante(){}
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public Estudiante(
            String nombre
           ,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Estudiante(
         String nombre
        ,String apellido
        ,int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    private double nota;
    public Estudiante(
         String nombre
        ,String apellido
        ,int edad
        ,double nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    public double getNota(){return this.nota;}
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getApellido() {
        return this.apellido;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getEdad() {
        return this.edad;
    }
    
}
