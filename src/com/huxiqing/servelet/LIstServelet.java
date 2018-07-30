package com.huxiqing.servelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * Servlet implementation class LIstServelet
 */
@WebServlet("/ListServelet")
public class LIstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LIstServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//针对相应的中文乱码问题
		response.setContentType("text/html;charset=utf-8");
		List<Uer> list = new ArrayList<>();
		Uer u = new Uer();
		u.setName("assa");
		u.setAge(90);
		list.add(u);
		u = new Uer();
		u.setAge(78);
		u.setName("阿3是时");
		list.add(u);
		
		PrintWriter writer = response.getWriter(); 
		
		//java中的对象 转为json格式的数据
		JSONArray jsonarr = JSONArray.fromObject(list);
		//JsnObject
		writer.write(jsonarr.toString());
		writer.flush();
		writer.close();
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
