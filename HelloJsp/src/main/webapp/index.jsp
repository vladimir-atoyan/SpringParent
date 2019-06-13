<html>
<%@ page import="java.util.*, java.text.*" %>

<%!
    String getFormattedDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return sdf.format(new Date());
    }
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello, JSP!</title>
</head>
<body>
<h1>Hello, JSP!</h1>
<i>Today <%= getFormattedDate() %></i>
</body>
</html>