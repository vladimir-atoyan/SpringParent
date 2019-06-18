<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Text Tag Example</title>
</head>

<body>
<s:i18n name="HelloWorldAction4">
    <s:text name="name.success"/><br>
    <s:text name="name.xyz">Message doesn't exists</s:text><br>
    <s:text name="name.msg.param">
        <s:param>ZARA</s:param>
    </s:text>
</s:i18n>
</body>
</html>