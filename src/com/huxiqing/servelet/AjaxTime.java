package com.huxiqing.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxTime
 */
@WebServlet("/AjaxTime")
public class AjaxTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String str = request.
		String str = request.getParameter("name");
		System.out.println(str);
		str = "HHMMSS";
		
		if(str.equals("HHMMSS")) {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String timeStr = sdf.format(new Date());
			PrintWriter writer = response.getWriter();
			//将获取到的
			writer.write(timeStr);
			//writer.write("NOWAY");
			writer.flush();
			writer.close();
		}else {
			PrintWriter writer = response.getWriter();
			//将获取到的
			writer.write("NOWAY");
			writer.flush();
			writer.close();
		}

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
