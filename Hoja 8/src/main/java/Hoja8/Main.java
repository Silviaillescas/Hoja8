/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Hoja8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Stream;

/**
 *
 * @author silvi
 */

public class Main {
    public static void main(String[] args) {
        Vector listaPacientes = new Vector<Paciente>();

    
        Scanner read = new Scanner(System.in);
        String archivonombre;
        System.out.println("Ingresa el nombre del archivo");
        archivonombre = read.next();
        ArrayList<String> archivo = new ArrayList<>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(archivonombre + ".txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(archivo::add);
        } catch (IOException e) {
            System.out.println("ocurrió un error");
        }

        for (String linea : archivo) {
            ArrayList<String> pacienteArray = new ArrayList();
            for (String info : linea.trim().split(",")) {
                pacienteArray.add(info);
            }

            listaPacientes.add(new Paciente(pacienteArray.get(0), pacienteArray.get(1), pacienteArray.get(2)));
        }

        VectorHeap colaPacientes = new VectorHeap(listaPacientes);
       
        Boolean continuar = true;

        while (continuar) {
            System.out.println(colaPacientes.remove());
            System.out.println("Mostrar siguiente paciente? s - n");
            String continuarText = read.next();
            continuar = continuarText.equals("s") && !colaPacientes.isEmpty();
        }
    }
}

