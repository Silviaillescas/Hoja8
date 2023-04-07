/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author silvi
 */
public class Paciente implements Comparable<Paciente> {
    String sintoma;
    String codigo;
    String nombre; 

    Paciente(String nombre, String sintoma, String codigo) {
        this.sintoma = sintoma;
         this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Paciente paciente) {
        return codigo.compareToIgnoreCase(paciente.codigo);
    }

    @Override
    public String toString() {
        return nombre + " " + sintoma + " " + codigo;
    }
}

