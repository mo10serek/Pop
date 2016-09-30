/*
* Created by: Michael balcerzak
* Created on: 30-Sep-2016
* Created for: ICS3U
* Daily Assignment – Unit#2-02
* This program makes the user to put something in the stack and take something out
*/

import java.util.ArrayList;
import java.util.List;

public class MrCoxallStack {
	
	//have a list
	private List<Double> myList = new ArrayList<Double>();
	public Double give;
	
	public void push(Double have){
		//add something to the list
		myList.add(have);
	}

	public Double pop(){
		//take something out the list
		give = (Double) myList.get(myList.size() - 1);
		
		return give;
	}
}
