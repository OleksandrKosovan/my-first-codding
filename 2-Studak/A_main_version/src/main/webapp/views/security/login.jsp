<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1>Login</h1>

<form:form action="loginprocesing" method="post">
	<input name="username" type="text" />
	<input name="password" type="password" />
	<button>Click</button>
</form:form>






