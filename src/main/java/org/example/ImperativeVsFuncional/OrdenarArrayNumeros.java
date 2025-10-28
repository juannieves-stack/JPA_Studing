package org.example.ImperativeVsFuncional;

import java.util.*;
import java.util.stream.Collectors;

public class OrdenarArrayNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1 ,7 ,4);
        List<Integer> pares = new ArrayList<>();
        //<----------------Usamos enfoque Imperativo---------------->
        //Filtramos numeros pares
        for (Integer num: numeros){
            if ( num %2 ==0){
                //Los guardamos en un array nuevo
                pares.add(num);
            }
        }
        System.out.println("Teniendo un Array con numeros lo ordenamos de dos formas ");
        System.out.println(numeros);
        System.out.println("Por enfoque Imperativo");
        //Ordenamos la lista
        Collections.sort(pares);
        System.out.println(pares);

        //<----------------Usamos enfoque Funcional---------------->
        System.out.println("Por enfoque Funcional");
        List<Integer> pares2 = numeros.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Con collect");
        System.out.println(pares2);
        System.out.println("Con forEach");
        numeros.stream()
                .filter(num -> num % 2 ==  0)
                .forEach(System.out::println);

    }
}
