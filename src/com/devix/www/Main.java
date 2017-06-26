package com.devix.www;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int j, r, tabla = 0;
        tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
        for (int i = 1; i <= 10; i++) {

            r = i * tabla;
            System.out.println(tabla + " * " + i + " = " + r);
        }

    }
}
