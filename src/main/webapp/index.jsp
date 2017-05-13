<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/26
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <script src="http://libs.baidu.com/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>
<button id="getOffice">获取单位列表</button>
<table id="officeTable"></table>
    <script type="text/javascript">
        $(function () {
            $("#getOffice").on("click",function(){
                $.ajax({
                    type : "post",
                    async : true,
                    url : "/office/selectAllOffice",
                    dataType : "json",
                    success : function(data) {
                        $("#officeTable").html("");
                        $("#officeTable").append("<tr><td>ID</td><td>名称</td></tr>");
                       for(var i in data){
                           $("#officeTable").append("<tr><td>"+data[i].id+"</td><td>"+data[i].name+"</td></tr>");
                       }
                    },
                    error : function(errorMsg) {
                        alert("请求指标数据失败!");
                    }
                });
            })
        })
    </script>
</body>
</html>
