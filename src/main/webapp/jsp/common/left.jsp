<%@page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>主界面</title>
</head>
<style>

    #left{
       margin-top: 2px;
        float: left;
    }
    li{
        list-style: none;
    }
</style>
<script>
    window.onload=function (ev) {
        alert(123);
        // $ajax({
        //     url:"/menu",
        //     type:"get",
        //     data:"",
        //     dataType:"json",
        //     success:function (data) {
        //         var html = '';
        //         var parent = data.parent;
        //         var son = data.son;
        //         for (var i = 0; i < parent.length; i++) {
        //             html += parent[i].name;
        //             html += '<ul>';
        //             for (var j = 0; j < son.length; j++) {
        //                 for (var j = 0; j < data.length; j++) {
        //                     //var menu_2 = data[j];
        //                     if (parent[i].pId == son[j].pId) {
        //                         html += '<li><a href="' + son[j].url + '">' + son[j].name + '</a></li>\n';
        //                     }
        //                     html += '</ul>';
        //                 }
        //                 $("#left").append(html);
        //             }
        //         }
        //     }
        // });
        //
        // $ajax({
        //     url:"/menu",
        //     type:"get",
        //     data:"",
        //     dataType:"json",
        //     success:function (data) {
        //         var html='';
        //         for (var i = 0; i <data.length ; i++) {
        //             var menu_1=data[i];
        //             if (menu_1.type==1){
        //                 html+=menu_1.name;
        //                 html+='<ul>';
        //                 for (var j = 0; j <data.length ; j++) {
        //                     var menu_2=data[j];
        //                     if (menu_2.pId==menu_1.pId){
        //                         html+= '<li><a href="'+menu_2.url+'">'+ menu_2.name+'</a></li>\n';
        //                     }
        //                 }
        //                 html+='</ul>';
        //             }
        //         }
        //         $("#left").append(html);
        //     }
        // });
    }
</script>
<body>
    <div id="left">
        <%--${path}--%>
    <%--<ul>--%>
        <%--<li><a href="/jsp/user/user.jsp">用户管理</a> </li>--%>
        <%--<li><a href="/jsp/dept/dept.jsp">部门管理</a> </li>--%>
    <%--</ul>--%>
        <%--权限管理--%>
        <%--<ul>--%>
            <%--<li><a href="">角色管理</a> </li>--%>
            <%--<li><a href="">权限管理</a> </li>--%>
        <%--</ul>--%>
    </div>

</body>
</html>
