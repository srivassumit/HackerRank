package com.ai;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author srivassumit
 *
 */
public class LaptopBatteryLife {

	static double b0 = 0.0;
	static double b1 = 0.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		doSLR();
		Scanner in = new Scanner(System.in);
		double timeCharged = in.nextDouble();
		in.close();
		System.out.println(b0 + b1 * timeCharged);
	}

	private static void doSLR() {
		try {
			String pName = String.valueOf(LaptopBatteryLife.class.getPackage());
			pName = pName.replaceFirst("package ", "\\\\src\\\\");
			pName = pName.replaceAll("\\.", "\\\\");
			String fileName = System.getProperty("user.dir").concat(pName).concat("\\trainingdata.txt");
			Path path = Paths.get(fileName);
			int n = Integer.valueOf((int) Files.lines(path).count());
			double sumX = 0;
			double sumX2 = 0;
			double sumY = 0;
			double sumY2 = 0;
			double sumXY = 0;
			try (Scanner scanner = new Scanner(new File(fileName))) {
				while (scanner.hasNext()) {
					String[] tokens = scanner.nextLine().split(",");
					double xi = Double.valueOf(tokens[0]);
					double yi = Double.valueOf(tokens[1]);
					sumX += xi;
					sumX2 += (xi * xi);
					sumY += yi;
					sumY2 += (yi * yi);
					sumXY += (xi * yi);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			double denominator = n * sumX2 - sumX * sumX;
			b0 = ((sumY * sumX2) - (sumX * sumXY)) / denominator;
			b1 = (n * sumXY - sumX * sumY) / denominator;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
