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
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>NewsPage</title>
</head>
<body>
<div class="container">
    <div class="row">

        <form action="/addnew.do" method="post" class="col-md-8 col-md-offset-2">


            <div class="form-group">
                <label for="title">Title</label>
                <input id="title" type="text"
                       class="form-control" name="title"/>
            </div>

            <div class="form-group">
                <label for="detail">Detail</label>
                <textarea class="form-control" id ="detail" name="detail" rows="3"></textarea>
            </div>


            <button type="submit" class="btn btn-default">Submit</button>

        </form>

    </div>
</div>
</body>
</html>
