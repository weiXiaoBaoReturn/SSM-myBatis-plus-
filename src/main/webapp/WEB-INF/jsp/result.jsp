<%--
  Created by IntelliJ IDEA.
  User: wbb01
  Date: 2017/5/5
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>
    <h2>提交的信息--</h2>
        <table>
            <tr>
                    <td>名称：</td>
                    <td>${name}</td>
            </tr>
            <tr>
                    <td>年龄：</td>
                    <td>${age}</td>
            </tr>
            <tr>
                    <td>编号：</td>
                    <td>${id}</td>
            </tr>
        </table>
</body>
</html>
