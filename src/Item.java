import java.io.Serializable;

public class Item  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	private String id;
	private String name;
	private Type_of_package type;
	private String info;
	public Item(String id, String name, Type_of_package type, String info)
	{
		this.id = id;
		this.name = name;
		this.type = type;
		this.info = info;
	}
	public Type_of_package get_type()
	{
		return type;
	}
	public String toString()
	{
		String temp = "Name: " + name + "\n"
					+ "Type of package: " + type.toString() + "\n"
					+ "Time_to_pick_up: " + type.time_to_pick_up() + "\n"
					+ "Description: " + info + "\n";
		return temp;
	}
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
    
        if(!id.equals(other.get_id()))
        return false;
        
        return true;
    }
	
	public String get_id()
	{
		return id;
	}
	
	public String get_name()
	{
		return name;
	}
}
