<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="renderer" content="webkit">
    <link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>" type="image/x-icon"/>
    <link rel="stylesheet" href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <meta charset="utf-8">
    <title>法人生产经营情况</title>
</head>
<body>
<form id="produce-form">
	<input type="hidden" id="frwybss" name="frwybs" value="${frwybss}">
</form>
<jsp:include page="../../common/header.jsp?ref=detail"/>
<input type="hidden" id="frwybs" value="${frwybs}"/>
<div class="iframe-wrap bg-white">
    <div class="pd15">
        <div class="reg-caption">
            <div class="title clearfix">
                <span class="name fl mr5">${produce['ztdj'].frmc}</span>
				<span class="icon-rectangle green fl mr10">${produce['ztdj'].cxzt}</span>
                <%-- <c:if test="${produce['ztdj'].cxzt == '存续'}">
                    <span class="icon-rectangle green fl mr10">存续</span>
                </c:if>
                <c:if test="${produce['ztdj'].cxzt == '注销'}">
                    <span class="icon-rectangle gray fl mr10">注销</span>
                </c:if>
                <c:if test="${produce['ztdj'].cxzt == '个转企'}">
                    <span class="icon-rectangle blue fl mr10">个转企</span>
                </c:if>
                <c:if test="${produce['ztdj'].cxzt == '被列入经营异常名录和严重违法失信（黑名单）'}">
                    <span class="icon-rectangle red fl mr10">被列入经营异常名录和严重违法失信（黑名单）</span>
                </c:if> --%>
            </div>
            <p>
                统一社会信用代码/注册号：${produce['ztdj'].tyxydm}
            </p>
        </div>
        <div class="tabbale">
            <div class="tab-header type-tab person-tab">
                <ul class="clearfix">
                    <li class=""><span class="tab-item"><a href="<c:url value='/data/frdetail/djjbxx/${frwybs}'/> ">基本信息</a></span>
                    </li>
                    <li class=""><span class="tab-item"><a href="<c:url value='/data/frdetail/zbyzc/${frwybs}'/>">资本与资产</a></span>
                    </li>
                    <li ><span class="tab-item"><a href="<c:url value='/data/frdetail/admission/${frwybs}'/>">许可、资质与荣誉</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/tax/${frwybs}'/>">纳税、参保与缴费</a></span>
                    </li>
                    <li class="tab-selected"><span class=""><a href="<c:url value='/data/frdetail/produce/${frwybs}'/>">生产经营</a></span>
                    </li>
					<li><span class=""><a href="<c:url value='/data/frdetail/lawenforce/${frwybs}'/>">行政执法</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/lawinfo/${frwybs}'/>">司法信息</a></span>
                    </li>
                    <%-- <li><span class=""><a href="<c:url value='/data/frdetail/comment/${frwybs}'/>">评价信息</a></span>
                    </li> --%>
                </ul>
            </div>
            <div class="tab-content">
                <div class="tab-panel tab-panel-show">
                    <div class="light-info mt10 center pos-rel">
                        <i id="table_hxyp_icon" class="flex-icon"></i>化学药品原料药制造
                    </div>
                    <table style="width:100%!important" id="table_hxyp" class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>序号</th>
                                <th>企业名称/单位名称/人员名称</th>
                                <th>委托加工药品通用名</th>
                                <th>药品受委托加工数量</th>
                                <th>药品加工委托方名称</th>
                                <th>药品加工期限</th>
                                <th>药品委托加工备案日期</th>
                            </tr>
                        </thead>
                    </table>

                    <div class="light-info mt10 center pos-rel">
                        <i id="table_ylqx_icon" class="flex-icon"></i>医疗器械制造
                    </div>
                    <table style="width:100%!important" id="table_ylqx" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>企业名称（委托方）</th>
                            <th>生产许可/备案编号（委托方）</th>
                            <th>委托生产产品名称</th>
                            <th>产品注册号/备案号</th>
                            <th>委托期限</th>
                            <th>备案日期</th>
                            <th>备案部门</th>
                            
                        </tr>
                        </thead>
                    </table>
                    
                    <div class="light-info mt10 center pos-rel">
                        <i id="table_ysww_icon" class="flex-icon"></i>印刷委托书备案信息
                    </div>
                    <table style="width:100%!important" id="table_ysww" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>委托印刷书的编号</th>
                            <th>委托印刷书（刊）名</th>
                            <th>出版单位（委托方）</th>
                            <th>书(刊)印刷委托书创建时间</th>
                            <th>出版单位办理时间</th>
                            <th>印刷企业办理时间</th>
                            <th>撤销委托书的时间</th>
                        </tr>
                        </thead>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i id="table_dlch_icon" class="flex-icon"></i>测绘与地理项目信息
                    </div>
                    <table style="width:100%!important" id="table_dlch" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>单位名称</th>
                            <th>项目名称</th>
                            <th>委托单位</th>
                            <th>项目类型</th>
                            <th>项目开始时间</th>
                            <th>项目完工时间</th>
                            <th>项目金额（万元）</th>
                            <th>项目备案时间</th>
                        </tr>
                        </thead>
                    </table>


                    <div class="light-info mt10 center pos-rel">
                        <i id="table_zscq_icon" class="flex-icon"></i>国家知识产权软科学研究计划项目信息
                    </div>
                    <table style="width:100%!important" id="table_zscq" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>建设单位、单位名称</th>
                            <th>项目编号</th>
                            <th>项目名称</th>
                        </tr>
                        </thead>
                    </table>
                    
                    <div class="light-info mt10 center pos-rel">
                        <i id="table_jtjs_icon" class="flex-icon"></i>交通建设项目信息
                    </div>
                    <table style="width:100%!important" id="table_jtjs" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>工程状态</th>
                            <th>项目类型</th>
                            <th>开工时间</th>
                            <th>交工时间</th>
                        </tr>
                        </thead>
                    </table>

                    <div class="light-info mt10 center pos-rel">
                        <i id="table_zdcy_icon" class="flex-icon"></i>重大产业项目信息
                    </div>
                    <table style="width:100%!important" id="table_zdcy" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>行业地位</th>
                            <th>项目名称</th>
                            <th>项目年份</th>
                            <th>产业项目开工时间</th>
                            <th>竣工时间</th>
                            <th>总用地</th>
                        </tr>
                        </thead>
                    </table>

                    <div class="light-info mt10 center pos-rel">
                        <i id="table_qytz_icon" class="flex-icon"></i>企业投资项目信息
                    </div>
                    <table style="width:100%!important" id="table_qytz" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>建设项目名称</th>
                            <th>主要建设内容及规模</th>
                            <th>建设起始时间</th>
                            <th>建设结束时间</th>
                            <th>项目总投资（万元）</th>
                        </tr>
                        </thead>
                    </table>

                    <div class="light-info mt10 center pos-rel">
                        <i id="table_shfz_icon" class="flex-icon"></i>社会发展项目信息
                    </div>
                    <table style="width:100%!important" id="table_shfz" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>社会发展项目建设</th>
                            <th>建设工期</th>
                            <th>项目总投资（万元）</th>
                            <th>项目状态</th>
                        </tr>
                        </thead>
                    </table>

                    <div class="light-info mt10 center pos-rel">
                        <i id="table_zytz_icon" class="flex-icon"></i>中央投资项目信息
                    </div>
                    <table style="width:100%!important" id="table_zytz" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>专项名称</th>
                            <th>计划建设内容与规模</th>
                            <th>项目总投资（万元）</th>
                        </tr>
                        </thead>
                    </table>
                    
                    <!-- <div class="light-info mt10 center pos-rel">
                        <i id="table_nyhz_icon" class="flex-icon"></i>农业会展企业信息信息
                    </div>
                    <table style="width:100%!important" id="table_nyhz" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>参加会展记录</th>
                            <th>加入会展时间</th>
                            <th>农业产业化等级类型</th>
                            <th>主营产品类型</th>
                        </tr>
                        </thead>
                    </table> -->
                    
                    <div class="light-info mt10 center pos-rel">
                        <i id="table_kjcg_icon" class="flex-icon"></i>科技成果
                    </div>
                    <table style="width:100%!important" id="table_kjcg" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>科技成果名称</th>
                            <th>科技成果登记号</th>
                            <th>知识产权</th>
                            <th>成果公报内容</th>
                        </tr>
                        </thead>
                    </table>
                    
                    <div class="light-info mt10 center pos-rel">
                        <i id="table_csjz_icon" class="flex-icon"></i>慈善捐赠
                    </div>
                    <table style="width:100%!important" id="table_csjz" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>捐赠项目名称</th>
                            <th>捐赠金额</th>
                            <th>受理单位</th>
                            <th>捐赠日期</th>
                        </tr>
                        </thead>
                    </table>
                    
                    <div class="light-info mt10 center pos-rel">
                        <i id="table_ssxx_icon" class="flex-icon"></i>上市信息
                    </div>
                    <table style="width:100%!important" id="table_ssxx" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                           <th>序号</th>
                           <th>单位名称</th>
                           <th>股票代码</th>
                           <th>上市日期</th>
                        </tr>
                        </thead>
                    </table>
                    
                    <div class="light-info mt10 center pos-rel">
                        <i id="table_cjxm_icon" class="flex-icon"></i>承建项目
                    </div>
                    <table style="width:100%!important" id="table_cjxm" class="table-row w100 nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>项目名称</th>
                            <th>项目单位</th>
                            <th>社会发展项目建设内容</th>
                            <th>项目总投资（万元）</th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../../common/common.jsp"/>
<script src="<c:url value='/js/business/dataquery/frProduce.js'/>"></script>
</body>
</html>
