<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Books</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
        }
    </style>
</head>
<body>
<h1>Books</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Author</th>
        <th>Year</th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookId}</td>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.year}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
