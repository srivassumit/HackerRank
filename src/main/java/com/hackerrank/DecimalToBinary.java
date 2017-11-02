package com.hackerrank;

public class DecimalToBinary {

	public static void main(String[] args) {
        int n = 6;
        int maxCount = 0;
        int binary[] = new int[30];
        int i =0;
        int oneCounter = 0;
        while (n>0) {
        	binary[i++] = n%2;
        	n = n/2;
        }
        for (int bit : binary) {
        	System.out.print(bit);
        	if (bit == 1) {
        		oneCounter++;
        	} else if (bit == 0) {
        		oneCounter = 0;
        	}
        	if (oneCounter > maxCount) {
        		maxCount = oneCounter;
        	}
        }
        System.out.println();
        System.out.println(maxCount);
	}
}
