package org.CCristian.apiservlet.webapp.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/index.html")
public class NombreCompletoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombreCompleto = (String) req.getAttribute("NombreCompleto");

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Tarea 44: Listener nombre y apellido\n</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Tarea 44: Listener nombre y apellido\n!</h1>");
            out.println("        <p>Mi nombre es "+nombreCompleto+"!</p>");
            out.println("    </body>");
            out.println("</html>");
        }
    }
}
