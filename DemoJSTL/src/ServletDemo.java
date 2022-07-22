import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<Student> studentslist = Arrays.asList(new Student("1", "Revs", "24"));
		Student student1 = new Student("101", "Revathi", "25");
		Student student2 = new Student("102", "Naveen", "28");
		Student student3 = new Student("103", "Raju", "30");
		studentslist.add(student1);
		studentslist.add(student2);
		studentslist.add(student3);
		
		req.setAttribute("students", studentslist);
		req.setAttribute("stu", student1);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, res);
		
	}
}
