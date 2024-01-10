package Area;
import java.util.Scanner;
public class Cilindro {
    public static double calcularAreaCilindro(double radio, double altura) {
        double areaBase = 3.14* radio*radio;
        double areaLateral = 2 * 3.14 * radio * altura;
        double areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double areaCilindro = calcularAreaCilindro(radio, altura);
        System.out.println("El área del cilindro es: " + areaCilindro);

    }
}
