package com.basic;

import java.util.Random;

public class Question {

	Random random = new Random();

	Answer ask() {
		int problem = (int) (100 * random.nextDouble());

		if (problem < 15) {
			return Answer.MAYBE;
		} else if (problem < 30) {
			return Answer.NO;
		} else if (problem < 60) {
			return Answer.YES;
		} else if (problem < 75) {
			return Answer.LATER;
		} else if (problem < 98) {
			return Answer.SOON;
		} else {
			return Answer.NEVER;
		}

	}
}
