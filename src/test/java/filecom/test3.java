package filecom;

import org.junit.Test;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/resp",name = "test3")
public class test3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().print("hellow,response");
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request,response);
}
}
