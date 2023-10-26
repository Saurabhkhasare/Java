package PublicationComparator;

import java.util.Comparator;

import COre.Publication;

public class SortByRate implements Comparator<Publication> {

	@Override
	public int compare(Publication o1, Publication o2) {
		
		return o2.getRate()-o1.getRate();
	}

}
