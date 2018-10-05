<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<link rel="stylesheet" href="css/main/header.css">




<nav>
	<ul class="topmenu">
		<li><a href="home">Головна</a></li>

		<sec:authorize access="hasRole('ROLE_STATE_REGISTRATION')">
			<li><a href="main_panel">Державна реєстрація</a></li>
		</sec:authorize>



		<li><a href="#">Блог</a>
			<ul class="submenu">
				<li><a href="#">Створити</a></li>
				<li><a href="#">Читати</a></li>
				<li><a href="#">Популярне</a></li>
				<li><a href="#">Нове</a></li>
			</ul></li>
		<li><a href="#">Книги</a>
			<ul class="submenu">
				<li><a href="#">Архів</a></li>
				<li><a href="#">Пошук</a></li>
				<li><a href="#">Купити</a></li>
				<li><a href="#">Новинки</a></li>
			</ul></li>
		<li><a href="#">Контакти</a></li>
	</ul>
</nav>



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

<br><br>
<hr />