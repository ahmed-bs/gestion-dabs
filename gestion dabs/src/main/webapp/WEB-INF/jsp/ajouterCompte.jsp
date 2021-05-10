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
        <h2>ajouter compte</h2>
        <form:form action="savecomp" method="post" modelAttribute="listeComptes">
            <table border="1" >
                <tr>
                    <td>ID: </td>
                    <td>${listeComptes.id_compte}
                        <form:hidden path="id_compte"/>
                    </td>
                </tr>        
                <tr>
                    <td>login_name: </td>
                    <td><form:input path="login_name" /></td>
                </tr>
                 <tr>
                    <td>password: </td>
                    <td><form:input path="password" /></td>
                </tr>
                  <tr>
                    <td>role: </td>
                    <td><form:input path="role" /></td>
                </tr>
                 <tr>
             
                <tr>
                    <td colspan="2"><input type="submit" value="savecomp"></td>
                </tr>                    
            </table>
        </form:form>
    </div>
    <br>
<a href=/index>page d'acceuil</a>  
<br>
</body>
</html>