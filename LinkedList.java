/**
Adam Epstein
3/28/19
This programs implements the interface defined in the List.java as a LinkedList
 */

public class LinkedList<T> implements List<T>
{

    private Node<T> head;
    private int size;

    public LinkedList()
    {
        head = null;
        size = 0;
    }

    //gets the size of thoe LinkedList
    public int size()
    {
        return size; 
    }

    //adds item to the end of the LinkedList. 
    public void add(T item)
    {
    	if(head == null)
    	{
            head = new Node<T>(item);   
        }

        else
        {
        	Node<T> curr = head;
	    	while(curr.getNext() != null)
	    	{
	    		curr = curr.getNext();
	    	}
	    	curr.setNext(new Node<T>(item));	
        }
        size++; 		
    }

    //Adds item to a position in the LinkedList
    public void add(int pos, T item) 
    {
    	//Assert.not_false(pos >= 0 && pos <= size);
  
        if (pos == 0) 
        {    
            Node<T> n = new Node<T>(item);
            n.setNext(head);
            head = n;
        } 
        else 
	   	{
	        Node<T> prev = head;
		    for (int i = 0; i < pos - 1; i++) 
	        {
	            prev = prev.getNext();
	        }
	        Node<T> n = new Node<T>(item);
	        n.setNext(prev.getNext());
	        prev.setNext(n);
	    }
	    ++size;
    }

    //Gets item at a position in the LinkedList
    public T get(int pos)
    {
    	//Assert.not_false(pos >= 0 && pos < size);

        Node<T> n = head;

        for(int i = 0; i < pos; i++)
        {
            n = n.getNext();
        }
		return n.getData();
    }

    //Removes item from a position in the LinkedList
    public T remove(int pos)
    {   
    	//Assert.not_false(pos < 0 && pos > size);
         
    	if(pos == 0)
        {
        	Node<T> curr = head;
            head = head.getNext();
            size--;
            return curr.getData();
        }
        else 
        {
    	    Node<T> prev = head;
            for (int i = 0; i < pos - 1; i++) 
            {
                prev = prev.getNext();
            }

            Node<T> curr = prev.getNext();    
            prev.setNext(curr.getNext());
            size--;
            return curr.getData();
        }       
    }    
}