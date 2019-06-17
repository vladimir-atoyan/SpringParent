<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>Employees</title>
</head>

<body>
<b>Example of Iterator Tag</b><br/>

<s:iterator value="employees">
    <s:property value="name"/> ,
    <s:property value="department"/><br/>
</s:iterator>

<br/><br/>

<b>Employees sorted by Department</b>
<br/>

<s:bean name="com.tutorialspoint.struts2.DepartmentComparator"
        var="deptComparator"/>

<s:sort comparator="deptComparator" source="employees">

    <s:iterator>
        <s:property value="name"/> ,
        <s:property value="department"/><br/>
    </s:iterator>
</s:sort>

<br/><br/>

<b>SubSet Tag - Employees working in Recruitment department </b><br/>
<s:subset decider="recruitmentDecider" source="employees">

    <s:iterator>
        <s:property value="name"/> ,
        <s:property value="department"/><br/>
    </s:iterator>

</s:subset>

<br/><br/>

<b>SubSet Tag - Employees 2 and 3 </b><br/>

<s:subset start="1" count="2" source="employees">

    <s:iterator>
        <s:property value="name"/> ,
        <s:property value="department"/><br/>
    </s:iterator>

</s:subset>
</body>
</html>