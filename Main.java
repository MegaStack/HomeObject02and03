package com.gmail.oastro36;

public class Main {

	public static void main(String[] args) {
		Class[] blackListArray = new Class[] { Human.class, Snake.class };
		BlackList bl = new BlackList(blackListArray);

		StackZoo zoo = new StackZoo(blackListArray);
		fillingStack(zoo);

		System.out.println(zoo);
		System.out.println(bl);

		Object objWithoutDel = zoo.getObjectWithoutDel();
		System.out.println("Getting Object without remove: " + objWithoutDel);
		System.out.println("Showing stack after getting objects without remove: " + zoo);

		Object objWithDel = zoo.getObjectWithDel();
		System.out.println("Getting Object with remove: " + objWithDel);
		System.out.println("Showing stack after getting objects with remove: " + zoo);
	}

	public static void fillingStack(StackZoo zoo) {
		Cat catOne = new Cat("Vaska", "British");
		Dog dogOne = new Dog("Tuzik", "Taksa");
		Fox foxOne = new Fox("Pushok", "Wild");
		Human humanOne = new Human("Sasha", "Ivanov", "Petrovich");
		Lion lionOne = new Lion("King", "African");
		Snake snakeOne = new Snake("Zljuka", "Kobra");

		zoo.addObj(catOne);
		zoo.addObj(dogOne);
		zoo.addObj(foxOne);
		zoo.addObj(lionOne);
		zoo.addObj(humanOne);
		zoo.addObj(snakeOne);
		zoo.addObj(foxOne);
	}

}
