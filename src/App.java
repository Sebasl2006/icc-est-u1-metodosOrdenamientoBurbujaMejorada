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

        System.out.println("Estudiante: Sebastian Lopez");
        System.out.println("\n------SortSelection-------");
        System.out.println("Original");
        SortSelection selection = new SortSelection();
        int[] numeros1 = {10,0,-5,15,2};
        selection.printArray(numeros1);
        selection.sortSelectionAscendente(numeros1);
        System.out.println(" ");
        System.out.println("Ordenado Ascendente");
        selection.printArray(numeros1);
        System.out.println("\nOrdenado Descendente");
        selection.sortSelectionDescendente(numeros1);
        selection.printArray(numeros1);
        
        


        
       


    }
}
