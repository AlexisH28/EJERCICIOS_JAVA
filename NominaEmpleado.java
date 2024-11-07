import java.util.Scanner;

public class NominaEmpleado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Buenas, como se encuentra?");
        System.out.print(" Por favor ingresar la cantidad de horas trabajadas: ");
        int HorasTrabajadas = teclado.nextInt();
        
        int ValorHora = 20000;
        
        int SueldoBruto = HorasTrabajadas * ValorHora;

        double DescuentoEPS = SueldoBruto * 0.04;
        double DescuentoPension = SueldoBruto * 0.04;
        
        double SueldoNeto = SueldoBruto - (DescuentoEPS + DescuentoPension);
        
        System.out.println("Sueldo Bruto: $" + SueldoBruto);
        System.out.println("Descuento EPS (4%): $" + DescuentoEPS);
        System.out.println("Descuento Pensión (4%): $" + DescuentoPension);
        System.out.println("Sueldo Neto: $" + SueldoNeto);

        teclado.close();
    }
}
