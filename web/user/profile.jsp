<%--
  Created by IntelliJ IDEA.
  User: asadi
  Date: 3/16/2018
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="row col-sm-8 col-sm-offset-2">
        <div class="form-control">
            Dear User:
            ${user.name}
            with role:
            ${user.role}
            welcome to your profile.

        </div>

    </div>

</div>


</body>
</html>
