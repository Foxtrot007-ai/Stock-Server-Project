

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class Saving_manager extends Thread{
	
	private BooleanWrapper operation;
	private BooleanWrapper is_closed;
	private boolean previous;
	private List_of_types types;
	private List_of_items items;
	public Saving_manager(List_of_types t ,List_of_items i)
	{
		is_closed = new BooleanWrapper(false);
		previous = false;
		types = t;
		items = i;
	}
	
	public void run()
	{
		while(!is_closed.getValue())
		{
			if(!operation.getValue())previous = true;
			if(operation.getValue() && previous)
			{
				try {save_items();} catch (IOException e) {e.printStackTrace();}
				try {save_types();} catch (IOException e) {e.printStackTrace();}
				previous = false;
			}
			try {this.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
		}
		return;
	}
	
	
	
	private void save_items() throws IOException
	{
		FileOutputStream fileOutputStream
	      = new FileOutputStream("items_db.txt");
	    ObjectOutputStream objectOutputStream 
	      = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(items);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	}
	
	private void save_types() throws IOException
	{
		FileOutputStream fileOutputStream
	      = new FileOutputStream("types_db.txt");
	    ObjectOutputStream objectOutputStream 
	      = new ObjectOutputStream(fileOutputStream);
	    objectOutputStream.writeObject(types);
	    objectOutputStream.flush();
	    objectOutputStream.close();
	}
	
	public void select_operation(BooleanWrapper operation)
	{
		this.operation = operation;
	}
	
	public void kill_process()
	{
		is_closed.setTrue();
		System.out.println("killed");
		
	}

}
