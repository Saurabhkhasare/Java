package com.app.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Functionality {

	public static void modifyrating(String name1, int rate, Map<String, Cricketer> maplist) throws CrickException {
		if (maplist.containsKey(name1)) {
			Cricketer crick = maplist.get(name1);
			crick.setRating(rate);
		} else {
			throw new CrickException("invalid name");
		}		
	}

	public static void SearchByName(String name, Map<String, Cricketer> maplist) throws CrickException {
		if (maplist.containsKey(name)) {

			System.out.println(maplist.get(name));
		} else {
			throw new CrickException("invalid name");
		
		}
	}

	public static void DisplayAll(Map<String, Cricketer> maplist) {
		for (Cricketer crick1 : maplist.values()) {
			System.out.println(crick1);
		}
		
	}

	public static void SortedByRating(Map<String, Cricketer> maplist) {
		List<Cricketer> l1 = new ArrayList<>(maplist.values());
		Collections.sort(l1, new RateComparator());
		for (Cricketer cricketers : maplist.values()) {
			System.out.println(cricketers);
		}
		
	}

}
