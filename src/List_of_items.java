import java.util.ArrayList;
import java.util.List;

public class List_of_items {
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
			if(items.get(iter).equals(id))
			{
				items.remove(iter);
				return true;
			}
		}
		return false;
		
	}
	
	public String get_id(int i)
	{
		return items.get(i).get_id();
	}
	
	public String get_name(int i)
	{
		return items.get(i).get_name();
	}

}
