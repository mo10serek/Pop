/*
* Created by: Michael balcerzak
* Created on: 30-Sep-2016
* Created for: ICS3U
* Daily Assignment – Unit#2-02
* This program makes the user to put something in the stack and take something out
*/

import java.util.Scanner;

public class GiveIn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("enter anything to put in the stack!");
		Double have = input.nextDouble();
		
		//stack
		//have
		MrCoxallStack aSingleStack = new MrCoxallStack();
		aSingleStack.push(have);
		aSingleStack.push(67.0);
		
		//get
		Double get = aSingleStack.pop();
		System.out.println(get);
		
		Double get2 = aSingleStack.pop();
		System.out.println(get2);
		
	}

}
