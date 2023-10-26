package Tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import COre.Book;
import COre.Publication;
import COre.Tape;
import PublicationComparator.PublicationComparator;
import PublicationComparator.SortByRate;
import utils.ValidationRules;

public class BookTester {

	public static void main(String[] args)  {
	
		try(Scanner sc = new Scanner(System.in))
		{
			Map<Integer, Publication> maplist = new HashMap<>();
			boolean exit=false;
			
			while(!exit) {
				try {
				System.out.println("1. Publish new book\r\n "
						+ "2. Publish new Tape\r\n"
						+ "3. List of book ordered by publish date in desending order\r\n"
						+ "4. list top 5 publication of current year based on rating\r\n"
						+ "5. Remove ll publication which are 5 years\r\n");
				
				System.out.println("Enter the choice:");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("Enter the details: title,  price,  publishdate,  rate,  count");
					
					
					Book BookInput = ValidationRules.vallidateBookInput( sc.next(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt(),maplist);
					maplist.put(BookInput.getId(), BookInput);
					
					break;
					
				case 2:
					System.out.println("Enter the details: title,  price,  publishdate,  rate,  minutes");

					Tape TapeInput = ValidationRules.vallidateTapeInput( sc.next(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt(),maplist);
					maplist.put(TapeInput.getId(), TapeInput);
					break;
					
				case 3:
					List<Publication> list1 = new ArrayList<>(maplist.values());
					Collections.sort(list1, new PublicationComparator ());
					for (Publication publications : list1) {
						System.out.println(publications);
						
					}
					
					break;
					
				case 4:
					List<Publication> list2 = new ArrayList<>(maplist.values());
					Collections.sort(list2, new SortByRate());
					int i=0;
					for (Publication publications : list2) {
						if(i<5) {
						System.out.println(publications);
						i++;
						}	
					}
					break;
					
				case 5:

					//maplist.values().removeIf(p->Period.between(p.getPublishdate(), LocalDate.now()).toTotalMonths()>60);
//				
//					Iterator<Integer> iterator = maplist.keySet().iterator();
//
//					while (iterator.hasNext()) {
//					    Integer key = iterator.next();
//					    Publication value = maplist.get(key);
//
//					    if (Period.between(value.getPublishdate(), LocalDate.now()).toTotalMonths() > 60) {
//					        iterator.remove();
//					    }
//					}
					
					Iterator<Publication> itr = maplist.values().iterator();
					while(itr.hasNext()) {
						Publication next = itr.next();
						
						if(next.getPublishdate().isBefore(LocalDate.of(2018, 8, 8))) {
							itr.remove();
						}
					}
					

					
					break;
				case 6:
					for (Publication s1 : maplist.values()) {
						System.out.println(s1);
						
					}
					break;
				}
				}catch (Exception e) {
				System.out.println(e);
//					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
