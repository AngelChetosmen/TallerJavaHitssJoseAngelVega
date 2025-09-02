package Ejercicios.HerenciaBanco.test;

import java.util.List;

import Ejercicios.HerenciaBanco.clases.Chequera;
import Ejercicios.HerenciaBanco.clases.CuentaBancaria;
import Ejercicios.HerenciaBanco.clases.CuentaDeAhorro;

public class TestMain {
  public static void main(String[] args) {
    //List <Integer> list = new ArrayList<Integer>();

    CuentaBancaria cb1 = new CuentaDeAhorro(1, "Eloy", 15000, 0.05);
    CuentaBancaria cb2 = new Chequera(2, "Angelica", 10000, 5000);
    CuentaDeAhorro cb3 = new CuentaDeAhorro(3, "Juan", 6000, 0.04);

    cb1.mostrarInfo();
    cb2.mostrarInfo();
    cb3.mostrarInfo();

    System.out.println("============Operaciones=============");
    cb1.retirar(5000);
    cb1.retirar(1500);
    ((CuentaDeAhorro)cb1).aplicarIntereses(); // Casteo para llamar al metodo de la subclase
    // El Casteo se refiere a convertir un objeto de una clase padre en una de una subclase
    System.out.println("Cuenta 1: ");
    cb1.mostrarInfo();

    System.out.println("Cuenta 2: ");
    cb2.retirar(2500);
    cb2.mostrarInfo();
  }  
}
