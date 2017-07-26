require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 'common/busUtil', 'handlebars', 'jquery','jquery.serialize','laydate','common/validateRules', 'common/ajaxfileupload' ], function(layer, dataTable, util, http,busUtil,handlebars) {

	var entTable;
	init();

	function init() {
		bind();
	}
	

	function initDataTable() {
		entTable = dataTable.load({
			// 需要初始化dataTable的dom元素
			el : '#search_table',
			showIndex : true,
			scrollX : true,
			aLengthMenu : [ 5, 10, 20, 50, 100 ],
			ajax : {
				url : '/data/search/producesearch.json',
				data : function(d) {
					d.params = $("#search_form").serializeObject();
				}
			},
			columns : [ {
				data : null,
				defaultContent : 1,
			}, {
				data : "frmc"
			}, {
				data : "tyxydm"
			}, {
				data : "fddbr"
			}, {
				data : "djrq"
			}, {
				data : "hydm"
			}, {
				data : "cxzt"
			} ],
			columnDefs : [{
				  targets : 1,
	           	  render : function(data, type, row, meta){
	           		  return "<a href='javascript:void(0)' class='frmc' priPID='"+row.frwybs+"'>" + row.frmc + "</a>";
	           	  }
			}]
		});
	}
	function bind() {
		util.bindEvents([ {
			el : '#search',
			event : 'click',
			handler : function() {
				var tr = $("#search_table tbody tr:first").text();
				if(tr=="" || tr==null ){
					initDataTable();
				}else{
				entTable.ajax.reload();
			}}
		},{
        	el:'#reset',
        	event:'click',
        	handler:function(){
    			$("#Name").val("");
    			$("#UnitedID").val("");
    			$("#Range").val("");
    			$("#MediName").val("");
    			$("#MediPrmiID").val("");
    			$("#PrintName").val("");
    			$("#TransName").val("");
    			$("#ImportName").val("");
    			$("#InvestName").val("");
    			$("#DevName").val("");
    			$("#GovInvestName").val("");
    			$("#SciProName").val("");
    			$("#CharityName").val("");
    			$("#StockID").val("");
    			$("#ConstrucName").val("");
        	}
        }, {
        	el: '.frmc',
            event: 'click',
            handler: function () {        	
                var data = entTable.row($(this).closest('td')).data();   
                window.open('/data/frdetail/produce/' + data.tyxydm,'_blank');
            }
        }
	  ])
	}
});