package basics;

import java.util.ArrayList;
import java.util.List;

public class DaoLayer {

	public List<Item> getallbyprice() {
		// TODO Auto-generated method stub
		//jdbc connection and getting data from data base;
		List<Item> l = new ArrayList<Item>();
//		l.add(new Item(1,1,1));
//		System.out.println(new Item(1,1,1).toString());
		l.add(new Item(2,1,1));
		l.add(new Item(6,1,1));
		l.add(new Item(3,1,1));
		l.add(new Item(4,1,1));
		return l;
	}

}
