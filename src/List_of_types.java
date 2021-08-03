

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
	public int size()
	{
		return types.size();
	}
		
	public String get_name(int i)
	{
		return types.get(i).toString();
	}
	
	public String[] get_array_of_names()
	{
		String[] temp = new String[types.size()];
		for(int i = 0; i < types.size(); i++)
		{
			temp[i] = get_name(i);
		}
		return temp;
	}

}