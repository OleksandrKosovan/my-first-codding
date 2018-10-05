<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

    <h1>Add book with other story</h1>

<h2>Для початку потрібно провірити кількість сторінок у джерелі, щоб правильно зпарсити об'єкт</h2>
<a href="https://www.bookclub.ua/ukr/catalog/books/?listmode=2">Посилання на джерело</a>
<br>



<form:form action="addBookParser" method="post">
	<input name="numbers_pages" type="number" placeholder="numbers pages">
	<br>
	<button>Click</button>
</form:form>    