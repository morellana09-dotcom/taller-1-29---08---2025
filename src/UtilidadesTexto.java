
import jdk.jshell.execution.StreamingExecutionControl;

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
            case 1:
                verificarPalindromia(in);
                break;
            case 2:
                contarVocales(in);
                break;

            case 3:
                insciptar(in);
                break;

            case 4:
                desinsciptar(in);
                break;

        }
    }

    public static String verificarPalindromia(Scanner in) {
        System.out.println("Ingrese una palabra");
        String palabra = in.nextLine();
        return "";
    }

    public static void contarVocales(Scanner in) {
        System.out.println("Ingrese una frase");
        String frase = in.nextLine();
        frase = frase.toLowerCase();
        int numeroVocales = contar(frase);
        System.out.println("Tu frase tiene " + numeroVocales + " vocales");
    }

    public static int contar(String frase) {
        int contador = 0;
        char[] caracteres = frase.toCharArray();
        for (char c : caracteres) {
            if (c == 'a') {
                contador++;
            }
            if (c == 'e') {
                contador++;
            }
            if (c == 'i') {
                contador++;
            }
            if (c == 'o') {
                contador++;
            }
            if (c == 'u') {
                contador++;
            }
            ;
        }
        return contador;
    }
    public static void insciptar(Scanner in) {
        System.out.println("Ingrese un texto a encriptar");
        String texto = in.nextLine();
        String cifrado = encriptarSimbolos(texto);
        System.out.println("Texto encriptado: " + cifrado);
    }

    public static String encriptarSimbolos(String texto) {
        String t = texto.toLowerCase();
        t = t.replace("a", "@")
                .replace("e", "&")
                .replace("i", "!")
                .replace("o", "#")
                .replace("u", "*");
        return t;
    }

    public static void desinsciptar(Scanner in) {
        System.out.println("Ingrese un texto a desencriptar");
        String texto = in.nextLine();
        String claro = desencriptarSimbolos(texto);
        System.out.println("Texto desencriptado: " + claro);
    }

    public static String desencriptarSimbolos(String texto) {
        String t = texto.toLowerCase();
        t = t.replace("@", "a")
                .replace("&", "e")
                .replace("!", "i")
                .replace("#", "o")
                .replace("*", "u");
        return t;
    }
    //aaaaaaaaaaaaaaaa
}


