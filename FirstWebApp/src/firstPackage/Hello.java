package firstPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Scrap")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("get mode of request done in servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tellmeWhydidyoucomehere=request.getParameter("why");
		if(tellmeWhydidyoucomehere.contentEquals("checkposorneg")) {
			S_Controller s=new S_Controller();
			String responsepage=s.scrap(request);
			System.out.println("see on server "+ responsepage);
			RequestDispatcher rd=request.getRequestDispatcher(responsepage);
			rd.forward(request,response);
		} 
		else if (tellmeWhydidyoucomehere.contentEquals("some")) {
			assi1Controller s=new assi1Controller();
			String responsepage=s.scrap(request);
			System.out.println("see on server "+ responsepage);
			RequestDispatcher rd=request.getRequestDispatcher(responsepage);
			rd.forward(request,response);
		}
		
		else if (tellmeWhydidyoucomehere.contentEquals("numlesget")) {
			checkController s=new checkController();
			String responsepage=s.scrap(request);
			System.out.println("see on server "+ responsepage);
			RequestDispatcher rd=request.getRequestDispatcher(responsepage);
			rd.forward(request,response);
		}
		else if (tellmeWhydidyoucomehere.contentEquals("multipleof5")) {
			mulController s=new mulController();
			String responsepage=s.scrap(request);
			System.out.println("see on server "+ responsepage);
			RequestDispatcher rd=request.getRequestDispatcher(responsepage);
			rd.forward(request,response);
		}
		else if (tellmeWhydidyoucomehere.contentEquals("evod")) {
			EOController s=new EOController();
			String responsepage=s.scrap(request);
			System.out.println("see on server "+ responsepage);
			RequestDispatcher rd=request.getRequestDispatcher(responsepage);
			rd.forward(request,response);
		}
	}

}
