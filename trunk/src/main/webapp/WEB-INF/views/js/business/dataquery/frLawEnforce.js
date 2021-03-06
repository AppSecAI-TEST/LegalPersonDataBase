require(['component/iframeLayer', 'component/dataTable', 'common/util', 'common/http', 'handlebars', 'jquery','jquery.serialize','laydate','jquery.validate','pagination'], function (layer, dataTable, util, http,handlebars) {
	var params = $("#produce-form").serializeObject();
	var table_xzcf,table_xzqz,table_zdjg,table_jdcc,table_bhgjl,table_jgnj,table_qynb,table_ldbz,
	table_wxdt,table_jcjk,table_qdjl,table_sgxx,table_yhjl,table_fljg;
	
    init();
    /**
     * 初始化函数集合
     */
    function init() {
        _bind();
        init_lawenfoce();
    }
    
    function init_lawenfoce(){
    	if((table_xzcf+'')=='undefined'){
    		initDataTable_xzcf();
    	}
    	if((table_xzqz+'')=='undefined'){
    		initDataTable_xzqz();
    	}
    	if((table_zdjg+'')=='undefined'){
    		initDataTable_zdjg();
    	}
    	if((table_jdcc+'')=='undefined'){
    		initDataTable_jdcc();
    	}
    	if((table_bhgjl+'')=='undefined'){
    		initDataTable_bhgjl();
    	}
    	if((table_jgnj+'')=='undefined'){
    		initDataTable_jgnj();
    	}
    	if((table_qynb+'')=='undefined'){
    		initDataTable_qynb();
    	}
    	if((table_ldbz+'')=='undefined'){
    		initDataTable_ldbz();
    	}
    	if((table_wxdt+'')=='undefined'){
    		initDataTable_wxdt();
    	}
    	if((table_jcjk+'')=='undefined'){
    		initDataTable_jcjk();
    	}
    	if((table_qdjl+'')=='undefined'){
    		initDataTable_qdjl();
    	}
    	if((table_sgxx+'')=='undefined'){
    		initDataTable_sgxx();
    	}
    	if((table_yhjl+'')=='undefined'){
    		initDataTable_yhjl();
    	}
    	if((table_fljg+'')=='undefined'){
    		initDataTable_fljg();
    	}
    }
    function initAddflex(yrinfo_li){ 
    	 $("#"+yrinfo_li).parent().next().hide();
         $("#"+yrinfo_li).attr("class","flex-icon on")
   }
    
  //行政处罚信息
    function initDataTable_xzcf() {
    	table_xzcf = dataTable.load({
		el : '#table_xzcf',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/xzcfDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
		    {data:'dwmc'},
			{data:'xzcfZfbm'},
			{data:'xzcfAm'},
			{data:'xzcfDxlb'},
			{data:'xzcfQlsx'},
			{data:'xzcfRq'},
			{data:'xzcfCxrq'},
			{data:'xzcfCxsm'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_xzcf.on('xhr.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_xzcf_wrapper .bottom').hide();
    		}else{
    			$('#table_xzcf_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_xzcf_icon");
    		}
        })
	}
  //行政强制信息
    function initDataTable_xzqz() {
    	table_xzqz = dataTable.load({
		el : '#table_xzqz',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/xzqzDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
		    {data:'frwybs'},
			{data:'dwmc'},
			{data:'xzqzLscsrq'},
			{data:'xzqzJcrq'},
			{data:'xzqzZxwh'},
			{data:'xzqzZxnr'},
			{data:'xzqzZxrq'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_xzqz.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_xzqz_wrapper .bottom').hide();
    		}else{
    			$('#table_xzqz_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_xzqz_icon");
    		}
        })
	}
  //重点监管信息
    function initDataTable_zdjg() {
    	table_zdjg = dataTable.load({
		el : '#table_zdjg',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/zdjgDetail',
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dwmc'},
			{data:'lrzdjgyy'},
			{data:'jgnr'},
			{data:'lrsj'},
			{data:'jgjg'},
			{data:'cxsj'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_zdjg.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_zdjg_wrapper .bottom').hide();
    		}else{
    			$('#table_zdjg_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_zdjg_icon");
    		}
        })
	}
  //监督抽查信息
    function initDataTable_jdcc() {
    	table_jdcc = dataTable.load({
		el : '#table_jdcc',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/jdccDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'bccdw'},
			{data:'ccchxmmc'},
			{data:'jybgrq'},
			{data:'datasrdep'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_jdcc.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_jdcc_wrapper .bottom').hide();
    		}else{
    			$('table_jdcc_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_jdcc_icon");
    		}
        })
	}
  //不合格记录信息
    function initDataTable_bhgjl() {
    	table_bhgjl = dataTable.load({
		el : '#table_bhgjl',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/badRecordDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'cpscdwwybs'},
			{data:'bccspmc'},
			{data:'bccypmc'},
			{data:'jyjl'},
			{data:'ccrq'},
			{data:'jcrwxddw'},
			{data:'bhgchxmmc'},
			{data:'bhgjljybgrq'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_bhgjl.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_bhgjl_wrapper .bottom').hide();
    		}else{
    			$('table_bhgjl_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_bhgjl_icon");
    		}
        })
	}
  //机构年检信息
    function initDataTable_jgnj() {
    	table_jgnj = dataTable.load({
		el : '#table_jgnj',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/jgnjDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dwmc'},
			{data:'njnd'},
			{data:'njbg'},
			{data:'pgqk'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_jgnj.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_jgnj_wrapper .bottom').hide();
    		}else{
    			$('table_jgnj_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_jgnj_icon");
    		}
        })
	}
  //企业年报信息
    function initDataTable_qynb() {
    	table_qynb = dataTable.load({
		el : '#table_qynb',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/qynbDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'qywybs'},
			{data:'qymc'},
			{data:'nbnd'},
			{data:'ndbgrq'},
			{data:'ndbgzt'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_qynb.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_qynb_wrapper .bottom').hide();
    		}else{
    			$('table_qynb_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_qynb_icon");
    		}
        })
	}
  //劳动保障书面审查信息
    function initDataTable_ldbz() {
    	table_ldbz = dataTable.load({
		el : '#table_ldbz',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/ndsmscDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dsfrmc'},
			{data:'smscnd'},
			{data:'pddj'},
			{data:'datasrdep'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_ldbz.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_ldbz_wrapper .bottom').hide();
    		}else{
    			$('table_ldbz_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_ldbz_icon");
    		}
        })
	}
    //无线电台（站）年检信息
    function initDataTable_wxdt() {
    	table_wxdt = dataTable.load({
		el : '#table_wxdt',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/wxdtDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dwmc'},
			{data:'datasrdep'},
			{data:'wxdznjnd'},
			{data:'njjg'}
		],
		columnDefs : [
		              
				 ]
	  });
    	table_wxdt.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_wxdt_wrapper .bottom').hide();
    		}else{
    			$('table_wxdt_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_wxdt_icon");
    		}
        })
	}
    //监测监控信息
    function initDataTable_jcjk() {
    	table_jcjk = dataTable.load({
		el : '#table_jcjk',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/jcjkDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dwmc'},
			{data:'zdmc'},
			{data:'jcsj'},
			{data:'jczb'},
			{data:'jcjg'},
			{data:'dbqk'}
			
		],
		columnDefs : [
		              
				 ]
	  });
    	table_jcjk.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_jcjk_wrapper .bottom').hide();
    		}else{
    			$('table_jcjk_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_jcjk_icon");
    		}
        })
	}
    //窃电记录信息
    function initDataTable_qdjl() {
    	table_qdjl = dataTable.load({
		el : '#table_qdjl',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/qdjlDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'ydhm'},
			{data:'yddz'},
			{data:'qdl'},
			{data:'qdsd'},
			{data:'qdze'},
			{data:'datasrdep'}
			
		],
		columnDefs : [
		              
				 ]
	  });
    	table_qdjl.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_qdjl_wrapper .bottom').hide();
    		}else{
    			$('table_qdjl_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_qdjl_icon");
    		}
        })
	}
    //事故信息
    function initDataTable_sgxx() {
    	table_sgxx = dataTable.load({
		el : '#table_sgxx',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/sgxxDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dwmc'},
			{data:'sgdd'},
			{data:'sglx'},
			{data:'sgyy'},
			{data:'sgfssj'},
			{data:'swrs'},
			{data:'zsrs'},
			{data:'ccss'},
			{data:'sgjyqk'}
			
		],
		columnDefs : [
		              
				 ]
	  });
    	table_sgxx.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_sgxx_wrapper .bottom').hide();
    		}else{
    			$('table_sgxx_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_sgxx_icon");
    		}
        })
	}
    //隐患信息
    function initDataTable_yhjl() {
    	table_yhjl = dataTable.load({
		el : '#table_yhjl',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/yhjlDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dwmc'},
			{data:'rdsj'},
			{data:'rdyj'},
			{data:'rdjg'},
			{data:'xasj'},
			{data:'czzdaqyhnr'}
			
		],
		columnDefs : [
		              
				 ]
	  });
    	table_yhjl.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_yhjl_wrapper .bottom').hide();
    		}else{
    			$('table_yhjl_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_yhjl_icon");
    		}
        })
	}
  //分类监管信息
    function initDataTable_fljg() {
    	table_fljg = dataTable.load({
		el : '#table_fljg',
		showIndex: true,
		scrollX: true,
		lengthMenu: [ 5, 10, 20, 50],
		ajax : {
			url : '/data/lowEnforeDetail/fljgDetail' ,
			data :function(d){
				d.params = params;
			}
		},
		columns : [
		    {data:null,defaultContent:1,className:'center'},
			{data:'frwybs'},
			{data:'dwmc'},
			{data:'pjyj'},
			{data:'pjwh'},
			{data:'pjnd'},
			{data:'pjjg'},
			{data:'pjnr'}
			
		],
		columnDefs : [
		              
				 ]
	  });
    	table_fljg.on('init.dt',function(e,settings,json,xhr){
    		if(json.recordsTotal <= 5){
    			$('#table_fljg_wrapper .bottom').hide();
    		}else{
    			$('table_fljg_wrapper .bottom').show();
    		}
    		if(json.recordsTotal == 0){
    			initAddflex("table_fljg_icon");
    		}
        })
	}
    /**
     * 事件绑定
     * @private
     */
    function _bind() {
        util.bindEvents([
            {
                el: '.flex-icon',
                event: 'click',
                handler: function () {
                    // 隐藏table
                    $(this).parent().next().hide();
                    $(this).attr("class","flex-icon on")
                }
            },
            {
                el: '.on',
                event: 'click',
                handler: function () {
                    // 显示table
                    $(this).parent().next().show();
                    $(this).attr("class","flex-icon");
                }
            }
        ])
    }
});
