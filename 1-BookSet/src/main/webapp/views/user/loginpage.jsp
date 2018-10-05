<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Log in</h1>

<form:form action="loginprocesing" method="post">
	<br>
	<input name="username" type="text" />
	<br>
	<input name="password" type="password" />
	<br>
	<button>Click</button>
	<br>
</form:form>


