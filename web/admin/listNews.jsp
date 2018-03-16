<%@ page import="java.util.List" %>
<%@ page import="com.kahkeshan.models.New" %><%--
  Created by IntelliJ IDEA.
  User: Peyman
  Date: 3/10/2018
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet"
          id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row col-sm-8 col-md-offset-2">
        <table class="table">
            <tr>
                <th>Id</th>
                <th>Title</th>
                <th>Desc</th>
                <th>Author</th>
                <th>Delete</th>
                <th>Edit</th>
            </tr>
            <c:forEach items="${news}" var="item">
                <tr class="active">
                    <td>${item.id}</td>
                    <td>${item.title}</td>
                    <td>${item.detail}</td>
                    <td><a href="/showUserProfile.do?id=${item.user.id}">${item.user.name}</a></td>
                    <td><a href="/admin/deleteNews.do?id=${item.id}">
                        <button title="delete" type="button"
                                class="btn btn-danger remove show_tip"
                                data-original-title="Remove from list">
                            <i class="fa fa-trash-o"></i></button>
                    </a></td>

                    <td><a href="/admin/addoreditPage.jsp?id=${item.id}&title=${item.title}&detail=${item.detail}&date=${item.date}">
                        <button title="edit" type="button"
                                class="btn btn-info edit show_tip"
                                data-original-title="Edit from list">
                            <i class="fa fa-pencel"></i></button>
                    </a></td>
                </tr>

            </c:forEach>
        </table>
    </div>

</div>


</body>
</html>
