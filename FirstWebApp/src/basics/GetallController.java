package basics;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class GetallController {

	public String findallbyitemprice(HttpServletRequest request) {
		// TODO Auto-generated method stub
		List<Item> e = null;
		Servicelayer sc = new Servicelayer ();
		String val1 = request.getParameter("name1");
		e = sc.getdata(val1);
		request.setAttribute("k1", e);
		String responcepage  = "assignment4.jsp";
		return responcepage;
	}

}
