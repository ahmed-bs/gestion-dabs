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
        <h2>ajouter Admin</h2>
        <form:form action="saveAd" method="post" modelAttribute="listeUtilisateurs">
            <table border="1" >
                <tr>
                    <td>ID: </td>
                    <td>${listeUtilisateurs.numCin}
                        <form:hidden path="numCin"/>
                    </td>
                </tr>        
                <tr>
                    <td>Name: </td>
                    <td><form:input path="nom" /></td>
                </tr>
                 <tr>
                    <td>Prenom: </td>
                    <td><form:input path="prenom" /></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td><form:input path="adresse" /></td>
                </tr>   
                <tr>
                    <td>tel: </td>
                    <td><form:input path="tel" /></td>
                </tr>   
                 <tr>
                    <td>numCnrps: </td>
                    <td><form:input path="numCnrps" /></td>
                </tr> 
                   <tr>
                    <td>role: </td>
                    <td> <form:hidden value="ad" path="role"/></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="SaveAd"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
    <br>
<a href=/index>page d'acceuil</a>  
<br>
</body>
</html>