/* 1. Hacer un programa que muestre en la pantalla el siguiente mensaje:

*
**
****
*****
*/

public class HologramaTriangulo {
    public static void main(String[]args){
        String simbol = "*";
        String cantSimbol = "";

        System.out.println("*******************");
        System.out.println("HOLOGRAMA TRIÁNGULO:");
        System.out.println("*******************");

        for (int i=0; i < 4; i++){
            System.out.println(simbol + cantSimbol);
            cantSimbol = cantSimbol + simbol;
        }
        
    }
}

/* 2. Hacer un programa que muestre en la pantalla el siguiente mensaje:

********
*      *
*      *
*      *
********
*/

public class HologramaCuadrado {
    public static void main(String[] args) {
        int ancho = 8;  
        int alto = 5; 
        
        System.out.println("*******************");
        System.out.println("Holograma Cuadrado:");
        System.out.println("*******************");

        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < alto - 2; i++) {
            System.out.print("*");  
            for (int j = 0; j < ancho - 2; j++) {
                System.out.print(" ");  
            }
            System.out.println("*");  
        }

        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println(); 
    }
}

/* 3. La empresa ACME desea calcular el valor de la nómina de un empleado, tanto el sueldo bruto como el
sueldo neto. El sueldo bruto se calcula a partir del valor de la hora y la cantidad de horas trabajadas. A
esto se le descuenta el valor de la EPS que es el 4%, el valor de la Pensión que es el 4%. El sueldo neto
es el sueldo bruto menos los descuentos. Mostrar al final, el valor del sueldo bruto, cada uno de los
descuentos y el valor del sueldo Neto. Para este ejercicio el valor de la hora es $20.000. */

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

/* 4. Hacer un algoritmo que dado una cantidad de segundos, calcule cuantas horas, minutos y segundos son

Ejemplo1:

Entrada:
    Segundos: 145
Salida:
    0 horas
    2 minutos
    25 segundos

Ejemplo 2:

Entrada:
    Segundos: 3725
Salida:
    1 horas
    2 minutos
    5 segundos  
*/

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

/* 5. Hacer un algoritmo que dado una nota (de 0.0 a 5.0), calcule la curva de 8 de la nueva nota. La curva
de 8 se calcula multiplicando la nota por 0.8 y sumándole 1.  */

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