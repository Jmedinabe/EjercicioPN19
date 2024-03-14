package com.mycompany.ejerciciopn19;
import java.util.Scanner;
public class EjercicioPN19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del triángulo: ");
        double lado = scanner.nextDouble();
        double perimetro = 3 * lado;

        double altura = Math.sqrt(3) / 2 * lado;

        double area = (Math.sqrt(3) / 4) * lado * lado;

        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("La altura es: " + altura);
        System.out.println("El área es: " + area);

        scanner.close();
    }
}
