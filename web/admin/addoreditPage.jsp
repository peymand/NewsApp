<%--
  Created by IntelliJ IDEA.
  User: Peyman
  Date: 3/10/2018
  Time: 6:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>NewsPage</title>
</head>
<body>
<div class="container">
    <div class="row col-md-8 col-md-offset-2 panel panel-default">

        <form class="form" action="/admin/addnew.do" method="post">

            <input value="${param.id}" type="hidden" name="id">

            <div class="form-group">
                <label for="title" class="control-label col-sm-2">Title</label>
                <input id="title" type="text"
                       class="form-control" value="${param.title}" name="title"/>
            </div>

            <div class="form-group">
                <label for="detail" class="control-label col-sm-2">Detail</label>
                <textarea class="form-control" id="detail" name="detail" rows="3">${param.detail}</textarea>
            </div>
            <div class="form-group">
                <label for="date" class="control-label col-sm-2">Date:</label>
                <input type="date" name="date" id="date" class="form-control" value="${param.date}">
            </div>

            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </form>

    </div>
</div>
</body>
</html>
