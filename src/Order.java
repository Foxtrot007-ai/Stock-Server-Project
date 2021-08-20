

	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;



	public class Order implements Serializable{
		
		
		private static final long serialVersionUID = 5L;
		private List<Pair<Integer, Item>> items;
		private BooleanWrapper taken;
		private int current_item;
		private BooleanWrapper completed;
		public Order()
		{
			items = new ArrayList<Pair<Integer, Item>>();
			taken = new BooleanWrapper(false);
			completed = new BooleanWrapper(false);
			current_item = 0;
		}
			
		public boolean add_item_to_request(Integer i,Item o)
		{
			return items.add(new Pair(i,o));
		}
		
		public boolean delete_item_from_request(int i)
		{
			if(current_item > 0) return false;
			if(i < items.size() && i >= 0)
			{
				items.remove(i);
				return true;
			}else return false;
			
		}
		
		
		
		
		public boolean start_completing_the_order()
		{
			if(taken.getValue())return false;
			else {
				taken.setTrue(); return true;
			}
		}
		
		public boolean stop_completing_the_order()
		{
			if(!taken.getValue())return false;
			else {
				taken.setFalse(); return true;
			}
		}
		
		public boolean next_item()
		{
			current_item++;
			if(current_item > items.size())
			{
				completed.setTrue();
				return false;
			}else
			return true;
		}
		
		public Pair<Integer, Item> current_item()
		{
			return items.get(current_item);
		}

	}


