package Area;

import java.util.Scanner;

public class Area_Cubo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingresa el lado del cubo: ");
		double lado = scanner.nextDouble();

		double area = calcularAreaCubo(lado);

		System.out.println("Área del cubo: " + area);

	}

	public static double calcularAreaCubo(double lado) {
		return 6 * Math.pow(lado, 2);
	}
}
