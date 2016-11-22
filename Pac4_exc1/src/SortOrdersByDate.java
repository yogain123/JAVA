public class SortOrdersByDate implements java.util.Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {
		int result = o1.getDate().before(o2.getDate()) ? -1 : o1.getDate().after(o2.getDate()) ? 1 : 0;
	
	
//		if (o1.getDate().before(o2.getDate())) {
//	            result = -1;
//	        } else if (o1.getDate().after(o2.getDate())) {
//	            result =  1;
//	        } else {
//	            result =  0;
//	        }  
		
		return result;
	}

}
