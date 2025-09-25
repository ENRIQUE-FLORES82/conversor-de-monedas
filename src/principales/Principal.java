package principales;

import conversiones.Conversiones;
import conversiones.Resultados;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double monto = 0;
        String monedaUno = "";
        String monedaConvertida = "";
        boolean continuar = true;
        Resultados resultado = null;
        Conversiones resultadoConversion = new Conversiones();
        Scanner teclado = new Scanner(System.in);

        while (continuar) {
            System.out.println("*****************************************");
            System.out.println("Sea bienvenido(a) al Conversor de Monedas");

            System.out.println("\n1. Dólar a Peso Mexicano");
            System.out.println("2. Peso Mexicano a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Quetzal Guatemalteco");
            System.out.println("6. Quetzal Guatemalteco a Dólar");
            System.out.println("7. Dólar a Peso Argentino");
            System.out.println("8. Peso Argentino a Dólar");
            System.out.println("9. Salir");

            System.out.println("\nPor favor, elija una opción: ");
            System.out.println("*****************************************");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("1. Dolar a Peso Mexicano");
                    monedaUno = "USD/";
                    monedaConvertida = "MXN/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Pesos Mexicanos.");
                    break;
                case 2:
                    System.out.println("2. Peso Mexicano a Dólar");
                    monedaUno = "MXN/";
                    monedaConvertida = "USD/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Dolares.");
                    break;
                case 3:
                    System.out.println("3. Dolar a Real Brasileño");
                    monedaUno = "USD/";
                    monedaConvertida = "BRL/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Reales Brasileños.");
                    break;
                case 4:
                    System.out.println("4. Real Brasileño a Dólar");
                    monedaUno = "BRL/";
                    monedaConvertida = "USD/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Dolares.");
                    break;
                case 5:
                    System.out.println("5. Dolar a Quetzal Guatemalteco");
                    monedaUno = "USD/";
                    monedaConvertida = "GTQ/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Quetzales Guatemaltecos.");
                    break;
                case 6:
                    System.out.println("6. Quetzal Guatemalteco a Dólar");
                    monedaUno = "GTQ/";
                    monedaConvertida = "USD/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Dolares.");
                    break;
                case 7:
                    System.out.println("7. Dolar a Peso Argentino");
                    monedaUno = "USD/";
                    monedaConvertida = "ARS/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Pesos Argentinos.");
                    break;
                case 8:
                    System.out.println("8. Peso Argentino a Dólar");
                    monedaUno = "ARS/";
                    monedaConvertida = "USD/";
                    System.out.println("Por favor, ingresa el monto a convertir: ");
                    monto = teclado.nextDouble();
                    resultado = resultadoConversion.realizarConversion(monedaUno, monedaConvertida, monto);
                    System.out.println("El resultado de la conversión es: " + resultado.conversion_result() + " Dolares.");
                    break;
                case 9:
                    System.out.println("Gracias por usar el Conversor de Monedas");
                    System.out.println("¡Hasta pronto!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            if (opcion != 9) {
                System.out.println("\n¿Desea realizar otra conversion?");
                System.out.println("Por favor, escriba: SI o NO: ");
                String respuesta = teclado.next();
                if (!respuesta.equalsIgnoreCase("si")) {
                    continuar = false;
                    System.out.println("Gracias por usar el Conversor de Monedas");
                    System.out.println("¡Hasta pronto!");
                }
            }
        }

        System.out.println("*****************************************");

    }
}
