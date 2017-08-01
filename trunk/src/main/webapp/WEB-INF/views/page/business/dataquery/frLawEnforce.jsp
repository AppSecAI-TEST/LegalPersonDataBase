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
    <title>行政执法信息</title>
</head>
<body>
<jsp:include page="../../common/header.jsp?ref=detail"/>
<input type="hidden" id="frwybs" value="${frwybs}"/>
<div class="iframe-wrap bg-white">
    <div class="pd15">
        <div class="reg-caption">
            <div class="title clearfix">
                <span class="name fl mr5">${lawenforce['ztdj'].frmc}</span>

                <c:if test="${lawenforce['ztdj'].cxzt == '1'}">
                    <span class="icon-rectangle green fl mr10">存续</span>
                </c:if>
                <c:if test="${lawenforce['ztdj'].cxzt == '2'}">
                    <span class="icon-rectangle gray fl mr10">注销</span>
                </c:if>
                <c:if test="${lawenforce['ztdj'].cxzt == '3'}">
                    <span class="icon-rectangle blue fl mr10">个转企</span>
                </c:if>
                <c:if test="${lawenforce['ztdj'].cxzt == '4'}">
                    <span class="icon-rectangle red fl mr10">被列入经营异常名录和严重违法失信（黑名单）</span>
                </c:if>
            </div>
            <p>
                统一社会信用代码/注册号：${lawenforce['ztdj'].tyxydm}
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
                    <li><span class=""><a href="<c:url value='/data/frdetail/produce/${frwybs}'/>">生产经营</a></span>
                    </li>
                    <li class="tab-selected"><span class=""><a href="<c:url value='/data/frdetail/lawenforce/${frwybs}'/>">行政执法</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/lawinfo/${frwybs}'/>">司法信息</a></span>
                    </li>
                    <li><span class=""><a href="<c:url value='/data/frdetail/comment/${frwybs}'/>">评价信息</a></span>
                    </li>
                </ul>
            </div>
            <div class="tab-content">
                <div class="tab-panel tab-panel-show">


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>行政处罚
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['xzcf']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>执法部门名称</th>
                            <th>案件名称</th>
                            <th>被处罚对象类别</th>
                            <th>行政处罚权力事项名称</th>
                            <th>处罚日期</th>
                            <th>撤销处罚日期</th>
                            <th>撤销处罚的原因说明</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="xzcf" varStatus="status" items="${lawenforce['xzcf']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${xzcf.xzcfZfbm}</td>
                                <td>${xzcf.xzcfAm}</td>
                                <td>${xzcf.xzcfDxlb}</td>
                                <td>${xzcf.xzcfQlsx}</td>
                                <td><fmt:formatDate value="${xzcf.xzcfRq}" pattern="yyyy年MM月dd日 "/></td>
                                <td><fmt:formatDate value="${xzcf.xzcfCxrq}" pattern="yyyy年MM月dd日 "/></td>
                                <td>${xzcf.xzcfCxsm}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>行政强制
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['xzqz']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>临时措施时间</th>
                            <th>解除临时措施时间</th>
                            <th>强制执行文号</th>
                            <th>强制执行内容</th>
                            <th>强制执行时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="xzqz" varStatus="status" items="${lawenforce['xzqz']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td><fmt:formatDate value="${xzqz.XZQZ_LSCSRQ}" pattern="yyyy年MM月dd日"/></td>
                                <td><fmt:formatDate value="${xzqz.XZQZ_JCLSRQ}" pattern="yyyy年MM月dd日"/></td>
                                <td>${xzqz.XZQZ_ZXWH}</td>
                                <td>${xzqz.XZQZ_ZXNR}</td>
                                <td><fmt:formatDate value="${xzqz.XZQZ_ZXRQ}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>重点监管
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['zdjg']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>列入重点监管原因</th>
                            <th>监管内容</th>
                            <th>列入时间</th>
                            <th>监管机关</th>
                            <th>撤销时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="zdjg" varStatus="status" items="${lawenforce['zdjg']}">
                            <c:if  test="${!empty gqxx.czCzr}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${zdjg.lrzdjgyy}</td>
                                <td>${zdjg.jgnr}</td>
                                <td><fmt:formatDate value="${zdjg.lrsj}" pattern="yyyy年MM月dd日"/></td>
                                <td>${zdjg.jgjg}</td>
                                <td><fmt:formatDate value="${zdjg.cxsj}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                            </c:if>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>分类监管
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['fljg']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>评价类别</th>
                            <th>评价内容</th>
                            <th>评价结果</th>
                            <th>评价年度</th>
                            <th>评价依据</th>
                            <th>评价机关</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="fljg" varStatus="status" items="${lawenforce['fljg']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${fljg.pjlb}</td>
                                <td>${fljg.pjnr}</td>
                                <td>${fljg.pjjg}</td>
                                <td>${fljg.pjnd}</td>
                                <td>${fljg.pjyj}</td>
                                <td>${fljg.pjjg}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>监督抽查
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['bdccfxx']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table id="metadata-table" class="table-row  nowrap" width="100%">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>被抽查单位</th>
                            <th>抽查测绘项目名称</th>
                            <th>检验报告日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="bdccfxx" varStatus="status" items="${lawenforce['bdccfxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${bdccfxx.bccdw}</td>
                                <td>${bdccfxx.ccchxmmc}</td>
                                <td><fmt:formatDate value="${bdccfxx.jybgrq}" pattern="yyyy年MM月dd日 HH时mm分ss秒"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>监督抽查不合格记录
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['ccbhg']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>被抽查食品名称</th>
                            <th>被抽查药品名称</th>
                            <th>检验结论</th>
                            <th>抽查日期</th>
                            <th>抽查任务下达单位</th>
                            <th>不合格测绘项目名称</th>
                            <th>不合格记录检验报告日期</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="ccbhg" varStatus="status" items="${lawenforce['ccbhg']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${ccbhg.bccspmc}</td>
                                <td>${ccbhg.bccypmc}</td>
                                <td>${ccbhg.jyjl}</td>
                                <td><fmt:formatDate value="${ccbhg.ccrq}" pattern="yyyy年MM月dd日"/></td>
                                <td>${ccbhg.jcrwxddw}</td>
                                <td>${ccbhg.bhgchxmmc}</td>
                                <td><fmt:formatDate value="${ccbhg.bhgjljybgrq}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>机构年检
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['jgnj']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>年检年度</th>
                            <th>年检（年度报告）</th>
                            <th>评估情况</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="jgnj" varStatus="status" items="${lawenforce['jgnj']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${jgnj.njnd}</td>
                                <td>${jgnj.njbg}</td>
                                <td>${jgnj.pgqk}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>企业年报
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['qynb']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>年报年度</th>
                            <th>年度报告日期</th>
                            <th>年度报告状态</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="qynb" varStatus="status" items="${lawenforce['qynb']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${qynb.nbnd}</td>
                                <td><fmt:formatDate value="${qynb.ndbgrq}" pattern="yyyy年MM月dd日"/></td>
                                <td>${qynb.ndbgzt}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>劳动保障书面审查
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['smsc']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>书面审查年度</th>
                            <th>评定等级</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="smsc" varStatus="status" items="${lawenforce['smsc']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${smsc.smscnd}</td>
                                <td>${smsc.pddj}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>无线电台（站）年检
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['wxd']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>无线电台（站）年检</th>
                            <th>年检结果</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="wxd" varStatus="status" items="${lawenforce['wxd']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${wxd.wxdznjnd}</td>
                                <td>${wxd.njjg}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>


                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>监测监控
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['swzcxx']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>站点名称</th>
                            <th>监测时间</th>
                            <th>监测指标</th>
                            <th>监测结果</th>
                            <th>达标情况</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="swzcxx" varStatus="status" items="${lawenforce['swzcxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${jcjk.zdmc}</td>
                                <td><fmt:formatDate value="${jcjk.jcsj}" pattern="yyyy年MM月dd日"/></td>
                                <td>${jcjk.jczb}</td>
                                <td>${jcjk.jcjg}</td>
                                <td>${jcjk.dbqk}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>
                    
                    
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>窃电记录
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['qdjl']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>用电户名</th>
                            <th>窃电量</th>
                            <th>窃电时段</th>
                            <th>窃电总额</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="qdjl" varStatus="status" items="${lawenforce['qdjl']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${qdjl.ydhm}</td>
                                <td>${qdjl.qdl}</td>
                                <td>${qdjl.qdsd}</td>
                                <td>${qdjl.qdze}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>
                    
                    
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>事故信息
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['sgxx']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>事故发生时间</th>
                            <th>事故类型</th>
                            <th>事故原因</th>
                            <th>死亡人数</th>
                            <th>重伤人数</th>
                            <th>财产损失</th>
                            <th>事故简要情况</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="sgxx" varStatus="status" items="${lawenforce['sgxx']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td><fmt:formatDate value="${sgxx.sgfssj}" pattern="yyyy年MM月dd日"/></td>
                                <td>${sgxx.sglx}</td>
                                <td>${sgxx.sgyy}</td>
                                <td>${sgxx.swrs}</td>
                                <td>${sgxx.zsrs}</td>
                                <td>${sgxx.ccss}</td>
                                <td>${sgxx.sgjyqk}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>
                    
                    
                    <div class="light-info mt10 center pos-rel">
                        <i class="flex-icon"></i>隐患记录
                    </div>
                    <c:choose>
                    <c:when test="${empty lawenforce['yhjl']}">
                    	<table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                            <tr>
                                <th>暂无相关数据</th>
                            </tr>
                        </thead>
                    </table>
                    </c:when>
                   <c:otherwise>
                    <table class="table-row nowrap" width="100%" cellpadding="0" cellspacing="0" border="0">
                        <thead>
                        <tr>
                            <th>序号</th>
                            <th>存在重大安全隐患内容</th>
                            <th>认定时间</th>
                            <th>认定依据</th>
                            <th>认定机构</th>
                            <th>销案时间</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="yhjl" varStatus="status" items="${lawenforce['yhjl']}">
                            <tr>
                                <td>${status.index+1}</td>
                                <td>${yhjl.czzdaqyhnr}</td>
                                <td><fmt:formatDate value="${yhjl.rdsj}" pattern="yyyy年MM月dd日"/></td>
                                <td>${yhjl.rdyj}</td>
                                <td>${yhjl.rdjg}</td>
                                <td><fmt:formatDate value="${yhjl.xasj}" pattern="yyyy年MM月dd日"/></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    </c:otherwise>
                    </c:choose>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../../common/common.jsp"/>
<script src="<c:url value='/js/business/dataquery/frLawEnforce.js'/>"></script>
</body>
</html>
