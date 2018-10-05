<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Book</h1>

<br>


<c:forEach var="book" items="${books.content}">
<br>
${book.name}
<br>
${book.author}
<br>
${book.price}
<br>
<a href="${book.linkWebSite}">sourіe</a>
<br>
<a href="${book.link}">commodity page</a>
<hr>

</c:forEach>

<c:set var="currentPage" value="${books.number}"/>
<c:set var="totalPages" value="${totalPages-1}"/>


<c:if test="${currentPage != 0}">
    <a href="/pageable/${books.number-1}/5">previous</a>
</c:if>


<c:forTokens var="page" items="${pages}" delims="-"><%--0-1-2-3-4-5-6--%>

    <a href="/pageable/${page}/5">${page}</a>

</c:forTokens>


<c:if test="${currentPage < totalPages}">
    <a href="/pageable/${books.number+1}/5">next</a>
    
</c:if>







