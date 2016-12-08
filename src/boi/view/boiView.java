package boi.view;

import javax.swing.*;
public class boiView {
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String collectResponse(String question)
	{
		String response = "";
		response =JOptionPane.showInputDialog(null, question);
		return response;
	}
	
	public int collectOption(int boiNumber)
	{
	int optionNumber = 0;
	optionNumber = JOptionPane.showConfirmDialog(null, boiNumber);
	return optionNumber;
	}
}
