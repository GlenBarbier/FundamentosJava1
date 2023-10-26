/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.java.pkg1;

/**
 *
 * @author Glendita
 */
public class FundamentosJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //BUCLES
        /*
        
Los bucles `for` y `while` en Java se utilizan para la repetición de código:

- `for`: Ideal para realizar un número conocido de iteraciones. Se compone de inicialización, condición y actualización.

- `while`: Utilizado cuando no se conoce el número exacto de iteraciones. Repite mientras se cumple una condición booleana.

Ambos bucles son fundamentales para controlar el flujo de ejecución en programas Java.
        
        
        Crear 3 variables:
        - Nombre
        - Edad
        - Salario
        */
        
        System.out.println("---------");
        System.out.println("VARIABLES");
        System.out.println("---------");
        int edad = 46;
        String nombre = "Glenda,";
        String salario = "$ 1000000"; 
        
        System.out.println("Mi nombre es "+nombre);
        System.out.println("tengo "+edad+" años");
        System.out.println("y mi salario es de "+salario);
        
        System.out.println("-------------------------------------");
        System.out.println("ESTRUCTURA DE CONTROL - CONDICIONALES");
        System.out.println("-------------------------------------");
        
        /*
        En Java, las estructuras condicionales permiten tomar decisiones en el código. Las más comunes son:

if: Ejecuta un bloque de código si una condición es verdadera.

else: Se ejecuta cuando la condición en un if es falsa.

else if: Permite encadenar condiciones adicionales después de un if.

switch: Permite comparar una expresión con múltiples valores y ejecutar código según coincidencias.

Estas estructuras condicionales son esenciales para controlar el flujo de un programa en Java.
        */
        
        int edadAlumno = 17;
        if (edadAlumno >= 18);
            System.out.println("Es mayor de 18");(
                    
                    )else {
                            System.out.println("Es menor de 18");
                    }
        
    }
    
}
