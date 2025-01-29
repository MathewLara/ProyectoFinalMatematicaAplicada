package sistemasdecuaciones;

import java.util.Scanner;

public class Sistemadeecuaciones {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese los coeficientes del sistema de ecuaciones:");
	        System.out.print("a: ");
	        double a = scanner.nextDouble();
	        System.out.print("b: ");
	        double b = scanner.nextDouble();
	        System.out.print("c: ");
	        double e = scanner.nextDouble();
	        System.out.print("d: ");
	        double c = scanner.nextDouble();
	        System.out.print("e: ");
	        double d = scanner.nextDouble();
	        System.out.print("f: ");
	        double f = scanner.nextDouble();
	        double det = a * d - b * c;
	        double detX = e * d - b * f;
	        double detY = a * f - e * c;

	        if (det != 0) {
	            double x = detX / det;
	            double y = detY / det;
	            System.out.println("El sistema tiene una única solución:");
	            System.out.printf("x = %.2f, y = %.2f%n", x, y);
	        } else {
	            if (detX == 0 && detY == 0) {
	                System.out.println("El sistema es indefinido: tiene infinitas soluciones.");
	            } else {
	                System.out.println("El sistema es inconsistente: no tiene solución.");
	            }
	        }

	        scanner.close();
	    }
	}


