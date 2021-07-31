
public class Item {
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
	public Three_dimensional_parameters get_object()
	{
		return type.get_form();
	}
	public String toString()
	{
		String temp = "Name: " + name + "\n"
					+ "Type of package: " + type.toString() + "\n"
					+ "Time_to_pick_up: " + type.time_to_pick_up() + "\n"
					+ "Description: " + info + "\n";
		return temp;
	}
	public boolean equals(String id)
	{
		return this.id == id;
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
