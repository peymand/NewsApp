<%--
  Created by IntelliJ IDEA.
  User: Peyman
  Date: 3/10/2018
  Time: 6:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Login</title>
  </head>
  <body>
  <div class="container">
    <div class="row">
      <div class="col-md-4 col-md-offset-4">
        <div class="panel panel-default">
          <div class="panel-heading">
            <span class="glyphicon glyphicon-lock"></span> Login</div>
          <div class="panel-body">
            <form class="form-horizontal" role="form" action="/login.do">
              <div class="form-group">
                <label for="username" style="color:red">${param.msg}</label>
                </div>
              <div class="form-group">
                <label for="username" class="col-sm-3 control-label">
                  UserName</label>
                <div class="col-sm-9">
                  <input type="text" name="username" class="form-control" id="username" placeholder="Username" required>
                </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-3 control-label">
                  Password</label>
                <div class="col-sm-9">
                  <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="Password" required>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-3 col-sm-9">
                  <div class="checkbox">
                    <label>
                      <input type="checkbox"/>
                      Remember me
                    </label>
                  </div>
                </div>
              </div>
              <div class="form-group last">
                <div class="col-sm-offset-3 col-sm-9">
                  <button type="submit" class="btn btn-success btn-sm">
                    Sign in</button>
                  <button type="reset" class="btn btn-default btn-sm">
                    Reset</button>
                </div>
              </div>
            </form>
          </div>
          <div class="panel-footer">
            Not Registred? <a href="/Registration.jsp">Register here</a></div>
        </div>
      </div>
    </div>
  </div>

  </body>
</html>
