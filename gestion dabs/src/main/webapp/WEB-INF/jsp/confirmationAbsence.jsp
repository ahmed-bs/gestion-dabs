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
        <form:form action="saveAbs" method="post" modelAttribute="listeUtilisateurs">
            <table border="1" >
                <tr>
                    <td>ID: </td>
                    <td>${listeUtilisateurs.numCin}
                        <form:hidden path="numCin"/>
                    </td>
                </tr>        
                <tr>
                    <td>Name: </td>
                    <td>${listeUtilisateurs.nom} <form:hidden path="nom"/></td>
                </tr>
                 <tr>
                    <td>Prenom: </td>
                    <td>${listeUtilisateurs.prenom} <form:hidden path="prenom"/></td>
                </tr>
           
             <tr>
                    <td>absence: </td>
                    <td>${listeUtilisateurs.abs+1}<form:hidden  path="abs" value="${listeUtilisateurs.abs+1}"/></td>
                </tr>
                   <tr>
                    <td>numIns: </td>
                    <td>${listeUtilisateurs.numIns}<form:hidden path="numIns"/></td>
                </tr> 
                      
                 <tr>         
                    <td>Email: </td>
                    <td>${listeUtilisateurs.email}<form:hidden path="email" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td>${listeUtilisateurs.adresse}<form:hidden path="adresse" /></td>
                </tr>   
                <tr>
                    <td>tel: </td>
                    <td>${listeUtilisateurs.tel}<form:hidden path="tel" /></td>
                </tr>   
                <tr>
                    <td>role: </td>
                    <td> ${listeUtilisateurs.role}<form:hidden value="et" path="role"/></td>
                </tr> 
                           
                <tr>
                    <td colspan="2"><input type="submit" value="confirmer modification"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
</body>
<a href=/index>page d'acceuil</a>  
</html>
