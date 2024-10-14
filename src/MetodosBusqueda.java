public class MetodosBusqueda {
    public int busquedaSecuencial (int[] array,int valorBuscado){
        long startTime = System.nanoTime();
        int pos = -1;
        int iteraciones = 0;
        for(int i = 0; i< array.length ; i++){
            if(array[i] == valorBuscado){
                iteraciones++;
                return i;
            }

        }
        long endTime = System.nanoTime();
        long tiempoEjecucion = (endTime - startTime) / 1000000;
        System.out.println(tiempoEjecucion);
        System.out.println("Número total de iteraciones: " + iteraciones);
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");
        return -1;
    }

    public int busquedaBinaria(int[] array,int value){
        int inicio = 0;
        int fin = array.length -1;

        while (inicio <= fin) {
            int medio = inicio + (fin -inicio)/2;

            if(array[medio] == value){
                //ELEMENTO ENCONTRADO
                return medio;
            }

            if(array[medio] < value){
                inicio =medio+1; //Buscar en la mitad de la derecha
            }else{
                fin = medio -1; //Buscar en la mitad de la izquierda
            }
            
        }

        return -1;
    }


    public void printArray (int[] array){
        for(int elem:array){
            System.out.println(elem+" ");
        }
    }
    
}
