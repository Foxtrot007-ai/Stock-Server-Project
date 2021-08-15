

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class List_of_types implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private List<Type_of_package> types;
	public List_of_types()
	{
		types = new ArrayList<Type_of_package>();
	}
		
	public boolean add_type(Type_of_package o)
	{
		return types.add(o);
	}
	
	public boolean delete_item(Type_of_package t)
	{
		int iter = 0;
		//types.remove(t);
		while(iter < types.size())
		{
			if(types.get(iter).equals(t))
			{
				types.remove(iter);
				return true;
			}
			iter++;
		}
		return false;
		
	}
	
	public Type_of_package get_type(int i)
	{
		return types.get(i);
	}
	
	public int size()
	{
		return types.size();
	}
		
	public String get_name(int i)
	{
		return types.get(i).toString();
	}
	
	public boolean contains(Type_of_package t)
	{
		return types.contains(t);
	}

}