package net.NaHyun0130.hellogit;

public class hellomiddleearth {

	public static void main(String[] args) {
		
		String[] names = {"Bilbo", "Frodo", "Aragorn", "Legolas", "Gandalf"};
		
		
		//print greetings
		for(int i = 0; i < names.length; i++)
		{
			System.out.format("Hello, %s!\n", names[i]);
		}

	}

}
