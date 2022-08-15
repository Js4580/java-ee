<%@ page import="MAgaze.Cart" %><%--
  Created by IntelliJ IDEA.
  User: nazaramanturov
  Date: 9/6/22
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<%
    Cart cart = (Cart) session.getAttribute("cart");
%>
<p> Наименование: <%=
cart.getName()
%>
</p>
<p> Количество: <%=
cart.getQuantity()
%>
</p>
</body>
</html>
