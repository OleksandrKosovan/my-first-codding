<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<h1>Add book</h1>


<form:form modelAttribute="book" action="addBook" method="post">
	<br>Name:<br>
	<form:input path="name" />
	<br>Author:<br>
	<form:input path="author" />
	<br>Link:<br>
	<form:input path="link" />
	<br>Price:<br>
	<form:input path="price" />
	<br>Link Web Site<br>
	<form:input path="linkWebSite" />
	<br>
	<button>Click</button>
</form:form>
