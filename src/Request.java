import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Request implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private List<Item> items_for_request;
	private String code_of_request;
	private Add_request_app r;
	private Box_type b_type;
	public Request()
	{
		items_for_request = new ArrayList<Item>();
	}
		
	public boolean make_request(List<Item> items)
	{
		
	}
	
	public String get_code(int i)
	{
		return code_of_request;
	}
	
	public Box_type get_box(int i)
	{
		return b_type;
	}
	
	

}
