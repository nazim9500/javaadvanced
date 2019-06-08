package firstPackage;

import javax.servlet.http.HttpServletRequest;

public class assi1Controller {

	public String scrap(HttpServletRequest request) {
		String  val =request.getParameter("val1");
		String respage ="";
		
		if (val.equals("earth")) {
		request.setAttribute("k1", "welcome");
			respage = "/WEB-INF/heaven.jsp";
		} else {
			request.setAttribute("k1", "familiar place");
			respage = "/WEB-INF/hell.jsp";
		}
		// TODO Auto-generated method stub
		return respage;
	}

}
