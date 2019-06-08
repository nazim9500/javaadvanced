package firstPackage;

import javax.servlet.http.HttpServletRequest;

public class mulController {

	public String scrap(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String val=request.getParameter("val1");
		
		int i=Integer.parseInt(val);
		String respage="";
		if(i!=0) {
			int res=i*5;
			request.setAttribute("value", res);
			respage="WEB-INF/res.jsp";
		}
		
		
		return respage;
	}

}
