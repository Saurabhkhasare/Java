package PublicationComparator;

import java.util.Comparator;

import COre.Publication;

public class PublicationComparator implements Comparator<Publication> {

	@Override
	public int compare(Publication o1, Publication o2) {
		
		return o2.getPublishdate().compareTo(o1.getPublishdate());
	}

}
