<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>行政执法查询</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="renderer" content="webkit">
<meta charset="utf-8">

<link rel="stylesheet"
	href="<c:url value='/css/vendor/dataTables.bootstrap.min.css'/>">
<link rel="stylesheet" href="<c:url value='/css/credit/credit.css'/>">
<link rel="stylesheet" href="/css/style.css">
<script src="/js/lib/laydate/laydate.js" type="text/javascript"
	charset="utf-8"></script>
<script src="/js/lib/require.js"></script>
<script src="/js/config.js"></script>
</head>
<body style="background-color: #f4f4f4">
<div class="iframe-wrap">
    <div class="form-panel mb10">
        <form id="search_form" class="form-box clearfix">
        <div class="form-list">
                    
                </div>
                <div class="form-list">
            	<div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right" >重点监管内容：</label>
                        <div class="col-6">
                            <input type="text" name="Surveillance" id="Surveillance" class="form-control"
                                   value="${Surveillance}" placeholder="请输入重点监管内容">
                        </div>
                    </div>
                      <div class="col-4">
                        <label class="col-6 item-name text-right">抽查测绘项目名称：</label>
                        <div class="col-6"><input type="text" name="RandomTest" id="RandomTest" class="form-control"
                                   value="${RandomTest}" placeholder="请输入统抽查测绘项目名称">
                            </div>
                        </div>
                        <div class="col-4">
                        <label class="col-5 item-name text-right">被抽查食品名称：</label>
                        <div class="col-6"><input type="text" name="Food" id="Food" class="form-control"
                                   value="${Food}" placeholder="请输入被抽查食品名称">
                            </div>
                        </div>
                    </div>
                    
                </div>
                
                <div class="form-list">
            	<div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right" >被抽查药品名称：</label>
                        <div class="col-6">
                            <input type="text" name="Medicine" id="Medicine" class="form-control"
                                   value="${Medicine}" placeholder="请输入被抽查药品名称">
                        </div>
                    </div>
                      <div class="col-4">
                        <label class="col-6 item-name text-right">劳动保障评定等级：</label>
                        <div class="col-6"><input type="text" name="Rank" id="Rank" class="form-control"
                                   value="${Rank}" placeholder="请输入劳动保障评定等级">
                            </div>
                        </div>
                        <div class="col-4">
                        <label class="col-5 item-name text-right">检测站点名称：</label>
                        <div class="col-6"><input type="text" name="Station" id="Station" class="form-control"
                                   value="${Station}" placeholder="请输入检测站点名称">
                            </div>
                        </div>
                    </div>
                    
                </div>
                
                <div class="form-list">
            	<div class="form-item clearfix">
                    <div class="col-4">
                        <label class="col-6 item-name text-right" >用电户名：</label>
                        <div class="col-6">
                            <input type="text" name="Electro" id="Electro" class="form-control"
                                   value="${Electro}" placeholder="请输入用电户名">
                        </div>
                    </div>
                      <div class="col-4">
                        <label class="col-6 item-name text-right">列入经营异常名录原因：</label>
                        <div class="col-6"><input type="text" name="Abnormal" id="Abnormal" class="form-control"
                                   value="${Abnormal}" placeholder="请输入列入经营异常名录原因">
                            </div>
                        </div>
                        <div class="col-4">
                        <label class="col-5 item-name text-right">重大安全隐患内容：</label>
                        <div class="col-6"><input type="text" name="Danger" id="Danger" class="form-control"
                                   value="${Danger}" placeholder="请输入重大安全隐患内容">
                            </div>
                        </div>
                    </div>
                    <div class="hx-searchForm-but center">
                    <input type="button" value="查询" class="btn mr20" id="search" >
                    <input type="reset" value="重置" class="btn" id="reset">
                </div>
                </div>
                
        </form>
            </div>
            
            <div class="form-panel pd15">
			<table id="search_table" class="table-row nowrap" width="100%">
				<thead>
					<tr>
						<th>序号</th>
						<th>法人名称</th>
                		<th>法人唯一标识</th>
                		<th>法定代表人</th>
                		<th>成立日期</th>
                		<th>行业</th>
                		<th>存续状态</th>
					</tr>
				</thead>
			</table>
		</div>
    </div>
<script src="/js/search/LawEnforceSearch/lawenforcesearch.js"></script>
</body>
</html>
