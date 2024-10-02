package javaTask5;

import java.util.Scanner;

public class HotelTariff {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the month number (1-12): ");
		int month = scanner.nextInt();

		System.out.print("Enter the room rent per day: ");
		float rentPerDay = scanner.nextFloat();

		System.out.print("Enter the number of days stayed: ");
		int days = scanner.nextInt();

		float totalTariff;

		switch (month) {
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			totalTariff = (rentPerDay * days) * 1.20f;
			break;
		default:
			totalTariff = rentPerDay * days;
			break;
		}

		System.out.printf("%.2f%n", totalTariff);

	}
}
