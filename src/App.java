public class App {
    public static void main(String[] args) throws Exception {
        // int[] numeros = {10,0,-5,15,2};
        // SortBubble sortBubble = new SortBubble();
        // System.out.println("Array Original");
        // sortBubble.printArray(numeros);
        // System.out.println("\nOrdenado Ascendente");
        // sortBubble.sortAscendente(numeros);
        // sortBubble.printArray(numeros);
        // System.out.println("\nOrdenado Descendente");
        // sortBubble.sortDescendente(numeros);
        // sortBubble.printArray(numeros);

        // System.out.println("Estudiante: Sebastian Lopez");
        // System.out.println("\n------SortSelection-------");
        // System.out.println("Original");
        // SortSelection selection = new SortSelection();
        // int[] numeros1 = {10,0,-5,15,2};
        // selection.printArray(numeros1);
        // selection.sortSelectionAscendente(numeros1);
        // System.out.println(" ");
        // System.out.println("Ordenado Ascendente");
        // selection.printArray(numeros1);
        // System.out.println("\nOrdenado Descendente");
        // selection.sortSelectionDescendente(numeros1);
        // selection.printArray(numeros1);



        int[] numeros1 = {10,0,-5,15,2};
        SortInsertion sortInsertion = new SortInsertion();
        //System.out.println(" ---------SortInsertion----------");
        //System.out.println("Original");
        //sortInsertion.printArray(numeros1);
        //sortInsertion.sortInsertionAscendente(numeros1,true);
       // System.out.println(" ");
        //System.out.println("Ordenado Ascendente");
        // sortInsertion.printArray(numeros1);
        // System.out.println(" ");
        // System.out.println("Ordenado Descendente");
        // sortInsertion.sortInsertionDescendente(numeros1);
        // sortInsertion.printArray(numeros1);


        // String[] nombres = {"Pedro", "Ana" , " Maria" ,  "Luis", " Juan"};
        // System.out.println(" Array de Nombres Original");
        // sortInsertion.printArray(nombres);
        // sortInsertion.sortByName(nombres, true);

        Persona[] personas = new Persona[]{
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),

        };


        System.out.println("Arreglo de personas ordenado por Edad Ascendente");
        sortInsertion.sortPersonaByAge(personas);
        sortInsertion.printArrayPersonas(personas);
        System.out.println("Arreglo de personas ordenado por Edad Descendente");
        sortInsertion.sortPersonByAgeDes(personas);
        sortInsertion.printArrayPersonas(personas);
        System.out.println("Estudiante: Sebastian Lopez");



        


        
       


    }
}
