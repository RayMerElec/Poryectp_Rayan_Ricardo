package Area;

import java.util.Scanner;

public class Rectangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa la longitud del rectángulo: ");
		double longitud = scanner.nextDouble();

		System.out.print("Ingresa el ancho del rectángulo: ");
		double ancho = scanner.nextDouble();

		double area = calcularArea(longitud, ancho);
		double perimetro = calcularPerimetro(longitud, ancho);

		System.out.println("Área del rectángulo: " + area);
		System.out.println("Perímetro del rectángulo: " + perimetro);

	}

	public static double calcularArea(double longitud, double ancho) {
		return longitud * ancho;
	}

	public static double calcularPerimetro(double longitud, double ancho) {
		return 2 * (longitud + ancho);
	}
}
