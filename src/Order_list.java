import java.util.ArrayList;
import java.util.List;

public class Order_list {
	private List<Item> order;
	public Order_list()
	{
		order = new ArrayList<Item>();
	}
	public boolean load_list_from_file(String name_of_file)
	{
		return true;
		//to do
	}
	
	public void load_list_manually()
	{
		//to do
	}
	
	public boolean add_item(Item o)
	{
		return order.add(o);
	}
	public boolean delete_item(String id)
	{
		int iter = 0;
		while(iter < order.size())
		{
			if(order.get(iter).equals(id))
			{
				order.remove(iter);
				return true;
			}
		}
		return false;
		
	}
	
}
