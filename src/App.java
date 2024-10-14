import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        int[] array = {10,20,30,40,50,60,70,80,90,100};
        int[] arrayNumbers = new int[100000];
        int iteraciones = 0;
        long startTime = System.nanoTime();
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i + 1;
            iteraciones ++;  
        }
        /*long endTime = System.nanoTime();
        long tiempoEjecucion = (endTime - startTime) / 1000000;
        System.out.println(tiempoEjecucion);
        System.out.println("Número total de iteraciones: " + iteraciones);
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");*/

        metodosBusqueda.printArray(array);

        int posicion = metodosBusqueda.busquedaSecuencial(arrayNumbers, 48684);
        int pos = metodosBusqueda.busquedaBinaria(arrayNumbers, 100000);
        //System.out.println("El valor se encuentra en la posicion "+posicion);

        metodosBusqueda.printArray(arrayNumbers);
        


        if(posicion != -1){

        System.out.println("El valor se encuentra en la posicion secuancial: "+posicion);
        System.out.println("El valor se encuentra en la posicion binaria: "+pos);

        }else{

            System.out.println("Valor no encontrado 404 ");
        }

    }
}
