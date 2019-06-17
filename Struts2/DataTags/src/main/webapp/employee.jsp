<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Employees</title>
</head>

<body>
<s:action name="hello" executeResult="true">
    Output from Hello:  <br />
</s:action>

<br /> <br /> <br />

<s:action name="hello" executeResult="false">
    Output 2 from Hello:  <br />
</s:action>

<s:iterator value="#attr.names">
    <s:property /><br />
</s:iterator>

</body>
</html>