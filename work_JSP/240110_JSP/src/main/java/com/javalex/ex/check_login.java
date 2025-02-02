package com.javalex.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class check_login
 */
@WebServlet("/confirm")
public class check_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public check_login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 입력값 파라미터 처리
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		// PasswordEncoder 객체 : 비밀번호 파라미터 처리, 보안상으로 이게 더 안전함
		
		// DAO 객체 생성
		employeeDAO dao=new employeeDAO();
		HttpSession session=request.getSession();
		
		// 로그인에 성공할 때엔, 반환값이 true
		if(dao.check_Account(id, pw) == true) {
			System.out.println("로그인 성공");
			
			// 로그인 성공한 계정의 이름을, 세션에 저장
			// html 파일에 입력한 id, passwd 매개변수로 삽입
			session.setAttribute("name", dao.getName(id, pw));
			
			response.sendRedirect("welcome_login.jsp");
		}
		else {
			System.out.println("로그인 실패");
			response.sendRedirect("input_login.html");
		}
	}

}
