<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>test</title>
</head>
<body>
<h2> Affichage les comptes</h2>
<table border="1">
<thead>
  <tr>
    <th>id_compte</th>
    <th>login_name</th>
    <th>password</th>
    <th>role</th>
  </tr>
  </thead>
  <tbody>
 <c:forEach items="${listeComptes}" var="place">
  <tr>
    <td >${place.id_compte} </td>
    <td >${place.login_name}</td>
<td >${place.password} </td>
    <td >${place.role}</td>
    
    <td><a href="deleteee/${place.id_compte}" >Delete</a></td>
     <td><a href="editcomp?id_compte=${place.id_compte}">Edit</a></td> 
  </tr>

</c:forEach>
  </tbody> 
</table>
<a href=/index>page d'acceuil</a>  
</body>
</html>