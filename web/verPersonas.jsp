
<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ver personas</h1>
        <%
            List<Persona> listapersonas = (List) request.getSession().getAttribute("listaPersonas");
            for (Persona per : listapersonas){
        %>  <h2>Personas</h2>
            <p>Nombre y apellido: <%= per.getNombre() + " "+  per.getApellido()  %></p>
            <p>id: <%= per.getId()  %></p>
            <p>telefono: <%= per.getTelefono() %> </p>
            <p>----------------------------------------------------------</p>
           <% } %>
    </body>
</html>
