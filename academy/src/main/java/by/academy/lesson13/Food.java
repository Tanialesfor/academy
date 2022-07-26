package by.academy.lesson13;

import java.util.regex.Pattern;

import by.academy.lesson8.Validator;


public class Food {
	public static void main(String[] args) {

		Potato potato = new Potato() {
			@Override
			public void peel() {
				specificPeel();
				System.out.println("Чистим картошку в анонимном классе.");
			}

			public void specificPeel() {
				System.out.println("some specific method");
			}

			@Override
			public void dig() {
				// TODO Auto-generated method stub
				
			}
		};
//		Validator validator = new Validator() {
//			private final Pattern p = Pattern.compile("[a-z]+@gmail.com");
//
//			@Override
//			public Pattern getPattern() {
//				return p;
//			}
//		};

//		System.out.println(validator.isValid("test@gmail.com"));
//		Potato potato = new Potato();
//		potato.peel();
	}
}
