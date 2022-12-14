
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
        
        
        // id traido de index.jsp en el campo eliminar
        int id = Integer.parseInt(request.getParameter("id_modificar"));
        
        //id guardado en la sesion para llevar id a sesion de modificar.jsp
        HttpSession miSession2 = request.getSession();
        miSession2.setAttribute("id_modificar", id);
              
        //con el id traigo el objeto persona que voy a modificar para llevarlo a la session
        // de modificar.jsp y mostrar con get() sus datos en los inputs
        Persona pers = control.traerPersona(id);
        miSession2.setAttribute("persona", pers);
       
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
        
        int id = (int) request.getSession().getAttribute("id_modificar");    
        
        Persona per = new Persona(id, dni, nombre, apellido, telefono);
        
        control.modificarPersona(per);
        response.sendRedirect("index.jsp");
             
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
