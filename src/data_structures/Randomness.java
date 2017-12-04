package data_structures;

import java.util.Random;

public class Randomness {
	static Random random = new Random();

	static boolean trueOrFalse() {
		return random.nextBoolean();
	}

	static int number() {
		return random.nextInt(10) + 1;
	}

}
