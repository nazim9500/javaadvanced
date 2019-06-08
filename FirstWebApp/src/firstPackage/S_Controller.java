package firstPackage;

import javax.servlet.http.HttpServletRequest;

public class S_Controller {

	public String scrap(HttpServletRequest request) {
	String pn="/WEB-INF/neg.html";
	System.out.println("proved we reached here");
	String y=request.getParameter("V1");
	int x=Integer.parseInt(y);
	if(x>0) {
		pn="/WEB-INF/pos.html";
	}
	return pn;
	
	}
	
}
