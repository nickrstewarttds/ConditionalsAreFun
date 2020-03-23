package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		PrintingAThing thing = new PrintingAThing();
		System.out.println(thing.isNickCool());

		System.out.println(thing.isNickGonnaBuyYouDrinks());
		System.out.println(thing.isNickGonnaSmashYouAtGH());

		System.out.println(thing.isNickGonnaBuyYouDrinks());
		
		System.out.println(thing.doesNickLikeCheese());
	}

}
