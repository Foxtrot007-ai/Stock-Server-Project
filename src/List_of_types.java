

import java.util.ArrayList;
import java.util.List;

public class List_of_types {
	private List<Type_of_package> types;
	public List_of_types()
	{
		types = new ArrayList<Type_of_package>();
	}
		
	public boolean add_type(Type_of_package o)
	{
		return types.add(o);
	}
	
	public boolean delete_item(String id)
	{
		int iter = 0;
		while(iter < types.size())
		{
			if(types.get(iter).equals(id))
			{
				types.remove(iter);
				return true;
			}
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
	
	

}