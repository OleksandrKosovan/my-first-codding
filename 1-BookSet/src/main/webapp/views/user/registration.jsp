<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Registration</h1>

<form:form modelAttribute="user" action="registration" method="post">
	<br>
	<form:input path="name" />
	<br>
	<form:input path="email" type="email" />
	<br>
	<form:input path="password" type="password" />
	<br>
	<button>Click</button>
	<br>
</form:form>

