

	import java.io.Serializable;
	import java.util.ArrayList;
	import java.util.List;
import java.util.Random;
	



	public class Order implements Serializable{
		
		
		private static final long serialVersionUID = 5L;
		private List<Pair<Integer, Item>> items;
		private String id;
		private BooleanWrapper taken;
		private int current_item;
		private BooleanWrapper completed;
		private Id_gen_item gen;
		public Order(String id)
		{
			gen = new Id_gen_item();
			items = new ArrayList<Pair<Integer, Item>>();
			taken = new BooleanWrapper(false);
			completed = new BooleanWrapper(false);
			current_item = 0;
			this.id = id;
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
		public boolean is_taken()
		{
			return taken.getValue();
		}
		
		public boolean in_progress()
		{
			return current_item > 0;
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
		
		public String get_id()
		{
			return id;
		}
		
		public Order get_random_order(List_of_items items)
		{
			Random rand = new Random();
			int n = rand.nextInt(5);
			Order temp = new Order(gen.next_id());
			
			for(int i = 0; i < n; i++)
			{
				int x = rand.nextInt(50);
				int y = rand.nextInt(5);
				temp.add_item_to_request(Integer.valueOf(x), items.get_item(y));
			}
			
			return temp;
			
		}
		

	}


