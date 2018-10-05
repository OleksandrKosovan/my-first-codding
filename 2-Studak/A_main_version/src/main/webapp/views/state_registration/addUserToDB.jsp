<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1>Додати особу до бази даних:</h1>
<h3>${exception}</h3>
<br>
<form:form modelAttribute="userDataBase" action="addUserToDB"
	method="post">
	<br>Ідентифікаційний код:<br>
	<form:input path="identificationID" />
	<br>
	<br>Серія паспорта:<br>
	<form:input path="seriaPassport" />
	<br>
	<br>Код паспорта:<br>
	<form:input path="codePassport" />
	<br>
	<br>Ім'я:<br>
	<form:input path="name" />
	<br>
	<br>Прізвище:<br>
	<form:input path="surname" />
	<br>
	<br>По-батькові:<br>
	<form:input path="dadname" />
	<br>

	<br>
	<br>
	<br>

	<button>Додати</button>
</form:form>



