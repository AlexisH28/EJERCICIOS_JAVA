import java.util.Scanner;

public class CalculadorNotas {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola, por favor ingresa una nota de (0.0 a 5.0): ");
        double Nota = teclado.nextDouble();

        double NuevaNota = (Nota * 0.8) + 1;

        System.out.println("La curva de 8 de la nota es de: " + NuevaNota);
        teclado.close();

    }
}
