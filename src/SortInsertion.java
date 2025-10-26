public class SortInsertion {

    SortInsertion(){

    }


    public void sortInsertionAscendente(int[] numeros, boolean pasos){
        int size = numeros.length;
        for (int i = 1; i < size; i++) {
            int key = numeros[i];
            int j = i - 1;
            if(pasos){
                System.out.println("i:"+ i +",j:" + j +"; aux"+ key);
            }
            while (j >= 0 && numeros[j] > key) {
                if(pasos)
                    System.out.println("Compara aux:" + key + "con numeros[" + j + "]:" + numeros[j]);

                numeros[j +1] = numeros[j];
                if(pasos)
                    printArray(numeros);
                j--;
                if(pasos)
                    System.out.println("Mueve numeros[" + (j+1) + "] a numeros [" + (j+2) + "]");
                
            }
            numeros[j+1] = key;
            if (pasos){
                System.out.println("Inserta aux:" + key + "en la posicion "+ ( j + 1));
                System.out.println("Estado actual:");
                printArray(numeros);
            }
            
        }

    }

     public void sortInsertionDescendente(int[] numeros){
        int size = numeros.length;
        for (int i = 1; i < size; i++) {
            int j = i - 1;
            int key = numeros[i];
            while (j>=0 && numeros[j] < key) {
                numeros[j + 1] = numeros[j];
                j--;
                
            }
            numeros[j + 1] = key;
            
        }
        
    }

    public void printArray(int [] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] );
            if ( i < numeros.length -1){
                System.out.print(",");
            }
            
        }
        System.out.print("]");
    }



    public void sortByName(String[] nombres, boolean pasos){
        int size = nombres.length;
        for (int i = 1; i < size; i++) {
            String key = nombres[i];
            int j = i - 1;
            if(pasos){
                System.out.println("i:"+ i +",j:" + j +"; aux"+ key);
            }
            while (j >= 0 && nombres[j].compareTo(key) < 0) {
                if(pasos)
                    System.out.println("Compara aux:" + key + "con numeros[" + j + "]:" + nombres[j]);

                nombres[j +1] = nombres[j];
                if(pasos)
                    printArray(nombres);
                j--;
                if(pasos)
                    System.out.println("Mueve numeros[" + (j+1) + "] a numeros [" + (j+2) + "]");
                
            }
            nombres[j+1] = key;
            if (pasos){
                System.out.println("Inserta aux:" + key + "en la posicion "+ ( j + 1));
                System.out.println("Estado actual:");
                printArray(nombres);
            }
            
        }
       











}

public void printArray(String[] nombres) {
    System.out.print("[");
    for (int i = 0; i < nombres.length; i++) {
        System.out.print(nombres[i]);
        if (i < nombres.length - 1) {
            System.out.print(", ");
        }
    }
    System.out.println("]");



    }



    public void printArrayPersonas(Persona[] personas){
        for( Persona persona : personas){
            System.out.println("Nombre:" + persona.getNombre() + " Edad:" + persona.getEdad());
        }
    }

    public void sortPersonaByAge ( Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i -1;
            Persona aux = personas[i];
            while (j >=0 && aux.getEdad() < personas[j].getEdad()) {
                personas[j + 1] = personas[j];
                j--;
                
            }
            personas[j+1] = aux;
            
        }
    }


    public void sortPersonByName(Persona[] personas){
         for (int i = 1; i < personas.length; i++) {
            int j = i -1;
            Persona aux = personas[i];
            while (j >=0 && aux.getNombre().compareTo(personas[j].getNombre()) < 0) {
                personas[j + 1] = personas[j];
                j--;
                
            }
            personas[j+1] = aux;
            
        }

    }

    public void sortPersonByAgeDes(Persona[] personas){
        for (int i = 1; i < personas.length; i++) {
            int j = i -1;
            Persona aux = personas[i];
            while (j >=0 && aux.getEdad() > personas[j].getEdad()) {
                personas[j + 1] = personas[j];
                j--;
                
            }
            personas[j+1] = aux;
            
        }

    }
    
}
