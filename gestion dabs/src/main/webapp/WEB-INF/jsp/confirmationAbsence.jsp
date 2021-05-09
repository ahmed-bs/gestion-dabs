<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>   

<!DOCTYPE html>
<html xmlns= http://www.thymeleaf.org >
<head>
<title>test</title>
</head>
<body>

      
	    <div align="center">
        <h2>ajouter etudiant</h2>
        <form:form action="save" method="post" modelAttribute="listeUtilisateurs">
            <table border="1" >
                <tr>
                    <td>ID: </td>
                    <td>${listeUtilisateurs.numCin}
                        <form:hidden path="numCin"/>
                    </td>
                </tr>        
                <tr>
                    <td>Name: </td>
                    <td>${listeUtilisateurs.nom}</td>
                </tr>
                 <tr>
                    <td>Prenom: </td>
                    <td>${listeUtilisateurs.prenom}</td>
                </tr>
           <tr>
             <tr>
                    <td>absence: </td>
                    <td><form:input path="abs" />${listeUtilisateurs.abs}+1</td>
                </tr>
                   <tr>
                    <td>numIns: </td>
                    <td>${listeUtilisateurs.numIns}</td>
                </tr> 
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
<a href=/index>page d'acceuil</a>  
</html>
