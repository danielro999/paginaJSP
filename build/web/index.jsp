<!DOCTYPE html>

<html>
    <head>
        <title>Formulario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1> Datos clientes</h1>
        <form action="SvPrueba" method="POST">
            <p><label>Dni:</label><input type="text" name="dni"></p>
            <p><label>nombre:</label><input type="text" name="nombre"></p>
            <p><label>Apellido:</label><input type="text" name="apellido"></p>
            <p><label>Telefono:</label><input type="text" name="telefono"></p>
            <button type="submit" > enviar</button>
        </form>
        
        <h1>Ver lista de clientes</h1>
        <p>click</p>
        <form action="SvPrueba" method="GET">
            <button type="submit" > mostrar clientes</button>
        </form>
    </body>
</html>
