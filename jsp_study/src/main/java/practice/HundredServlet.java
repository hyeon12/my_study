package practice;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet("/hundred")
public class HundredServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int total = 0;
        for(int i = 0; i < 101; i++){
            total+=i;

            resp.setContentType("text/html; charset=UTF-8");
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<body>");
            out.printf("1부터 100까지 합은 = %d%n", total);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
