<h1 align="center">Tarea 44: Listener nombre y apellido</h1>
<p>Listener nombre y apellido</p>
<h2>Instrucciones de tareas</h2>

Para la siguiente tarea se pide crear una clase listener que inicialice en el request un atributo llamado nombreCompleto y como valor el nombre y apellido de cada uno, luego mostrarlo en un servlet mapeado a la ruta `/index.html`. Por ejemplo
<p align="center"><img width="600" alt="image" src="https://github.com/user-attachments/assets/b0380064-8695-4a27-bb90-cddc6206925c"></p>

<h1>Resolución del Profesor</h1>

Clase AplicacionListener:
```java
package org.aguzman.apiservlet.webapp.listener.tarea7;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AplicacionListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        sre.getServletRequest().setAttribute("nombreCompleto", "Andres Guzman");
    }
}
```

Clase IndexServlet:
```java
package org.aguzman.apiservlet.webapp.listener.tarea7.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/index.html", ""})
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nombreCompleto = (String) req.getAttribute("nombreCompleto");
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Tarea 7 Listener</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Tarea 7 Listener!</h1>");
            out.println("        <p>Mi nombre es " + nombreCompleto + "!</p>");
            out.println("</table>");
            out.println("    </body>");
            out.println("</html>");
        }
    }
}
```
