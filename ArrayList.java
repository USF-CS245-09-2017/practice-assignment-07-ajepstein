/**
Adam Epstein
3/28/19
This programs implements the interface defined in the List.java as an ArrayList
 */

public class ArrayList<T> implements List<T> {

    T[] arr;
    int size = 0;
    int max = 10;

    public ArrayList()
    {
        arr = (T[]) new Object[10];
    }

    //gets number of elements in ArrayList
    public int size()
    {
        return size;
    }

    //adds item to the end of the ArrayList. Grows the array if full
    public void add(T item) 
    {
        if (arr.length == size) 
        {
            growArray();
        }
            arr[size++] = item;
    }

    //Adds item to a position in the ArrayList. Grows the array if full
    public void add (int pos, T item)
    {
        if (arr.length == size) 
        {
            growArray();
        }

        for(int i = size; i > pos; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[pos] = item;
        size++;
    }

    //Gets item at a position in the ArrayList
    public T get(int pos)
    {
        return arr[pos];
    }

    //Removes item from a position in the ArrayList
    public T remove(int pos)
    {
        T item = arr[pos];

        for(int i = pos; i < size - 1; i++)
        {
            arr[i] = arr[i+1];
        }    
        
        size--;
        return item;   
    }

    //creates an array double the size
    private void growArray()
    {   
        T[] tempArr = (T[]) new Object[arr.length * 2];

        for(int i = 0; i < arr.length; i++)
        {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
    }      
}