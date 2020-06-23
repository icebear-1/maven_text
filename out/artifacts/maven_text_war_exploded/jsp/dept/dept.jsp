<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>主界面</title>
</head>
<style>
    #bottom{
        height: 90%;
        width: 10%;
        border: 1px solid red;
        float: left;
    }

    li{
        list-style: none;
    }
</style>
<body>
<%@include file="../common/left.jsp"%>
<div id="bottom">
    <%@include file="../common/left.jsp"%>
    <div id="right">
        部门管理
    </div>
</div>
</body>
</html>
