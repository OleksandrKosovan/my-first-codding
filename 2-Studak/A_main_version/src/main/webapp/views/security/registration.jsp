<%@ page contentType="text/html;charset=UTF-8" language="java"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1>Registration</h1>
<h3>${exception}</h3>

<form:form modelAttribute="user" action="registration" method="post">
	<form:input path="identification_code"
		placeholder="identification_code" />
	<form:input path="name" placeholder="name" />
	<form:input path="surname" placeholder="surname" />
	<form:input path="dadsurname" placeholder="dadsurname" />
	<form:input path="email" type="email" placeholder="email" />
	<form:input path="phone" placeholder="phone" />
	<form:input path="password" type="password" placeholder="password" />
	<button>Click</button>
</form:form>


