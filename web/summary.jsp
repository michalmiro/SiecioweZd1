<%@ page import="servlets.productsServlet" %>
<%@ page import="utils.Calculator" %><%--
  Created by IntelliJ IDEA.
  User: Michał
  Date: 2018-06-05
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Summary</title>
</head>
<body>
<table border="2" cellpadding="5" bordercolor="black">
    <%for (int i = 0; i <= productsServlet.products.size() - 1; i++) {%>
    <tr>
        <td><%out.println(productsServlet.products.get(i).toString());%></td>
    </tr>
    <%}%>
    <tr>
    <td><%out.println("Cena wszystkich produktów: " + Calculator.calculatePrice());%></td>
    </tr>
    <tr>
    <td><%out.println("Srednia cena za produkt: " + Calculator.calculateAveragePrice());%></td>
    </tr>
</table>
</body>
</html>
