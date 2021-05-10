<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>test</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
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
<h2> Affichage les classes</h2>
<table border="1">
<thead>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>supprimer</th>
    <th>edit</th>
  </tr>
  </thead>
  <tbody>
 <c:forEach items="${listeClasses}" var="place">
  <tr>
    <td >${place.id_class} </td>
    <td >${place.name}</td>

    <td><a href="deletee/${place.id_class}" >Delete</a></td>
     <td><a href="editcl?id_class=${place.id_class}">Edit</a></td> 
  </tr>

</c:forEach>
  </tbody> 
</table>
<a href=/index>page d'acceuil</a> 
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script> 
</body>
</html>