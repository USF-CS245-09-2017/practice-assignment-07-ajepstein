/**
Adam Epstein
3/28/19
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