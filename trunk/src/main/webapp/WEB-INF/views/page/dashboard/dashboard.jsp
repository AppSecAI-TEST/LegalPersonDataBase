<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <title>首页</title>
    <link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" href="<c:url value='/css/style.css'/>">
</head>
<body class="pdr15">
<div class="mb10 index-search-box clearfix">
    <div class="search-hd">
        <div class="search-input">
            <input name="queryParam" id="queryParam" type="text" placeholder="请输入法人名称/统一信用代码/工商注册号/组织机构代码证/纳税人识别号">
            <a href="javascript:void(0);" class="btn-search js-search"></a>
        </div>
    </div>
</div>
<div class="clearfix">
    <div class="col-3 border-box box-item">
        <div class="box-bd"><a href="/data/frdetail/entfrquery"><img src="/img/index-img01.png" alt="">法人查询</a></div>
    </div>
    <div class="col-3 border-box box-item">
        <div class="box-bd"><a href="/data/frdetail/zrrQuery"><img src="/img/index-img02.png" alt="">自然人查询</a></div>
    </div>
    <div class="col-3 border-box box-item">
        <div class="box-bd"><a href=""><img src="/img/index-img03.png" alt="">关系网查询</a></div>
    </div>
    <div class="col-3 border-box box-item">
        <div class="box-bd"><a href="/data/search/AdmissionSearch"><img src="/img/index-img04.png" alt="">许可、资质与荣誉信息</a></div>
    </div>
</div>
<div class="clearfix">
    <div class="two-col-box40 pdr5 fl">
        <div class="charts-cont">
            <h5 class="cts-hd">
                法人类型数量分布
            </h5>
            <div id="index-amount">

            </div>
        </div>
    </div>

    <div class="two-col-box60 pdl5 fl">
        <div class="charts-cont">
            <h5 class="cts-hd">
                部门数据交换情况汇总
            </h5>
            <div id="index-depart-data">

            </div>
        </div>
    </div>
</div>
<jsp:include page="../common/common.jsp"/>
<script src="<c:url value='/js/dashboard/dashboard.js'/>"></script>
</body>
</html>
