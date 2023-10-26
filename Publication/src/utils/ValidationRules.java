package utils;

import java.time.LocalDate;
import java.util.Map;

import COre.Book;
import COre.Publication;
import COre.Tape;
import Custom_Exception.BookException;
import Custom_Exception.TapeException;

public class ValidationRules {
	
	private static void validatebook(String title,Map<Integer, Publication> emplist) throws BookException
	{
	for (Publication book1 : emplist.values())
	{
	     if(book1.equals(title)) {
	    	 throw new BookException("title already exist");
	     }
	}			
	}
	
	public static LocalDate validatePublishdate(String publishdate,Map<Integer, Publication> emplist) throws IllegalArgumentException
	{
		return LocalDate.parse(publishdate);	
	}
	
	public static int Validaterate(int rate,Map<Integer, Publication> emplist) throws BookException
	{
		if(rate>10)
		{
			throw new BookException("Enter valid rate");
		
		}else {
			return rate;
		}
		
	}

	public static Book vallidateBookInput(String title, double price, String publishdate, int rate, int count,Map<Integer, Publication> emplist) throws BookException {
		
		Validaterate(rate, emplist);
		validatebook(title,emplist);
		LocalDate Publishdate = validatePublishdate(publishdate, emplist);
		
		return new Book( title,  price,  Publishdate,  rate,  count);	
	}
	
	public static void validatetape(String title,Map<Integer, Publication> emplist) throws TapeException
	{
		for(Publication p1 : emplist.values()) {
			throw new TapeException("invalid title");
		}
	}

	public static Tape vallidateTapeInput(String title, double price, String publishdate, int rate, int count,
			Map<Integer, Publication> maplist) throws TapeException, BookException {
		Validaterate(rate, maplist);
	    validatetape(title,maplist);
	    LocalDate Publishdate = validatePublishdate(publishdate, maplist);
		return new Tape(title, price, Publishdate, rate, count);
	}

	

	

}
