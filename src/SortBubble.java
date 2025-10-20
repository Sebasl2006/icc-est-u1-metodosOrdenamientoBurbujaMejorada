public class SortBubble {
    SortBubble(){

    }

    public void sortAscendente( int[] numeros){
        int baze = numeros.length;
        for (int i = 0; i < baze-1; i++) {
            boolean hayCambio = false;
            for (int j = 0; j < baze-1 - i; j++) {
                if ( numeros[j ] > numeros[j+1]){
                   int temp = numeros[j];
                   numeros[j] = numeros[j+1];
                   numeros[j+1] = temp;
                   hayCambio = true;

                }
                
            }
            if (!hayCambio){
                break;
            }
            
        }
        

    }

    public void sortDescendente(int[] numeros){
        int base = numeros.length;
        for (int i = 0; i < base-1; i++) {
            boolean cambio = false;
            for (int j = 0; j < base-1-i; j++) {
                if ( numeros[j] < numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    cambio = true;
                    
                }
            }
            if (!cambio){
                break;
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
