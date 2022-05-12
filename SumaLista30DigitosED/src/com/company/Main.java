package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ListaCircularDoble numero1 = new ListaCircularDoble();
        ListaCircularDoble numero2 = new ListaCircularDoble();

        String fichero = "salida.txt";
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            for (char digito:linea.toCharArray()) {
                Nodo nuevo = new Nodo(Integer.parseInt(digito + ""));
                numero1.add(nuevo);
            }
            linea = br.readLine();
            for (char digito:linea.toCharArray()) {
                numero2.add(new Nodo(Integer.parseInt(digito + "")));
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayList<ListaCircularDoble> sumaNumeros = new ArrayList<>();
        sumaNumeros.add(numero1);
        sumaNumeros.add(numero2);
        sumaNumeros.add(suma(numero1, numero2));
        sumaNumeros.get(0).mostrar();
        System.out.println();
        sumaNumeros.get(1).mostrar();
        System.out.println("\t+");
        System.out.println("----------------------------------------");
        sumaNumeros.get(2).invertir();
        sumaNumeros.get(2).mostrar();
    }

    private static ListaCircularDoble suma(ListaCircularDoble numero1, ListaCircularDoble numero2){
        ListaCircularDoble resultado = new ListaCircularDoble();
        Nodo actual1 = numero1.primero.getAnterior();
        Nodo actual2 = numero2.primero.getAnterior();
        int suma = 0;
        do {
            suma += actual1.getDigito() + actual2.getDigito();
            resultado.add(new Nodo(suma%10));
            if (suma > 9){
                suma = 1;
            }else {
                suma = 0;
            }
            actual1 = actual1.getAnterior();
            actual2 = actual2.getAnterior();
        }while (actual1 != numero1.primero.getAnterior());
        if (suma == 1){
            resultado.add(new Nodo(1));
        }
        return resultado;
    }
}
