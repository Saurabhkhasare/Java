package com.app.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CricketerTest {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Cricketer> maplist = new HashMap<>();
			while (true) {
				System.out.println(" 1.Accept minimum 5 Cricketers in the collection.\r\n" + "\r\n"
						+ "2.Modify Cricketer's rating\r\n" + "\r\n" + "3.Search Cricketer by name\r\n" + "\r\n"
						+ "4. Display all Cricketers added in collection.\r\n" + "\r\n"
						+ "5.Display All Cricketers in sorted form by rating.");
				System.out.println("Enter the choice:");
				try {
					switch (sc.nextInt()) {

					case 1:
						for (int i = 1; i <= 2; i++) {
							System.out.println("Enter details for Cricketer  : name,  age,  email_id,  phone, rating");

							Cricketer cricketer = new Cricketer(sc.next(), sc.nextInt(), sc.next(), sc.nextInt(),
									sc.nextInt());
							maplist.put(cricketer.getName(), cricketer);
						}

						break;

					case 2:
						System.out.println("Enter the name:");
						String name1 = sc.next();
						System.out.println("Enter  the update rating :");
						int rate = sc.nextInt();
						Functionality.modifyrating(name1, rate, maplist);
						break;

					case 3:
						System.out.println("Enter the name :");
						String name = sc.next();
						Functionality.SearchByName(name, maplist);

						break;

					case 4:
						Functionality.DisplayAll(maplist);

						break;

					case 5:
						Functionality.SortedByRating(maplist);

						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

	}

}
