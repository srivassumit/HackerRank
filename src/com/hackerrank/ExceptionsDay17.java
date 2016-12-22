package com.hackerrank.accepted;

public class ExceptionsDay17 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		System.out.println(c.power(-3, 5));
	}

}

class Calculator {
	public int power(int a, int b) throws Exception {
		if (a < 0 || b < 0) {
			throw new Exception("n and p should be non-negative");
		} else {
			return (int) Math.pow(a, b);
		}
	}
}