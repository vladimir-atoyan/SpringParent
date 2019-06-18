<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Hello World</title>
</head>

<body>
<s:url id="login" action="login" var="myurl">
    <s:param name="user">Zara</s:param>
</s:url>

<a href='<s:property value = "#myurl"/>'>
    <s:property value="#myurl"/></a>
</body>
</html>