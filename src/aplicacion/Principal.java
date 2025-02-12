package aplicacion;
import mates.Matematicas;
import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número de dardos: ");
        int dardos = scanner.nextInt(); 
        double pi = Matematicas.generarNumeroPiIterativo(dardos);
        System.out.println("El número PI es aproximadamente: " + pi);
        scanner.close();
    }
}
