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
    
}
