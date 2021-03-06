<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <meta charset="utf-8">
    <title>法人查询</title>
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
    <link rel="stylesheet" href="<c:url value='/js/lib/pagination/pagination.css'/>">
</head>
<body>
<div class="iframe-wrap bg-white">
    <div class="mb10 index-search-box clearfix">
        <div class="search-hd">
            <div class="search-input">
                <input name="queryParam" id="queryParam" type="text" placeholder="请输入法人名称/统一信用代码/工商注册号/组织机构代码证/纳税人识别号">
                <a href="javascript:void(0);" class="btn-search js-search"></a>
            </div>
        </div>
    </div>
    <div class="search-list-box-wrap">
	    <div class="search-list-box clearfix js-template">
	    </div>
    </div>

    <!-- 分页 -->
    <div id="js-pagination" class="pagination pagination-custom" style="display: none">
        <hr class="mt20">
        <div id="pagination" class="pagination"></div>
    </div>
</div>
<jsp:include page="../../common/common.jsp"/>
<script src="<c:url value='/js/business/dataquery/frQuery_main.js'/>"></script>
<script id="listTemplate" type="text/x-handlebars-template">
    {{#ifCond list 'length' 0}}
    <div class="">
        <p>很抱歉，没有找到相关结果</p>
    </div>
    {{else}}
    <ul>
        {{#each list}}
        <li>
            <h3><a href="javascript:void(0);" class="look" style="text-decoration:none;color:#1e62a3;" corpid="{{frwybs}}">{{frmc}}</a></h3>
            <p>
                <span class="item-co1">统一社会信用代码/注册号：{{tyxydm}}</span>
				<!-- <span class="item-co1" style="width:450px;">法人唯一标识：<a target="_blank" style="text-decoration:none;color:#1e62a3;" href="<c:url value="/data/frdetail/djjbxx/{{frwybs}}"/>">{{frwybs}}</a></span> -->
                <span class="item-co2" style="width:250px;">法定代表人：{{fddbr}}</span>
                成立日期：{{prettifyDate djrq}}
            </p>
        </li>
        {{/each}}
    </ul>
    {{/ifCond}}
</script>
</body>
</html>
