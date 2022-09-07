
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Persona;


@WebServlet(name = "SvModificar", urlPatterns = {"/SvModificar"})
public class SvModificar extends HttpServlet {
    
    Controladora control = new Controladora();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
    }
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        int id = Integer.parseInt(request.getParameter("id_modificar"));
        
        Persona per = control.traerPersona(id);
        
        HttpSession miSession2 = request.getSession();
        miSession2.setAttribute("persona", per);
       
        response.sendRedirect("modificar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        Persona perMod = (Persona) request.getSession().getAttribute("persona");
       
        Persona per = new Persona(perMod.getId(), dni, nombre, apellido, telefono);
        
        control.modificarPersona(per);
        response.sendRedirect("index.jsp");
             
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
