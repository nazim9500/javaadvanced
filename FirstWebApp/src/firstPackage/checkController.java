package firstPackage;

import javax.servlet.http.HttpServletRequest;

public class checkController {

	public String scrap(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String sval1=request.getParameter("val1");
		String sval2=request.getParameter("val2");
		int num1=Integer.parseInt(sval1);
		int num2=Integer.parseInt(sval2);
		int result=0;
		String respage="";
		if(num1<num2) {
			 result=num1+num2;
			 request.setAttribute("n", result);
			 respage="/WEB-INF/result.jsp";
		}
		else {
			result=num1-num2;
			request.setAttribute("n", result);
			respage="/WEB-INF/result.jsp";
		}
		
		return respage;
	}

}
