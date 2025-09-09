package Ejercicios.interfacesCatalogo.impl;

import Ejercicios.interfacesCatalogo.interfaces.IElectronico;

public class Electronico implements IElectronico {
    private String fabricante;

    public Electronico(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }
    
}
