<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- <link rel="stylesheet" href="css/header.css"> -->


<h1>header</h1>


<h3>
	<a href="home">home</a>
</h3>


<sec:authorize access="!isAuthenticated()">

	<form:form action="login" method="get">
		<button>login</button>
	</form:form>

	<form:form action="registration" method="get">
		<button>registration</button>
	</form:form>

</sec:authorize>

<sec:authorize access="isAuthenticated()">

	<form:form action="logout" method="post">
		<button>logout</button>
	</form:form>

</sec:authorize>




<hr />