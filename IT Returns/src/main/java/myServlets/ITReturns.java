package myServlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ITReturns extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		double salary = Double.parseDouble(req.getParameter("salary"));
		double deduct = Double.parseDouble(req.getParameter("deduct"));
		double tax = (salary-deduct)*0.3;
		PrintWriter pw = res.getWriter();
		File file = new File("/home/sal/Codes/JEE-Codes/IT Returns/file.txt");
		file.createNewFile();
		FileOutputStream out = new FileOutputStream(file);
		pw.println("name: "+name+" gender: "+gender+" salaray: "+salary+" deduct: "+deduct+" tax: "+tax);
		out.write(("name: "+name+" gender: "+gender+" salaray: "+salary+" deduct: "+deduct+" tax: "+tax).getBytes());
		out.close();
	}
}
