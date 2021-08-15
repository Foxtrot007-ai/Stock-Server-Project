import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class List_of_items implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Item> items;
	public List_of_items()
	{
		items = new ArrayList<Item>();
	}
		
	public boolean add_item(Item o)
	{
		return items.add(o);
	}
	public boolean delete_item(String id)
	{
		int iter = 0;
		while(iter < items.size())
		{
			if(items.get(iter).get_id().equals(id))
			{
				items.remove(iter);
				return true;
			}
			iter++;
		}
		return false;
		
	}
	

	
	public int size()
	{
		return items.size();
	}
	public String get_id(int i)
	{
		return items.get(i).get_id();
	}
	
	public String get_name(int i)
	{
		return items.get(i).get_name();
	}
	
	public boolean check_if_type_is_used(Type_of_package t)
	{
		for(int i = 0; i < items.size(); i++)
		{
			if(items.get(i).get_type().equals(t))
				return true;
		}
		return false;
	}

}
