package data_structures;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */

public class RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
			boolean isDirt() {
				return false;
			}
		}
		class Worm extends Stuff {
			boolean isDirt() {
				return false;
			}
		}
		class Dirt extends Stuff {
			boolean isDirt() {
				return true;
			}
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		// System.out.println(stuffIFoundInTheYard.size());

		/* TODO 1: Clean out the dirt but keep the delicious worms. */

		// remove dirt from arraylist

		for (int i = 0; i < stuffIFoundInTheYard.size(); i++) {
			if (stuffIFoundInTheYard.get(i) instanceof Dirt) {
				stuffIFoundInTheYard.remove(i);
				i -= 1;
			}
		}

		System.out.println(stuffIFoundInTheYard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('s');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('u');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add(' ');
		truth.add('g');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('o');
		truth.add('#');
		truth.add('u');
		truth.add('t');

		/* TODO 2: Remove the hash symbols and print out the truth. */

		for (int j = 0; j < truth.size(); j++) {
			if (truth.get(j).equals('#')) {
				truth.remove(j);
				j -= 1;
			}
		}

		System.out.println(truth);

	}
}
