/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        int tabla;
        int limite;
        String operacion;
        System.out.println("ingrese el numero para la tabla");
        tabla = entrada.nextInt();
        System.out.println("ingrese el limite para la tabla");
        limite = entrada.nextInt();
        entrada.nextLine();
        System.out.println("ingrese \"1\" para la suma o \"2\" para la "
                + "multiplicacion");
        operacion = entrada.nextLine();
        switch (operacion) {
            case "1":
                mensaje = obtenerTablaSumar(limite, tabla);
                break;
            case "2":
                mensaje = obtenerTablaMultiplicar(limite, tabla);
        }

        System.out.printf("%s\n", mensaje);

    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
