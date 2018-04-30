package com.basic;

public class AskMe {

	public static void main(String[] args) {

		Question q = new Question();
		answer(q.ask());
	}

	static void answer(Answer result) {

		switch(result) {
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("Yes");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.out.println("Never");
			break;
		}
	}

}
