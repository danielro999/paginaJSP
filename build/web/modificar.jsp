
<%@page import="logica.Persona"%>
<!DOCTYPE html>
<html>
 <head>
        <title>Modificar Persona</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1> Datos clientes modificar</h1>
        <form action="SvModificar" method="POST">
              <%
              Persona persona = (Persona) request.getSession().getAttribute("persona");
              
              %>
            <p><label >Dni:</label><input type="text" name="dni" value="<%=persona.getDni()  %>"></p>
            <p><label>nombre:</label><input type="text" name="nombre" value="<%=persona.getNombre()  %>"></p>
            <p><label>Apellido:</label><input type="text" name="apellido" value="<%=persona.getApellido()  %>"></p>
            <p><label>Telefono:</label><input type="text" name="telefono" value="<%=persona.getTelefono()  %>"></p>
            <button type="submit" > enviar</button>
        </form>
    </body>
</html>
