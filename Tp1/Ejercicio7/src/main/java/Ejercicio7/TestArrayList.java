package Ejercicio7;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingresar un numero: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        for (Integer numero : numeros) {
            System.out.println("\n" + numero);
        }

        metodoX();
        ArrayList<Integer> combinado = combinarOrdenado(new ArrayList<>(List.of(1, 3, 5)), new ArrayList<>(List.of(2, 4, 6)));
        for (Integer i : combinado) {
            System.out.println(i);
        }
    }

    public static void metodoX(){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan", "Perez", 20));
        estudiantes.add(new Estudiante("Maria", "Gomez", 22));
        estudiantes.add(new Estudiante("Carlos", "Lopez", 19));
        ArrayList<Estudiante> estudiantes2 = estudiantes;
            for (Estudiante estudiante : estudiantes) {
                System.out.println("\n" + estudiante.getNombre() + " " + estudiante.getApellido() + " - Edad: " + estudiante.getEdad());
            }
            for (Estudiante estudiante : estudiantes2) {
                System.out.println("\n" + estudiante.getNombre() + " " + estudiante.getApellido() + " - Edad: " + estudiante.getEdad());
            }
        estudiantes.get(0).setNombre("Pedro");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("\n" + estudiante.getNombre() + " " + estudiante.getApellido() + " - Edad: " + estudiante.getEdad());
        }
        for (Estudiante estudiante : estudiantes2) {
            System.out.println("\n" + estudiante.getNombre() + " " + estudiante.getApellido() + " - Edad: " + estudiante.getEdad());
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ingrese el nombre del nuevo estudiante: ");
        String nombre = scanner.nextLine();
        System.out.printf("ingrese el apellido del nuevo estudiante: ");
        String apellido = scanner.nextLine();
        System.out.printf("ingrese la edad del nuevo estudiante: ");
        int edad = scanner.nextInt();
        Estudiante nuevoEstudiante = new Estudiante(nombre, apellido, edad);
        for (Estudiante i : estudiantes){
            if (i.getNombre().equals(nuevoEstudiante.getNombre()) && i.getApellido().equals(nuevoEstudiante.getApellido()) && i.getEdad() == nuevoEstudiante.getEdad()){
                System.out.println("El estudiante ya existe en la lista.");
                break;
            } 
        }
        estudiantes.add(nuevoEstudiante);
        for (Estudiante estudiante : estudiantes) {
            System.out.println("\n" + estudiante.getNombre() + " " + estudiante.getApellido() + " - Edad: " + estudiante.getEdad());
        }
        for (Estudiante estudiante : estudiantes2) {
            System.out.println("\n" + estudiante.getNombre() + " " + estudiante.getApellido() + " - Edad: " + estudiante.getEdad());
        }

    }

    public static boolean capicupa(ArrayList <Integer> lista) {
        ArrayList <Integer> listaInvertida = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));
        }
        return lista.equals(listaInvertida);

    }

    public static List<Integer> sucesion(int n){
        List<Integer> resultado = new ArrayList<>();
        if (n != 0){
            if (n % 2 == 0){
                resultado.addAll(sucesion(n / 2));
            } else {
                resultado.addAll(sucesion(3 * n + 1));
            }
        }
        return resultado;
    }

    public static void invertidorRecursivo(ArrayList<Integer> lista){
        if (lista == null) return;
        invertirRec(lista, 0, lista.size() - 1);
    }

    private static void invertirRec(ArrayList<Integer> lista, int izquierda, int derecha) {
        if (izquierda >= derecha) return;
        Integer tmp = lista.get(izquierda);
        lista.set(izquierda, lista.get(derecha));
        lista.set(derecha, tmp);
        invertirRec(lista, izquierda + 1, derecha - 1);
    }

    public int sumador(LinkedList<Integer> lista){
        if (lista == null) return 0;
        return sumadorRec(lista, 0);
    }

    private int sumadorRec(LinkedList<Integer> lista, int idx) {
        if (idx >= lista.size()) return 0;
        Integer val = lista.get(idx);
        return (val == null ? 0 : val) + sumadorRec(lista, idx + 1);
    }

    public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        if (lista1 == null && lista2 == null) return resultado;
        if (lista1 == null) { resultado.addAll(lista2); return resultado; }
        if (lista2 == null) { resultado.addAll(lista1); return resultado; }

        int i = 0, j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            Integer a = lista1.get(i);
            Integer b = lista2.get(j);
            if (a == null) { i++; continue; }
            if (b == null) { j++; continue; }
            if (a <= b) {
                resultado.add(a);
                i++;
            } else {
                resultado.add(b);
                j++;
            }
        }
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }
        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }
        return resultado;
    }
    
}
