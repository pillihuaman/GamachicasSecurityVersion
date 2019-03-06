<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
${Mensaje}
  <div class="container">
      <form:form method = "POST" action = "/gamachicas.com.pe/addImagen">
  <fieldset>
    <div id="legend">
      <legend class="">Registrar Informacion de la imagen</legend>
    </div>
    <div class="control-group">
      <!-- Username -->
      <label class="control-label"  for="username">Nombre de la imagen:</label>
      <div class="controls">
      <form:input path = "name" placeholder="Nombre de la imagen a guardar" class="form-control"/>
        <p class="help-block">Nombre de la imagen solo letras</p>
      </div>
    </div>
    <div class="control-group">
      <label class="control-label">Descripción</label>
      <div class="controls">
  <form:textarea path = "description" placeholder="Dreve descripcion de la imagen caracteristicas " class="form-control"/>
      </div>
    </div>
     <br>
       <div class="control-group">
      <label class="control-label">Adjuntar Imagen</label>
      <div class="controls">
      <input type="file" name="imagendata" id="imagendata">
      </div>
    </div>
 <br>
    <div class="control-group">
      <!-- Button -->
      <div class="controls">
      <input type="submit" class="btn btn-success" value="Registrar">
      
      </div>
    </div>
  </fieldset>
      </form:form>
            </div>

</body>
</html>