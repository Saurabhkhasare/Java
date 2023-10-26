package com.app.core;

import java.util.Comparator;

public class RateComparator implements Comparator<Cricketer>{


	@Override
	public int compare(Cricketer o1, Cricketer o2) {
		
		return o2.getRating()-o1.getRating();
	}
	
}
