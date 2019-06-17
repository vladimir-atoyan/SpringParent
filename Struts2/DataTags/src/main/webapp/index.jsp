<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Hello World</title>
</head>

<body>
<h1>Hello World From Struts2</h1>
<form action="hello">
    <label for="name" id="name">Please pick a name</label><br/>
    <select name="name">
        <option name="Mike">Mike</option>
        <option name="Jason">Jason</option>
        <option name="Mark">Mark</option>
    </select>
    <input type="submit" value="Say Hello"/>
</form>
</body>
</html>