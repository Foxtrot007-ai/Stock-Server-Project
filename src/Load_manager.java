import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load_manager {
	private String items;
	private String types;
	public Load_manager()
	{
		items = "items_db.txt";
		types = "types_db.txt";
	}
	
	public List_of_items load_items_data_base() throws IOException, ClassNotFoundException
	{
		FileInputStream fileInputStream
	      = new FileInputStream(items);
	    ObjectInputStream objectInputStream
	      = new ObjectInputStream(fileInputStream);
	    List_of_items i = (List_of_items) objectInputStream.readObject();
	    objectInputStream.close(); 
	    return i;
	}
	
	public List_of_types load_types_data_base() throws IOException, ClassNotFoundException
	{
		FileInputStream fileInputStream
	      = new FileInputStream(types);
	    ObjectInputStream objectInputStream
	      = new ObjectInputStream(fileInputStream);
	    List_of_types i = (List_of_types) objectInputStream.readObject();
	    objectInputStream.close(); 
	    return i;
	}
	
	
}
