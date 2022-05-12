package com.company;

public class ListaCircularDoble {
    Nodo primero;
    int size;

    public void add(Nodo nuevo){
        if(primero != null){
            if (primero.getAnterior() != null){
                nuevo.setAnterior(primero.getAnterior());
                primero.getAnterior().setSiguiente(nuevo);
            }else {
                primero.setSiguiente(nuevo);
                nuevo.setAnterior(primero);
            }
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
        }else {
            primero = nuevo;
        }
        size++;
    }

    public void mostrar(){
        Nodo actual = primero;
        do {
            System.out.print(actual.getDigito());
            actual = actual.getSiguiente();
        }while (actual != primero);
    }

    public void vistaSuma(){
        Nodo actual = primero.getAnterior();
        do {
            System.out.print(actual.getDigito());
            actual = actual.getAnterior();
        }while (actual != primero.getAnterior());
    }

    public void invertir() {
        primero = primero.getAnterior();
        Nodo siguiente = primero.getAnterior(), actual = primero, ultimo = primero.getSiguiente();
        for (int i = 0; i < size; i++) {
            if (siguiente != ultimo) {
                siguiente.setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(siguiente);
                primero.setAnterior(siguiente.getAnterior());
                siguiente.setAnterior(actual);
                actual.setSiguiente(siguiente);
                primero.getAnterior().setSiguiente(primero);
                actual = siguiente;
                siguiente = primero.getAnterior();
            }
        }
    }
}
