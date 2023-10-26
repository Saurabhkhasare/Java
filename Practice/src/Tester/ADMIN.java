package Tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.app.core.Brand;
import com.app.core.StyleWithPen;

import Custom_Exception.PenException;
import Utils.Functionality;

public class ADMIN {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, StyleWithPen> maplist = new HashMap<>();
			Boolean exit = false;
			while (!exit) {
				try {
					System.out.println("1. Add new Pen\r\n" + "2. Update stock of aPen\r\n"
							+ "3.Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
							+ "4. Remove Pens which arenever sold once listed in 9 months\r\n" + "5.Display details");
					System.out.println("enter choice :");
					switch (sc.nextInt()) {
					case 1:

						System.out.println(
								"brand (CELLO,REYNOLDS,TRIMAX)\r\ncolor \r\nInkColor \r\nmaterial (PLASTIC,ALLOYSTEEL,METAL) \r\nstock \r\nstockListingDate");
						StyleWithPen styleWithPen = Functionality.validateinput(sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextInt(), sc.next());
						maplist.put(styleWithPen.getId(), styleWithPen);
						break;

					case 2:
						System.out.println("Enter ID:");
						int id = sc.nextInt();

						if (maplist.containsKey(id)) {
							

							StyleWithPen pen = maplist.get(id);
							System.out.println("Enter stock:");
							int stock = sc.nextInt();
							pen.updateStock(stock);

						}else {
						throw new PenException("Invalid Id");
						}
						break;
					case 3:
						System.out.println("Discount apply!!!!!!");
						for (StyleWithPen pen : maplist.values()) {

							Period p = Period.between(pen.getStockListingDate(), LocalDate.now());
							if (p.toTotalMonths() > 3) {
								pen.setDiscount(20.0);
								double d = pen.getPrice() * pen.getDiscount() / 100;
								pen.setPrice(pen.getPrice() - d);

								System.out.println(pen.getPrice());
							}

						}
						break;

					case 4:
						for (StyleWithPen pen : maplist.values()) {

							Period p = Period.between(pen.getStockListingDate(), LocalDate.now());
							if (p.toTotalMonths() > 9) {

								System.out.println("removed");
								int d1 = pen.getId();
								maplist.remove(d1);

							}

						}

					case 5:
						System.out.println("details");
						for (StyleWithPen string : maplist.values()) {
							System.out.println(string);

						}

						break;
					}

				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
					
				}
			}

		}
	}

}
