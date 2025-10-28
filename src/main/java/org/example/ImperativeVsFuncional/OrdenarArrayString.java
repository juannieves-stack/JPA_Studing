package org.example.ImperativeVsFuncional;

import javax.sound.midi.Soundbank;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarArrayString {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan","Flor","Luciana","Sol","Sofia","Maria");
        //Buscamos en el array los Strings que comiencen con S
        //los colocamos en un nuevo array
        System.out.println(nombres);
        System.out.println("Ordenamos esta lista solo los nombres con S al inicio");
        //<-------------------Enfoque Imperativo------------------->
        System.out.println("Enfoque imperativo");
        List<String> resultado = new ArrayList<>();
        for (String nombre: nombres){
            if (nombre.startsWith("S")){
                resultado.add(nombre);
            }
        }
        Collections.sort(resultado);
        System.out.println("Con forEach");
        for( String n : resultado){
            System.out.println(n);
        }
        System.out.println("En forma de lista ");
        System.out.println(resultado);
        //<-------------------Enfoque Funcional------------------->
        System.out.println("Enfoque imperativo");
        System.out.println("Con collect");
        List<String> resultado2 = nombres.stream()
                .filter(n->n.startsWith("S"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(resultado2);
        System.out.println("Con forEach");
        nombres.stream()
                .filter(n->n.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
