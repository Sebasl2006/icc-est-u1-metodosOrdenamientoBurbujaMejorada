class SortSelection:
    
    def sort_ascendente(self , numeros):
        n = len(numeros)
        for i in range (n - 1):
            menor_pos = i 
            for j in range ( i + 1 , n):
                if numeros[j] < numeros[menor_pos]:
                    menor_pos = j
            numeros[i], numeros[menor_pos] = numeros[menor_pos] , numeros[i]
        return numeros
    

    def sort_descente( self , numeros):
        n = len(numeros)
        for i in range ( n - 1):
            menor_post = i
            for j in range(i+1,n):
                if numeros[j] > numeros[menor_post]:
                    menor_post = j
            numeros[i] , numeros[menor_post] = numeros[menor_post] , numeros[i]
        return numeros