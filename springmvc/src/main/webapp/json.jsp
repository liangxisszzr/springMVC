<%--
  Created by IntelliJ IDEA.
  User: zuojianhou
  Date: 2020/1/2
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="application/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="application/javascript">
        $(function () {
            const student = {
                "id" : 1,
                "name" : "张三",
                "address" : {
                    "value" : "mmm"
                }
            };
            $.ajax({
                url: "/data/json",
                data: JSON.stringify(student),
                type: "post",
                contentType: "application/json;charset=UTF-8",
                dataType: "JSON",
                success:function (data) {
                    alert(data.id + "-" + data.name + "-" + data.address.value)
                }
            })
        })
    </script>
</head>
<body>

</body>
</html>
