package Ejercicio5;
public class Ejercicio5 {

    public static void main(String[] args) {
        int[] v = {5, 3, 8, 1, 4, 7, 2, 6, 9};
        double[] r = metodoA(v);
        System.out.println("max=" + r[0]);
        System.out.println("min=" + r[1]);
        System.out.println("prom=" + r[2]);

        Resultados resultados = new Resultados(0, 0, 0);
        metodoB(v, resultados);
        System.out.println("max=" + resultados.max);
        System.out.println("min=" + resultados.min);
        System.out.println("prom=" + resultados.prom);

        calcular3();
        System.out.println("max=" + maximo);
        System.out.println("min=" + minimo);
        System.out.println("prom=" + promedio);

    }

    public static double[] metodoA(int[] v) {
    int max = v[0];
    int min = v[0];
    int suma = 0;
    for (int i = 0; i < v.length; i++) {

        if (v[i] > max) max = v[i];
        if (v[i] < min) min = v[i];

        suma += v[i];
    }
    double prome = (double) suma / v.length;

    return new double[]{max, min, prome};
    }

    public static void metodoB(int[] v, Resultados r) {
        int max = v[0];
        int min = v[0];
        int suma = 0;
        for (int i = 0; i < v.length; i++) {

            if (v[i] > max) max = v[i];
            if (v[i] < min) min = v[i];

            suma += v[i];
        }
        double prom = (double) suma / v.length;
        r.max = max;
        r.min = min;
        r.prom = prom;
    }

    static int maximo;
    static int minimo;
    static double promedio;

    public static void calcular3() {

        int[] v = {4,7,2,9,5};
        maximo = v[0];
        minimo = v[0];
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > maximo) maximo = v[i];
            if (v[i] < minimo) minimo = v[i];
            suma += v[i];
        }
        promedio = (double) suma / v.length;
}
}
