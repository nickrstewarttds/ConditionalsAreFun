package com.qa.main;

public class PrintingAThing {
	boolean nickIsCool;
	boolean nickIsDrunk = true;
	float nicksMoney = 10.00f;
	boolean nickIsGoodAtGuitarHero = true;

	public String isNickCool() {
		if (nickIsCool) {
			return "ayyyyy";
		} else {
			return "noooooo";
		}
	}

	public String isNickGonnaBuyYouDrinks() {
		if (nickIsDrunk && nicksMoney > 0) {
			nicksMoney -= 5;
			return "Nick will get in a round";
		} else {
			return "Nick is too poor";
		}
	}

	public String isNickGonnaSmashYouAtGH() {
		if (nicksMoney > 0 && nickIsGoodAtGuitarHero) {
			nicksMoney -= 5;
			return "Nick will play Guitar Hero";
		} else if (nicksMoney == 0 && nickIsGoodAtGuitarHero) {
			return "Nick is too poor to play :(";
		} else {
			return "Nick can't play Guitar Hero";
		}
	}

	boolean nickLikesCheese;

	public String doesNickLikeCheese() {
		if (nickLikesCheese) {
			return "Nick likes cheese";
		}
		return "Java be like that";
	}
}
