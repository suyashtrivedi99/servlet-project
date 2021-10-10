package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/home")
public class SimpleServlet extends HttpServlet {

    //All get requests to the servlet are handled here
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if(name != null) {
            resp.getWriter().printf("Hello %s!", name);
        } else {
            resp.getWriter().write("Please enter a name!");
        }
    }

    //All post requests to the servlet are handled here
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        if(name != null && name != "") {
            resp.getWriter().printf("Hello %s!", name);
        } else {
            resp.getWriter().write("Please enter a name!");
        }
    }
}
