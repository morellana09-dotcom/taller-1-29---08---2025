
import java.util.Scanner;

public class UtilidadesTexto {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(in);
            ejecutarOpcion(opcion, in);
        } while (opcion != 5);
        in.close();
    }

    public static void mostrarMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1.- Verificar Revés-Derecho");
        System.out.println("2.- Contar Vocales");
        System.out.println("3.- Encriptar Texto");
        System.out.println("4.- Desencriptar texto");
        System.out.println("5.- Salir");
    }

    public static int leerOpcion(Scanner in) {
        if (!in.hasNextInt()) {
            in.nextLine();
            return 0;
        }
        int op = in.nextInt();
        in.nextLine();
        return op;
    }


    public static void ejecutarOpcion(int opcion, Scanner in) {
        switch (opcion) {
            case 1 -> verificarPalindromia();
        }
    }

    public static String verificarPalindromia(){

    }
}



