<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>生产经营查询</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta charset="utf-8">
<link rel="stylesheet" href="/css/system.css">
<link rel="stylesheet" href="/css/vendor/dataTables.bootstrap.min.css">
<link rel="stylesheet" href="/js/lib/jquerymultiselect/jquery.multiselect.css">
<link rel="stylesheet" href="/js/lib/layer/skin/layer.css">
<script src="/js/lib/require.js"></script>
<script src="/js/config.js"></script>
</head>
<body style="background-color: #f4f4f4">
<div class="tabbale iframe-wrap" data-component="tab">
    <div class="form-panel">
        <div class="title">化学药品原料药制造</div>
        <form id="hxyp_form" class="form-box mb5">
            <div class="form-list pdr8">
                <div class="form-item clearfix">
                    <div class="col-6">
                        <label class="item-name col-5">企业名称：</label>
                        <div class="col-7">
                            <div class="ipt-box col-12">
                                <input type="text" class="ipt-txt" name="dwmc"
                                       placeholder="请输入企业名称（支持模糊查询）" />
                            </div>
                        </div>
                    </div>
                    <div class="col-6">
                        <label class="item-name col-5">法人唯一标识：</label>
                        <div class="col-7">
                            <div class="ipt-box col-11">
                                <input type="text" class="ipt-txt" name="frwybs" placeholder=""/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="center mt10">
                <input type="button" id="hxyp_search" value="查询" class="btn mr20">
                <input type="reset" id="hxyp_cancel" value="重置" class="btn mr20">
            </div>
        </form>
    </div>
</div>
<div class="tab-content mb20 mt10">
    <div class="tab-panel tab-panel-show">
        <div id="hxyp_tab" class="">
            <div class="table-out">
                <table id="hxyp_table" border="0" cellspacing="0" cellpadding="0"
                       class="table-row display nowrap">
                    <thead style="white-space:nowarp;">
	                    <tr>
                           <th>序号</th>
                           <th>委托加工药品通用名</th>
                           <th>药品受委托加工数量</th>
                           <th>药品加工委托方名称</th>
                           <th>药品加工受托方名称</th>
                           <th>药品加工期限</th>
                           <th>药品委托加工备案日期</th>
	                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>
<div class="tabbale iframe-wrap" data-component="tab">
    <div class="form-panel">
        <div class="title">医疗器械制造</div>
        <form id="bzxr_form" class="form-box mb5">
            <div class="form-list pdr8">
                <div class="form-item clearfix">
                    <div class="col-6">
                        <label class="item-name col-5">企业名称：</label>
                        <div class="col-7">
                            <div class="ipt-box col-12">
                                <input type="text" class="ipt-txt" name="bzxr"
                                       placeholder="可输入名称关键词查询" />
                            </div>
                        </div>
                    </div>
                    <div class="col-6">
                        <label class="item-name col-5">来源部门：</label>
                        <div class="col-7">
                            <div class="ipt-box col-11">
                                <input type="text" class="ipt-txt" name="importFrom" placeholder="可输入名称关键词查询"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="center mt10">
                <input type="button" id="bzxr_search" value="查询" class="btn mr20">
                <input type="reset" id="bzxr_cancel" value="重置" class="btn mr20">
            </div>
        </form>
    </div>
</div>
<div class="tab-content mb20 mt10">
    <div class="tab-panel tab-panel-show">
        <div id="bzxr_tab" class="">
            <div class="table-out">
                <table id="bzxr_table" border="0" cellspacing="0" cellpadding="0"
                       class="table-row display nowrap">
                    <thead style="white-space:nowarp;">
	                    <tr>
                            <th>序号</th>
                            <th>生产许可/备案编号（委托方）</th>
                            <th>委托生产产品名称</th>
                            <th>产品注册号/备案号</th>
                            <th>委托期限</th>
                            <th>备案日期</th>
                            <th>备案部门</th>
	                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>
<script src="/js/search/ProduceSearch/producesearch.js"></script>
</body>
</html>
