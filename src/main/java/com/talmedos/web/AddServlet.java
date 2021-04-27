package com.talmedos.web;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        int x=Integer.parseInt(req.getParameter("x"));
        int y=Integer.parseInt(req.getParameter("y"));
        String retVal = String.format("Sum: %d + %d = %d\n",x,y,x+y);
        res.getWriter().write(retVal);
    }
}
