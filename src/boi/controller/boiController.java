package boi.controller;
import boi.view.boiView;
import java.util.List;
import java.util.ArrayList;
import boi.model.Bois;
public class boiController 
{
	private boiView display;
	private List <Bois> boiList;
	public boiController()
	{
		display=new boiView();
		boiList = new ArrayList<Bois>();
		
	}
	public void start()
	{ 
		Bois DatBoi = new Bois("Dat Boi"," He's the unicycle frog.", 1);
		Bois LongBoy = new Bois("Long Boy", "He's the cylindrical boi.", 2);
		Bois SpicyBoi = new Bois("Spicy Bois", "Spicy bois are also called fire ants.", 3);
		boiList.add(SpicyBoi);
		boiList.add(LongBoy);
		boiList.add(DatBoi);
		display.displayMessage("Here come dem bois (and their numbers):" +
		 "\n" + DatBoi.getName() + " " + DatBoi.getNumber() +
		 "\n"+ LongBoy.getName() + " " + LongBoy.getNumber() +
		 "\n"+ SpicyBoi.getName() + " " + SpicyBoi.getNumber());
		display.displayMessage("Type the number of the boi you'd like to view.");
		String boiNumber ="";
		display.collectResponse(boiNumber);
		if(boiNumber.equals("1"))
			{
				display.displayMessage("You chose Dat Boi!!!!!!!!!!!!!!!!!! \n" 
				+DatBoi.getDescription());
				
			};
		if(boiNumber.equals("2"))
		{
			display.displayMessage("You chose Long Boy!!!!!!!!!!!!!!!!!! \n" 
			+DatBoi.getDescription());
			
		};
		if(boiNumber.equals("3"))
		{
			display.displayMessage("You chose Spicy Bois!!!!!!!!!!!!!!!!!! \n" 
			+DatBoi.getDescription());
			
		};
		
		
	}

	
}
