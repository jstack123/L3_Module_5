package data_structures;

import java.util.ArrayList;

public class Plane {
	int numberOfPassengers=100;
	ArrayList<Snake> snakes = new ArrayList<Snake>();

	public Plane() {
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake(Randomness.number(), Randomness.trueOrFalse()));
		}

	}

	public int calculateVenom() {
		int totalVenom = 0;
		int percentChanceOfDeath;
		for (int i = 0; i < snakes.size(); i++) {
			if (snakes.get(i).getVenomous() == true) {
				totalVenom += snakes.get(i).getViciousness();
			}

		}

		percentChanceOfDeath = totalVenom * 10 / numberOfPassengers;
		System.out.println("Percent chance of death with " + numberOfPassengers+ " passengers: " + percentChanceOfDeath + "%");
		return percentChanceOfDeath;
	}

	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.calculateVenom();
	}
}
