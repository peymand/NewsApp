<%@ page import="java.util.List" %>
<%@ page import="com.kahkeshan.models.New" %><%--
  Created by IntelliJ IDEA.
  User: Peyman
  Date: 3/10/2018
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <script>
        setTimeout(function(){
            window.location.reload(1);
        }, 5000);
    </script>
    <title>Title</title>
</head>
<body>
<%
    List<New> news = (List<New>) getServletConfig().getServletContext().getAttribute("news");
%>
<div class="container">
    <table class="table">
        <tr>
            <th>Title</th>
            <th>Detail</th>
        </tr>
        <% for (New aNew : news) {

        %>
            <tr>
                <td>
                    <%=aNew.getTitle()%>
                </td>
                <td>
                    <%=aNew.getDetail()%>
                </td>
            </tr>
        <%}%>
    </table>

</div>


</body>
</html>
