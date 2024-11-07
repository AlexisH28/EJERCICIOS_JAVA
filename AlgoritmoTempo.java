import java.util.Scanner;

public class AlgoritmoTempo {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Buenas, por favor ingresar la cantidad de segundos: ");
        int segundos = teclado.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int SegundosRestantes = segundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos Restantes: " + SegundosRestantes);

        teclado.close();
    }
}
