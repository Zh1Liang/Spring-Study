package Zh1.Liang.spring.boot.study.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: zhe.liang
 * @create: 2024-01-29 22:51
 */
@WebServlet(urlPatterns = "/demo1")
public class DemoServlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println("DemoServlet1 run ......");
    }
}
