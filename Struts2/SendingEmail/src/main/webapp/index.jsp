<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Email Form</title>
</head>

<body>
<em>The form below uses Google's SMTP server.
    So you need to enter a gmail username and password
</em>

<form action = "emailer" method = "post">
    <label for = "from" id="from">From</label><br/>
    <input type = "text" name = "from"/><br/>
    <label for = "password" id="password">Password</label><br/>
    <input type = "password" name = "password"/><br/>
    <label for = "to" id="to">To</label><br/>
    <input type = "text" name = "to"/><br/>
    <label for = "subject" id="subject">Subject</label><br/>
    <input type = "text" name = "subject"/><br/>
    <label for = "body" id="body">Body</label><br/>
    <input type = "text" name = "body"/><br/>
    <input type = "submit" value = "Send Email"/>
</form>
</body>
</html>