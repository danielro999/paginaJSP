
package Servlets;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;
//import javax.servlet.http.HttpSession;
import logica.Persona;

@WebServlet(name = "SvPrueba", urlPatterns = {"/SvPrueba"})
public class SvPrueba extends HttpServlet {
    
    Controladora control = new Controladora ();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        
//        List<Persona> listaPersonas = new ArrayList<> ();
//        listaPersonas.add(new Persona(1,"27656456","alberto","fernandez","45151815"));
//        listaPersonas.add(new Persona(2, "131515", "juan", "gaomez", "321323423"));
//       
//        
////        HttpSession misession = request.getSession();
//        misession.setAttribute("listaPersonas", listaPersonas);
//
//        response.sendRedirect("verPersonas.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
       Persona per = new Persona(0, dni, nombre, apellido, telefono);
        control.crearPersona(per);
                
        System.out.println(per.getApellido());


    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
