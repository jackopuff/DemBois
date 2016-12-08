package boi.model;

public class Bois {
	private int number;
	private String description;
	private String name;
	public Bois(String name, String description, int number)
	{
		this.name=name;
		this.description=description;
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
	 String description = "Here is a boi: " + name;
	 return description;
	}

}
