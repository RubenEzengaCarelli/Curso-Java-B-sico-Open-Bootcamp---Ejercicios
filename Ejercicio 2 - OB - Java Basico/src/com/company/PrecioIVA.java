/**
 * Supongamos que el IVA del precio de un producto es por ejemplo del 13%.
 */

package com.company;

import java.util.Scanner;

public class PrecioIVA {

    public static double precioIva(double precio) {
        double IVA;
        IVA = precio * 0.13;
        return IVA;
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        double precio, IVA;

        System.out.println("Ingrese el precio de la compra");

        precio = num.nextDouble();

        IVA = precioIva(precio);

        System.out.println("El precio sin IVA es: " + precio);
        System.out.println("El precio de la compra con el IVA es: " + (precio + IVA));

    }
}
