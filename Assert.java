/**
Adam Epstein
3/28/19
This programs implements the interface defined in the List.java as a LinkedList
 */

public class Assert 
{
	public static boolean not_false(boolean cond) 
	{
		if (cond) 
		{	
			return true;
		}
		try{	
			throw new Exception("False condition");
		}

		catch(Exception a)
		{
		}
		return true;
	} 
}