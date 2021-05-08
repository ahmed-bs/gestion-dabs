<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>test</title>
</head>
<body>
<h2>LISTE ABSENCE </h2>
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
  <c:if test = "${place.role=='et'} && ${place.abs=='true' }">
  <tr>
    <td >${place.numCin} </td>
    <td >${place.nom}</td>
    <td >${place.prenom}</td>
    <td >${place.email}</td>
    <td >${place.adresse}</td>
    <td >${place.tel}</td>
     <td >${place.numIns}</td>

  </tr>
</c:if>
</c:forEach>
  </tbody> 
</table>
<a href=/index>page d'acceuil</a>  
</body>
</html>