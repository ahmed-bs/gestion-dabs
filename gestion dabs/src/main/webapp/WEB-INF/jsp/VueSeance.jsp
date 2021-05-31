<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>test</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.9.0/css/all.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous"/> 
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/index">gestion des absences</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/Enseignant">Enseignant  </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/Etudiant">Etudiant</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/classe">classe</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="/compte">compte</a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="/Admin">Admin</a>
      </li>
         <li class="nav-item">
        <a class="nav-link" href="/formAbs">faire  l'absence </a>
      </li>
        <li class="nav-item">
        <a class="nav-link" href="/Etudiantabsent">liste absence </a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/matiere">matiere </a>
      </li>
    </ul>
  </div>
</nav>
<h2> Affichage les classes</h2>
<table border="1">
<thead>
  <tr>
    <th>id</th>
    <th>date</th>
    <th>heure</th>
    <th>supprimer</th>
    <th>edit</th>
  </tr>
  </thead>
  <tbody>
 <c:forEach items="${listeseances}" var="place">
  <tr>
    <td >${place.id_sc} </td>
    <td >${place.date}</td>
     <td >${place.heure}</td>
    <td><a href="deletesean/${place.id_sc}" >Delete</a></td>
     <td><a href="editsean?id_sc=${place.id_sc}">Edit</a></td> 

  </tr>

</c:forEach>
  </tbody> 
</table>
<a href=/index>page d'acceuil</a> 
                   </div>
      </div>
       <tr>
                    <td colspan="2"><input type="submit" value="seance"></td>
                </tr>  
       </div>
       </div>
<footer class="bg-light text-center text-white">
  <!-- Grid container -->
  <div class="container p-4 pb-0">
    <!-- Section: Social media -->
    <section class="mb-4">
      <!-- Facebook -->
      <a
        class="btn btn-primary btn-floating m-1"
        style="background-color: #3b5998;"
        href="#!"
        role="button"
        ><i class="fab fa-facebook-f"></i
      ></a>

      <!-- Twitter -->
      <a
        class="btn btn-primary btn-floating m-1"
        style="background-color: #55acee;"
        href="#!"
        role="button"
        ><i class="fab fa-twitter"></i
      ></a>

      <!-- Google -->
      <a
        class="btn btn-primary btn-floating m-1"
        style="background-color: #dd4b39;"
        href="#!"
        role="button"
        ><i class="fab fa-google"></i
      ></a>

      <!-- Instagram -->
      <a
        class="btn btn-primary btn-floating m-1"
        style="background-color: #ac2bac;"
        href="#!"
        role="button"
        ><i class="fab fa-instagram"></i
      ></a>

      <!-- Linkedin -->
      <a
        class="btn btn-primary btn-floating m-1"
        style="background-color: #0082ca;"
        href="#!"
        role="button"
        ><i class="fab fa-linkedin-in"></i
      ></a>
      <!-- Github -->
      <a
        class="btn btn-primary btn-floating m-1"
        style="background-color: #333333;"
        href="#!"
        role="button"
        ><i class="fab fa-github"></i
      ></a>
    </section>
    <!-- Section: Social media -->
  </div>
  <!-- Grid container -->

  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: #0d6efd;">
    � 2021 Welcome:
    <a class="text-white" href="">IsetBizete.com</a>
  </div>
  <!-- Copyright -->
</footer>
</div>
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script> 
</body>
</html>