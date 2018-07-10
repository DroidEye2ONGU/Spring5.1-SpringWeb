<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%@ page import="DroidEye.Bean.Person" %><%--
  Created by IntelliJ IDEA.
  User: DroidEye
  Date: 2018/7/10
  Time: 8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>

<%
    ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(application);
    Person person = applicationContext.getBean(Person.class);
    System.out.println("--");
    person.hello();
    System.out.println("--");
%>
<body>
<a href="/TestServlet">TestServlet</a>
</body>
</html>
