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


/* 3. La empresa ACME desea calcular el valor de la nómina de un empleado, tanto el sueldo bruto como el
sueldo neto. El sueldo bruto se calcula a partir del valor de la hora y la cantidad de horas trabajadas. A
esto se le descuenta el valor de la EPS que es el 4%, el valor de la Pensión que es el 4%. El sueldo neto
es el sueldo bruto menos los descuentos. Mostrar al final, el valor del sueldo bruto, cada uno de los
descuentos y el valor del sueldo Neto. Para este ejercicio el valor de la hora es $20.000. */

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

/* 5. Hacer un algoritmo que dado una nota (de 0.0 a 5.0), calcule la curva de 8 de la nueva nota. La curva
de 8 se calcula multiplicando la nota por 0.8 y sumándole 1.  */