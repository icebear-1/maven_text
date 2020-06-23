<%@page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>主界面</title>
</head>
<style>
#right{
     margin-left: 5px;
     height: 90%;
     width: 89%;
     border: 1px solid red;
     float: left;
 }
#left{
    margin-top: 2px;
    float: left;
}
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
<%@include file="top.jsp"%>
<div id="bottom">
    <%@include file="left.jsp"%>
    <div id="right">
        热烈欢迎！
    </div>
</div>
</body>
</html>
