package ml.polymetric.textgame03;

import java.util.ArrayList;

public class Location
{
	private String				locTitle;			// E.g. "House"
	private String				locDescription;		// E.g. "You are in a yellow house"
	private ArrayList<Exit>		exits;				// Stores exits. THERE CAN ONLY BE ONE EXIT OF EACH DIRECTION!
	private ArrayList<Item>		items;				// Stores items. TODO: Figure out what happens when multiple items of the same type are in array
	
	// Blank constructor
	// Try to avoid using this.
	public Location()
	{
		// Print information if the location is blank.
		this.locTitle = "Blank Location";
		this.locDescription = "This location is undefined." + "\nThat means the developer did something wrong."
				+ "\nIf you actually find a location like this, please contact us." + "\nWe commend you if you do :P";
		this.exits = new ArrayList<Exit>();
		this.items = new ArrayList<Item>();
	}
	
	// Full constructor
	public Location(String title, String description)
	{
		this.locTitle = title;
		this.locDescription = description;
		this.exits = new ArrayList<Exit>();
		this.items = new ArrayList<Item>();
	}
	
	// Adds an exit. E.g. opening doors.
	public void addExit(Exit exit)
	{
		this.exits.add(exit);
	}
	
	// Removes an exit. E.g. closing doors.
	public void removeExit(Exit exit)
	{
		if (this.exits.contains(exit))
		{
			this.exits.remove(exit);
		}
	}
	
	// Gets exit array
	@SuppressWarnings("unchecked") // Not sure why this warning is here, but it doesn't matter.
	public ArrayList<Exit> getExits()
	{
		return (ArrayList<Exit>) this.exits.clone();
	}
	
	// Adds an item
	public void addItem(Item item)
	{
		this.items.add(item);
	}
	
	// Removes an item
	public void removeItem(Item item)
	{
		if (this.items.contains(items))
		{
			this.items.remove(items);
		}
	}
	
	// Gets item array
	public ArrayList<Item> getItems()
	{
		return items;
	}
	
	// Gets title
	public String getTitle()
	{
		return this.locTitle;
	}
	
	// Sets title
	public void setTitle(String locTitle)
	{
		this.locTitle = locTitle;
	}
	
	// Gets description
	public String getDescription()
	{
		return this.locDescription;
	}
	
	// Sets description
	public void setDescription(String locDescription)
	{
		this.locDescription = locDescription;
	}
}
