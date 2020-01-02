package cz.muni.ics.makub;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Martin Kuba makub@ics.muni.cz
 */
@WebServlet("/info")
public class MyServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain;charset=utf-8");
        try(PrintWriter out = resp.getWriter()) {
            out.println("Servlet Engine: "+getServletContext().getServerInfo());
        //}
    }
}
