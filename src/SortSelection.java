public class SortSelection {
    
    public SortSelection(){

    } 

    public void sortSelectionAscendente(int[] numeros) {
    int size = numeros.length;
    for (int i = 0; i < size - 1; i++) {
        int indmax = i;
        for (int j = i + 1; j < size; j++) {
            if (numeros[j] < numeros[indmax]) {
                indmax = j;
            }
        }
    
        if (i != indmax) {
            int aux = numeros[i];
            numeros[i] = numeros[indmax];
            numeros[indmax] = aux;
        }
    }

}

public void sortSelectionDescendente(int[] numeros){
    int size = numeros.length;
    for (int i = 0; i < size - 1; i++) {
        int indmax = i;
        for (int j = i + 1; j < size; j++) {
            if (numeros[j] > numeros[indmax]) {
                indmax = j;
            }
        }
    
        if (i != indmax) {
            int aux = numeros[i];
            numeros[i] = numeros[indmax];
            numeros[indmax] = aux;
        }
    }

}


    public void printArray( int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] );
            if ( i < numeros.length -1){
                System.out.print(",");
            }
            
        }
        System.out.print("]");


    }
    
    
}
