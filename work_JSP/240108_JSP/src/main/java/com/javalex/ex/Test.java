package com.javalex.ex;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Test
 */
@WebServlet("/tes")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String major=request.getParameter("major");
		String[] hobby = request.getParameterValues("hobby");
		String site=request.getParameter("site");
		
		PrintWriter pw = response.getWriter();
		pw.println("<p>이름: "+name+"</p>");
		pw.println("<p>나이: "+age+"</p>");
		
		switch(major) {
		case "computer":	// value 값이 computer 라면
			major="컴공과";
			break;
		case "math":	// value 값이 math 라면
			major="수학과";
			break;
		case "teacher":	// value 값이 teacher 라면
			major="교육과";
			break;
		}
		pw.println("<p>전공: " + major + "</p>");
		
		pw.println("<p>취미: ");
		if(hobby==null) {	// 사용자가 아무것도 선택하지 않았다면
			pw.println("취미 없음");
		}
		else {
			for(int i=0; i<hobby.length; i++) {
        		switch(hobby[i]) {	// 0부터 시작하여, hobby 원소들 한글로
        		case "jogging" :
        			hobby[i]="조깅"; break;
        		case "cook" :
        			hobby[i]="요리"; break;
        		case "read" :
        			hobby[i]="독서"; break;
        		case "game" :
        			hobby[i]="게임"; break;
        		}
        		
        		pw.println(hobby[i]+" ");
        		if(i!=hobby.length-1) {	// 마지막 원소의 차례가 아니라면
        			pw.println(", ");
        		}
        	}
		}

        pw.println("<p>주로 이용하는 사이트: "+site+"</p>");
        
        // \"로 println 수행하면 "로 전송됨
        pw.println("<form action=\"input.html\">");
        pw.println("<input type=\"submit\" value=\"다시 작성하기\" />");
        pw.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
