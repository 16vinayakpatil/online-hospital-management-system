<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page isELIgnored="false"%>
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
      

      
      <div class="container navigation">

        <div class="navbar-header page-scroll">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                    <i class="fa fa-bars"></i>
                </button>
          <a class="navbar-brand" href="<c:url value="/Welcome"/>">
                    <h5>Hospital Management System</h5>
                </a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="<c:url value="/welcome"/>">Home</a></li>
            <c:choose>
            
            <c:when test="${sessionScope.roleLogin.id == 1}">
           <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Doctor</a>
              <ul class="dropdown-menu">
                <li><a href="<c:url value="/ctl/Doctor"/>">Add Doctor</a></li>
                <li><a href="<c:url value="/ctl/Doctor/Search"/>">Doctor List</a></li>
              </ul>
            </li>
             <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Receptionist</a>
              <ul class="dropdown-menu">
                <li><a href="<c:url value="/ctl/Receptionist"/>">Add Receptionist</a></li>
                <li><a href="<c:url value="/ctl/Receptionist/Search"/>">Receptionist List</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Patient</a>
              <ul class="dropdown-menu">
                <li><a href="<c:url value="/ctl/Patient"/>">Add Patient</a></li>
                <li><a href="<c:url value="/ctl/Patient/Search"/>">Patient List</a></li>
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Appointment</a>
              <ul class="dropdown-menu">
                <li><a href="<c:url value="/ctl/Appointment"/>">Add Appointment</a></li>
                <li><a href="<c:url value="/ctl/Appointment/Search"/>">Appointment List</a></li>
              </ul>
            </li>
          </c:when>
           </c:choose>
           <c:choose>
            
            <c:when test="${sessionScope.roleLogin.id == 2}">
           <li><a href="<c:url value="/ctl/Patient/Search"/>">Patient List</a></li>
           	<li><a href="<c:url value="/ctl/Appointment/Search"/>">Appointment List</a></li>
           	</c:when></c:choose>
           	
          <c:choose>
           <c:when test="${sessionScope.roleLogin.id == 3}">
        	<li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pation</a>
              <ul class="dropdown-menu">
                  <li><a href="<c:url value="/ctl/Patient"/>">Add Patient</a></li>
                <li><a href="<c:url value="/ctl/Patient/Search"/>">Patient List</a></li>
              </ul>
            </li>
            
           </c:when>
           </c:choose>
           <c:choose>
           <c:when test="${sessionScope.roleLogin.id > 0}">
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown"><s:message
								code="label.welcome" /> ${userLogin.firstName}</a>
              <ul class="dropdown-menu">
                <li><a href="<c:url value="/ctl/User/profile"/>">My Profile</a></li>
                <li><a href="<c:url value="/ctl/User/changepassword"/>">Change Password</a></li>
                <c:url var="log" value="/Login" />
                <li><a href="${log}">Logout</a></li>
              </ul>
            </li>
            
            </c:when>
            <c:otherwise> 
            <c:url var="log" value="/Login" />
            <li><a href="${log}">SignIn</a></li>
            </c:otherwise>
           </c:choose> 
          </ul>
        </div>
        <!-- /.navbar-collapse -->
      </div>
      <!-- /.container -->
    </nav>
