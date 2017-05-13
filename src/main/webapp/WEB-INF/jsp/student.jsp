<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: wbb01
  Date: 2017/5/4
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>
    <h2>Stundent Information</h2>
    <form:form method="post" action="/student/addStudent">
            <table>
                    <tr>
                        <td><form:label path="name">名字：</form:label></td>
                        <td><form:input path="name"></form:input></td>
                    </tr>
                    <tr>
                        <td><form:label path="age">年龄：</form:label></td>
                        <td><form:input path="age"></form:input></td>
                    </tr>
                    <tr>
                        <td><form:label path="id">编号：</form:label></td>
                        <td><form:input path="id"></form:input></td>
                    </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="提交表单">
                    </td>
                </tr>
            </table>
    </form:form>
</body>
</html>
