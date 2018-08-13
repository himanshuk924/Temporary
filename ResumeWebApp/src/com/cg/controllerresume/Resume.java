package com.cg.controllerresume;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.modelresume.ResumeModel;

/**
 * Servlet implementation class Resume
 */
@WebServlet("/Resume")
public class Resume extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resume() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ResumeModel rm=new ResumeModel();
		rm.setFirstName(request.getParameter("firstname"));
		rm.setLastName(request.getParameter("lastname"));
		rm.setGender(request.getParameter("gender"));
		rm.setHighQualification(request.getParameter("HQ"));
		rm.setDOB(request.getParameter("dob"));
		rm.setHobbies(request.getParameterValues("Hobby"));
		rm.setAddress(request.getParameter("address"));
		rm.setSkills(request.getParameterValues("skills"));
		rm.setEmail(request.getParameter("email"));
		rm.setWebsite(request.getParameter("weburl"));
		rm.setSummary(request.getParameter("Summary"));
		request.setAttribute("values", rm);
		RequestDispatcher rd=request.getRequestDispatcher("output.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
