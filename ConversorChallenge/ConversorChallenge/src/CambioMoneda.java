import java.util.Scanner;

public class CambioMoneda {
    public static void convertir(String monedaBase, String monedaCambiar, SolicitudesAPI solicitudesAPI, Scanner teclado) {
        double cantidad;
        double cantidadConvertida;
        Monedas monedas = solicitudesAPI.encontrarMoneda(monedaBase, monedaCambiar);
        System.out.printf("La tasa de cambio hoy en dia es de: \n1 " + monedaBase + " = " + monedas.conversion_rate() + " " + monedaCambiar + "\n");
        System.out.printf("Ingrese la cantidad de monedas de que desea cambiar de " + monedaBase + "\n");
        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida = (cantidad * monedas.conversion_rate());
        System.out.printf(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + monedas.target_code() + "\n\n");
    }
}
