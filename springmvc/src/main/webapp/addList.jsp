<%--
  Created by IntelliJ IDEA.
  User: zuojianhou
  Date: 2020/1/1
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/data/list" method="post">
        用户1编号: <input type="text" name="students[0].id"/><br/>
        用户1名称: <input type="text" name="students[0].name"/><br/>
        用户1地址: <input type="text" name="students[0].address.value"/><br/>
        用户2编号: <input type="text" name="students[1].id"/><br/>
        用户2名称: <input type="text" name="students[1].name"/><br/>
        用户2地址: <input type="text" name="students[1].address.value"/><br/>
        用户3编号: <input type="text" name="students[2].id"/><br/>
        用户3名称: <input type="text" name="students[2].name"/><br/>
        用户3地址: <input type="text" name="students[2].address.value"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
