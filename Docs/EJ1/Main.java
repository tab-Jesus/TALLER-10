/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.s2.taller10.Docs.EJ1;

/**
 *
 * @author JESUS DAVID
 */
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona ();
        
        Persona estudiante = new Estudiante ();

        Persona profesor = new Profesor ();

        
        persona.Presentarse();
        estudiante.Presentarse();
        profesor.Presentarse();
    }
}
