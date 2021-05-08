<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>test</title>
</head>
<body>
<h2> Affichage des etudiants</h2>
    <form:form action="submitForm" method="post" modelAttribute="listeUtilisateurs">
<table border="1">
<thead>
  <tr>
    <th>numCin</th>
    <th>nom</th>
    <th>prenom</th>
    <th>email</th>
    <th>adresse</th>
    <th>tel</th>
    <th>numIns</th>
  </tr>
  </thead>
  <tbody>
 <c:forEach items="${listeUtilisateurs}" var="place">
  <c:if test = "${place.role=='et'}">
  <tr>
   <td > <input type="checkbox" name="selected" value=" ${place.abs}"> ${place.numCin} </td>
    <td >${place.nom}</td>
    <td >${place.prenom}</td>
    <td >${place.email}</td>
    <td >${place.adresse}</td>
    <td >${place.tel}</td>
     <td >${place.numIns}</td>
  </tr>
     <tr>
        <td colspan="2"><input type="submit" value="submit"></td>
     </tr> 
</c:if>
</c:forEach>
  </tbody> 
</table>
 </form:form>
<a href=/index>page d'acceuil</a>  
</body>
</html>
