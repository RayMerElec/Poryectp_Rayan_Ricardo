package Area;
import java.util.Scanner;
public class VolumenCubo {

    public static double calcularVolumenCubo(double lado) {
        double volumen = lado*lado*lado;
        return volumen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de un lado del cubo: ");
        double lado = scanner.nextDouble();

        double volumenCubo = calcularVolumenCubo(lado);
        System.out.println("El volumen del cubo es: " + volumenCubo);

    }
}
