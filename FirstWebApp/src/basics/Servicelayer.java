package basics;

import java.util.List;

public class Servicelayer {

	public List<Item> getdata(String val1) {
		DaoLayer da = new DaoLayer();
		List<Item> ouritems =  da.getallbyprice();
		return ouritems ;
	}

}
