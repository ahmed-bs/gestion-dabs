<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>   

<!DOCTYPE html>
<html xmlns= http://www.thymeleaf.org >
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
<title>test</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/index">gestion des absences</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/Enseignant">Enseignant  </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Etudiant">Etudiant</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/classe">classe</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/compte">compte</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/Admin">Admin</a>
      </li>
         <li class="nav-item">
        <a class="nav-link" href="/formAbs">faire  l'absence </a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="/Etudiantabsent">liste absence </a>
      </li>

         <li class="nav-item">
        <a class="nav-link" href="/matiere">matiere </a>
      </li>
      
    </ul>
  </div>
</nav>
      
	    <div align="center">
        <h2>ajouter classe</h2>
        <form:form action="savecl" method="post" modelAttribute="listeClasses">
            <table border="1" >
                <tr>
                    <td>ID: </td>
                    <td>${listeClasses.id_class}
                        <form:hidden path="id_class"/>
                    </td>
                </tr>        
                <tr>
                    <td>Name: </td>
                    <td><form:input path="name" /></td>
                </tr>
                 <tr>
             
                <tr>
                    <td colspan="2"><input type="submit" value="savecl"></td>
                </tr>                    
            </table>
        </form:form>
        <a href=/index>page d'acceuil</a>  
    </div>
    <br>

<br>
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
</body>
</html>