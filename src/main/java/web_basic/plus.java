package web_basic;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class plus extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher =	req.getRequestDispatcher("/view/plus.jsp");
		 
 		//フォワードの実行
 		dispatcher.forward(req, resp);
		
//		req.getParameter("num1");
//		req.getParameter("num2");
//		System.out.println("num1"+"num2");
	}
}
