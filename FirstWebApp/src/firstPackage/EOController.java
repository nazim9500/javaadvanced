package firstPackage;

import javax.servlet.http.HttpServletRequest;

public class EOController {

	public String scrap(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String val=request.getParameter("txt");
		int i=val.length();
		String respage="";
		if(i%2==0) {
			respage="/WEB-INF/evenString.html";
		}
		else {
			respage="/WEB-INF/oddString.html";
		}
		return respage;
	}

}
