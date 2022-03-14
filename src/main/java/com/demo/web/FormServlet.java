package com.demo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.test.Emp;
import com.demo.test.EmpDB;
import com.demo.test.EmployeeMain;

@WebServlet("/demo")
	public class FormServlet extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	String empId=req.getParameter("id");


	String name=req.getParameter("name");
	String city=req.getParameter("city");
	String salary=req.getParameter("salary");

	Emp em=new Emp(id,name,city,salary);
	EmployeeMain e1=new EmployeeMain();

	String response=e1.addEmployee(em);
	System.out.println(EmpDB.db);
	out.write("<h1>"+response+"</h1>");

	}

}
