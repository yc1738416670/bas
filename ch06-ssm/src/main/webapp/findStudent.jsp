<%--
  Created by IntelliJ IDEA.
  User: 袁创
  Date: 2021/8/6
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
    <base href="<%=basePath%>">
    <script type="text/javascript" src="js/jquery-3.4.1.js">
    </script>

    <script type="text/javascript">
        $(function(){
            lodestudent()
            $("#lode").click(function (){
                lodestudent()
            })
        })
        function lodestudent(){
            $.ajax({
                url:"student/querystu.do",
                type:"get",
                dataType:"json",
                success:function (data){
                    $("#info").html("  ")
                    $.each(data,function (i,n) {
                        $("#info").append("<tr>")
                            .append("<td>"+ n.id + "</td>")
                            .append("<td>"+ n.name + "</td>")
                            .append("<td>"+ n.email + "</td>")
                            .append("<td>"+ n.age + "</td>")
                            .append("</tr>")
                    })
                }
            })
        }
    </script>
</head>
<body>
<div align="center">
    <table align="center">
        <thead>
            <tr>
                <td>学号</td>
                <td>姓名</td>
                <td align="center">邮编</td>
                <td>年龄</td>
            </tr>
        </thead>
        <tbody id="info">
        </tbody>
    </table>
    <input type="submit" id="lode" value="查询"/>
</div>

</body>
</html>
