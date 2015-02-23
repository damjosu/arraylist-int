/**
 * Clase ArrayListInt basada en un ArrayList.
 */
public class ArrayListInt
{
    // Lista de enteros.
    private int[] lista;
    /**
     * Constructor de la clase ArrayListInt
     */
    public ArrayListInt()
    {
        lista = new int [0]; // Se inicializa con 0 elementos para ahorrar espacio.
    }

    /**
     * Añade un elemento al final de la lista.
     * @param elemento El elemento a añadir.
     */
    public void add(int elemento)
    {
        int size = lista.length;
        int[] temp = new int [size + 1]; // Se crea una lista temporal con el tamaño de la lista + 1.        
        for(int i = 0; i < size; i++)
        {
            temp[i] = lista[i]; // Se guardan todos los elementos de la primer lista en la temporal.
        }
        temp [size] = elemento;
        lista = temp;
    }

    /**
     * Añade un elemento en el indice especificado.
     * @param index El indice donde añadir el elemento.
     * @param elemento El elemento a añadir.
     */
    public void add(int index, int elemento)
    {
        int size = lista.length;
        int[] temp = new int [size + 1]; // Se crea una lista temporal con el tamaño de la lista + 1. 
        int i = 0;
        if ((index <= size) && (index >= 0))
        {
            for(; i < index; i++)
            {
                temp [i] = lista [i]; // Se guardan todos los elementos de la primer lista en la temporal.
            }
            temp[index] = elemento;
            for(int cont = i; cont < size; cont++)
            {
                temp[cont + 1] = lista[cont];
            }
            lista = temp;
        }
        else
        {
            System.out.println("Introduce un índice que esté entre 0 y " + size);
        }
    }

    /**
     * Vacia la colección.
     */
    public void clear()
    {
        lista = new int[0];
    }    

    /**
     * Devuelve true si contiene el elemento.
     * @param elemento El elemento a buscar en la colección.
     */
    public boolean contains(int elemento)
    {
        boolean contiene = false;
        int  i = 0;
        while (i < lista.length && !(contiene))
        {
            if(lista[i] == elemento)
            {
                contiene = true;
            }
            i++;
        }
        return contiene;
    }

    /**
     * Devuelve el elemento existente en la posición indicada.
     * @param index El indice.
     */
    public int get(int index)
    {
        int elemento = -1;
        if((index < lista.length) && (index >= 0))
        {
            elemento = lista[index];
        }
        return elemento;
    }

    /**
     * Reemplaza el elemento en la posición `index` con el valor de `element`
     * @param index El indice del elemento a reemplazar.
     * @param element El elemento por el que reemplazas.
     */
    public void set(int index, int element)
    {
        if((index < lista.length) && (index >= 0))
        {
            lista[index] = element;
        }
    }
    
    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento especificado
     * @param elemento El elemento a buscar.
     */
    public int indexOf(int elemento)
    {
        boolean encontrado = false;
        int i = 0;
        int index = -1;
        while((i < lista.length) && !(encontrado))
        {
            if(lista[i] == elemento)
            {
                index = i;
                encontrado = true;
            }
            i++;            
        }
        return index;
    }
    
    /**
     * Devuelve `true` si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean vacia = false;
        if(lista.length == 0)
        {
            vacia = true;
        }
        return vacia;
    }
    
    /**
     * Elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento.
     * @param index El indice del elemento a eliminar
     */
    public int remove(int index)
    {
        int elemento = -1;
        int size = lista.length;
        int temp[] = new int[size - 1];
        int i = 0;
        if ((index <= size) && (index >= 0))
        {
             for(; i < index; i++)
            {
                temp[i] = lista[i];
            }
            elemento = lista[i];        
            for(int cont = i; cont < (size - 1); cont++)
            {
                temp[cont] = lista[cont + 1];
            }
            lista = temp;
        }       
        return elemento;
    }
    
    public void imprime()
    {
        for(int i = 0; i < lista.length; i++)
        {
            System.out.println(lista[i]);
        }
    }

}
