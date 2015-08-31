package edu.wbqa.basic;

public class pingpong {

	public static void main(String[] args) {

		int x = 20;

		if (x % 3 == 0 && x % 5 == 0) {
			System.out.println("pingpong");
		}
		else if (x % 3 == 0) {
			System.out.println("ping");
		} else if (x % 5 == 0) {
			System.out.println("pong");

		} else {
			System.out.println(x);
		}
	}
}
