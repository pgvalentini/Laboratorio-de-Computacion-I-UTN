package Tp_06;

import java.util.*;

public class Matriz {

    static ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        llenarCeldas();
        mostrarArrayListCelda();
        System.out.println("-------------------------------------------------");
        buscarValorCelda();
    }

    private static void llenarCeldas() {
        boolean salida = false;
        while (!salida) {
            Celda celda = new Celda();
            System.out.println("Ingrese una cadena para llenar una celda, si desea terminar ingrese 'FIN'");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("fin")) {
                salida = true;
                break;
            }
            celda.setValor(s);
            System.out.println("Ingrese la fila deseada");
            int fila = sc.nextInt();
            verificarPositivo(fila);
            System.out.println("Ingrese la columna deseada");
            int columna = sc.nextInt();
            verificarPositivo(columna);
            sc.nextLine();
            if (verificarCelda(fila, columna)) {
                celda.setFila(fila);
                celda.setColumna(columna);
                matrizCuadrada.add(celda);
            } else {
                System.out.println("La celda ya esta llena, ingrese el valor en otra celda");
            }
        }
    }


    private static int verificarPositivo(int n) {
        while (n < 0) {
            System.out.println("El numero debe ser positivo");
            n = sc.nextInt();
        }
        return n;
    }

    private static void mostrarArrayListCelda() {
        System.out.println("            Fila    Columna   Valor");
        for (int i = 0; i < matrizCuadrada.size(); i++) {
            System.out.println("Posicion " + (i + 1) + ": " + completarConEspacios(Integer.toString(matrizCuadrada.get(i).getFila()))
                    + completarConEspacios(Integer.toString(matrizCuadrada.get(i).getColumna())) + matrizCuadrada.get(i).getValor());
        }
    }

    private static String completarConEspacios(String cadena) {
        int cantidadEspacios = 9 - cadena.length();
        for (int i = 0; i < cantidadEspacios; i++) {
            cadena += " ";
        }
        return cadena;
    }

    private static void buscarValorCelda() {
        System.out.println("Para buscar el valor en el arreglo ingrese una fila y una columna");
        System.out.println("Ingrese fila: ");
        int fila = sc.nextInt();
        System.out.println("Ingrese columna: ");
        int columna = sc.nextInt();
        boolean seEncontro = false;
        for (int i = 0; i < matrizCuadrada.size(); i++) {
            if (matrizCuadrada.get(i).getFila() == fila && matrizCuadrada.get(i).getColumna() == columna) {
                System.out.println("En la fila " + fila + " columna " + columna + " el valor es: " + matrizCuadrada.get(i).getValor());
                seEncontro = true;
            }
        }
        if (!seEncontro) {
            System.out.println("La fila y columna indicada no ha sido asignada");
        }
    }

    private static boolean verificarCelda(int fila, int columna) {
        for (Celda c : matrizCuadrada) {
            if (c.getFila() == fila && c.getColumna() == columna) {
                return false;
            }
        }
        return true;
    }
}