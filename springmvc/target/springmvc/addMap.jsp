<%--
  Created by IntelliJ IDEA.
  User: zuojianhou
  Date: 2020/1/2
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/data/map" method="post">
        用户1编号: <input type="text" name="students['a'].id"/><br/>
        用户1名称: <input type="text" name="students['a'].name"/><br/>
        用户1地址: <input type="text" name="students['a'].address.value"/><br/>
        用户2编号: <input type="text" name="students['b'].id"/><br/>
        用户2名称: <input type="text" name="students['b'].name"/><br/>
        用户2地址: <input type="text" name="students['b'].address.value"/><br/>
        用户3编号: <input type="text" name="students['c'].id"/><br/>
        用户3名称: <input type="text" name="students['c'].name"/><br/>
        用户3地址: <input type="text" name="students['c'].address.value"/><br/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
