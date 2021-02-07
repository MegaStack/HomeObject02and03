package com.gmail.oastro36;

public class Main {

	public static void main(String[] args) {
		
		Cat catOne = new Cat("Vaska", "British");
		Dog dogOne = new Dog("Tuzik", "Taksa");
		Fox foxOne = new Fox("Pushok", "Wild");
		Human humanOne = new Human("Sasha", "Ivanov", "Petrovich");
		Lion lionOne = new Lion("King", "African");
		Snake snakeOne = new Snake("Zljuka", "Kobra");
		Object[] blackListArray = new Object[] {Human.class, Snake.class};
		
		BlackList bl = new BlackList(blackListArray);
				
		StackZoo zoo = new StackZoo(bl.getBlackList());
		
		zoo.addObj(catOne);
		zoo.addObj(dogOne);
		zoo.addObj(foxOne);
		zoo.addObj(lionOne);
		
		System.out.println(zoo);
		
		
	}

}
