public class srcs {

    public static int[] arreglador(int n) 
    {
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arreglo[i] = (i+1)*n;
        }
    return arreglo;
    }
}