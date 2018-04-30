package com.basic;

import java.util.Random;

public class SignGenerator {

	Random random = new Random();

	HandSign getSign() {

		int result = (int) (100 * random.nextDouble());

		if (result < 33) {
			return HandSign.SCISSOR;
		} else if (result < 66) {
			return HandSign.PAPER;
		} else {
			return HandSign.ROCK;
		}
	}
}
