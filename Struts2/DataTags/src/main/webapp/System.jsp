<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>System Details</title>
</head>

<body>
<p>The environment name property can be accessed in three ways:</p>

(Method 1) Environment Name:
<s:property value="environment.name"/><br/>

(Method 2) Environment Name:
<s:push value="environment">
    <s:property value="name"/><br/>
</s:push>

(Method 3) Environment Name:
<s:set name="myenv" value="environment.name"/>
<s:property value="myenv"/>

</body>
</html>