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
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
        setTimeout(function(){
            window.location.reload(1);
        }, 5000);
    </script>
    <title>Title</title>
</head>
<body>
<br/>
<br/>
<br/>

<div class ="container">
    <div class="row">
        <%--<form class="col-md-8 col-md-offset-2" >--%>
        <div class="row col-sm-8 col-md-offset-2">
            <table class="table">
                <tr>
                <th>Title</th>
                <th>Detail</th>
                </tr>
                <c:forEach items="${news}" var="item">
                    <tr class="active">
                        <td>${item.title}</td>
                        <td>${item.detail}</td>
                    </tr>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <%--</form>--%>
    </div>

</div>

</body>
</html>
