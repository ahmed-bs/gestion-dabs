<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>test</title>
</head>
<body>
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
</body>
</html>