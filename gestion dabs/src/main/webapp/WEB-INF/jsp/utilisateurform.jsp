<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>test</title>
</head>
<body>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Ajouter utilisateur</h1>  
       <form:form method="post" action="save">    
        <table >    
        
         <tr>    
          <td>nom : </td>   
          <td><form:input path="nom"  /></td>  
         </tr>  
         <tr>  
          <td>prenom : </td>   
          <td><form:input path="prenom"  /></td>  
         </tr>    
         <tr>    
          <td>email :</td>    
          <td><form:input path="email" /></td>  
         </tr>   
         <tr>    
          <td>adresse :</td>    
          <td><form:input path="adresse" /></td>  
         </tr>   
         <tr>    
          <td>tel :</td>    
          <td><form:input path="tel" /></td>  
         </tr>  
         <tr>   
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>   
  
       <a href="/Utilisateur">retour a  les utilisateurs</a>  
</body>
</html>