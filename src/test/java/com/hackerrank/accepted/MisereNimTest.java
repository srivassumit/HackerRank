package com.hackerrank.accepted;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author srivassumit
 *
 */
public class MisereNimTest {

	@Test
	public void testFirstWinner() {
		boolean result = MisereNim.firstWinner(new int[] { 1, 1 });
		assertTrue(result);
	}

}
