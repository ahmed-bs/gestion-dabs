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
    </div>
    <br>
<a href=/index>page d'acceuil</a>  
<br>
</body>
</html>