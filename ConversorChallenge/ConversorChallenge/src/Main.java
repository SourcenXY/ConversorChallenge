import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        SolicitudesAPI solicitudesAPI = new SolicitudesAPI();
        int opcion = 0;
        while (opcion != 7){
            System.out.printf("***********************************\n" +
                    "Bienvenidos a nuestro programa, Conversor de Monedas\n" +
                    "Ingresa la operacion que deseas realizar\n\n" +
                    "1. Dollar a Peso Argentino\n" +
                    "2. Peso Argentino a Dollar\n" +
                    "3. Dollar a Real Brasilero\n" +
                    "4. Real Brasilero a Dollar\n" +
                    "5. Dollar a Peso Colombiano\n" +
                    "6. Peso Colombiano a Dollar\n" +
                    "7. Dollar a Peso Chileno\n" +
                    "8. Peso Chileno a Dollar\n" +
                    "9. Dollar a Peso Boliviano\n" +
                    "10. Peso Boliviano a Dollar\n" +
                    "11. Salir\n\n");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    CambioMoneda.convertir("USD", "ARS", solicitudesAPI, teclado);
                    break;
                case 2:
                    CambioMoneda.convertir("ARS", "USD", solicitudesAPI, teclado);
                    break;
                case 3:
                    CambioMoneda.convertir("USD", "BRL", solicitudesAPI, teclado);
                    break;
                case 4:
                    CambioMoneda.convertir("BRL", "USD", solicitudesAPI, teclado);
                    break;
                case 5:
                    CambioMoneda.convertir("USD", "COP", solicitudesAPI, teclado);
                    break;
                case 6:
                    CambioMoneda.convertir("COP", "USD", solicitudesAPI, teclado);
                    break;
                case 7:
                    CambioMoneda.convertir("USD", "CLP", solicitudesAPI, teclado);
                    break;
                case 8:
                    CambioMoneda.convertir("CLP", "USD", solicitudesAPI, teclado);
                    break;
                case 9:
                    CambioMoneda.convertir("USD", "BOB", solicitudesAPI, teclado);
                    break;
                case 10:
                    CambioMoneda.convertir("BOB", "USD", solicitudesAPI, teclado);
                    break;
                case 11:
                    System.out.printf("Saliendo del programa...");
                    break;
                default:
                    System.out.printf("Opcion invalida");
                    break;
            }
        }
    }
}