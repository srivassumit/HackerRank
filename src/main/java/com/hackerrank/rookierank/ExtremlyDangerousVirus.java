package com.hackerrank.rookierank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Sumit
 *
 */
public class ExtremlyDangerousVirus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		BigInteger t = new BigInteger(sc.next());

		double baseValue = 0.5 * (a + b);
		BigInteger base = new BigDecimal(baseValue).toBigInteger();
		System.out.println(base.modPow(t, new BigInteger("1000000007")));
		sc.close();
	}

}
