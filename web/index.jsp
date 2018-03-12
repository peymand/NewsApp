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
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>Login</title>
  </head>
  <body>
  <div class="container">
    <div class="row">
      <div class="span12">
        <form class="form-horizontal" action='/checkRole.do' method="POST">
          <fieldset>
            <div id="legend">
              <legend class="">Login</legend>
            </div>
            <div class="control-group">
              <!-- Username -->
              <label class="control-label"  for="username">Username</label>
              <div class="controls">
                <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
              </div>
            </div>
            <div class="control-group">
              <!-- Password-->
              <label class="control-label" for="role">Role</label>
              <div class="controls">
                <input type="text" id="role" name="role" placeholder="" class="input-xlarge">
              </div>
            </div>
            <div class="control-group">
              <!-- Button -->
              <div class="controls">
                <button class="btn btn-success">Login</button>
              </div>
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </div>


  </body>
</html>
