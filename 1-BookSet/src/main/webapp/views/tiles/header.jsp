<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<link rel="stylesheet" href="css/header.css">

<style>
@import url(http://fonts.googleapis.com/css?family=Raleway);

body {
	margin: 0px;
}

nav {
	margin-top: 40px;
	padding: 24px;
	text-align: center;
	font-family: Raleway;
	box-shadow: 2px 2px 8px rgba(0, 0, 0, 0.5);
}

#nav-1 {
	background: #eee;
}

.link-1 {
	transition: 0.3s ease;
	background: #eee;
	color: #999;
	font-size: 20px;
	text-decoration: none;
	border-top: 4px solid #eee;
	border-bottom: 4px solid #eee;
	padding: 20px 0;
	margin: 0 20px;
}

.link-1:hover {
	border-top: 4px solid #ffffff;
	border-bottom: 4px solid #ffffff;
	padding: 6px 0;
}
<!--
-->
</style>

<nav id="nav-1">
	<a class="link-1" href="index">Home</a> <a class="link-1" href="#">About</a>
	<a class="link-1" href="#">Contact</a> <a class="link-1"
		href="shop">Shop</a>
</nav>


<sec:authorize access="isAuthenticated()">

	<form:form action="logout" method="post">
		<button>logout</button>
	</form:form>

</sec:authorize>

<sec:authorize access="!isAuthenticated()">
	<br>
	<form:form action="loginpage" method="get">
		<button>login</button>
	</form:form>
	<br>
	<form:form action="registration" method="get">
		<button>registration</button>
	</form:form>
	<br>
</sec:authorize>

<sec:authorize access="hasRole('ROLE_ADMIN')">

	<form:form action="adminpage" method="get">
		<button>admin</button>
	</form:form>

</sec:authorize>

<sec:authentication property="name" />


