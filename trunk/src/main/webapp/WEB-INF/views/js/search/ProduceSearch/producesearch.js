require(['layer1',
         'component/dataTable',
         'common/util',
         'common/http',
         'jquery',
         'jquery.serialize',
         'handlebars',
         'jquery','laydate'], function (layer, dataTable, util, http, handlebars) {
	
	var hxyp_table,zxaj_table,hxyp_flag=0,zxaj_flag=0;
	//var hxyp_Form = $("#hxyp_form").serializeObject();
	init();
	
	function init(){
		//initTableFywlxsxcpws();
		//initTableFyzxaj();
		//initTableFydsrjbxx();
		//initTableFyslajxx();
		bind();
	}

	function initTableHxyp(){
		hxyp_table = dataTable.load({
			el:'#hxyp_table',
			showIndex:true,
			lengthMenu:[5,10,20,50],
			ajax:{
				url:'/data/search/getHxypMsg',
				data:function(d){
					d.params=$("#hxyp_form").serializeObject();
				}
			},
			columns:[{data:null,defaultContent:1,className:'center'},
				{data:'wtjgtym',className:'center',width:"150px;"},
				{data:'ypswtjgsl',className:'center',width:"100px;"},
				{data:'ypjgwtfmc',className:'center',width:"100px;"},
				{data:'ypjgstfmc',className:'center',width:"100px;"},
				{data:'ypjgqx',className:'center',width:"50px;"},
				{data:'ypwtjgbarq',className:'center',width:"100px;"}
			],
			columnDefs:[
				/*{
					targets:3,
					render:function(data,type,row,meta){
						return "<a href='javascript:void(0);' class='look' corpid='"+row.encodeCorpid+"'>"+row.bZXR+"</a>";
					}
				},{
				targets:6,
				render:function(data,type,row,meta){
					return row.zXBD+"元";
				}
			},{
				targets:8,
				render:function(data,type,row,meta){
					var index = row.iMPORT_FROM.substring(6).indexOf("_");
					return row.iMPORT_FROM.substring(6,index+6);
				}
			}*/]
		})
		hxyp_table.on('xhr.dt',function(e,settings,json,xhr){
			if(json.recordsTotal <= 5){$('#hxyp_table .dataTables_wrapper .bottom').hide();}else{$('#hxyp_table .dataTables_wrapper .bottom').show();}
		})
	}

	

	function bind(){
		util.bindEvents([{
			el:'#hxyp_search',
			event:'click',
			handler:function(){
				if(hxyp_flag==0){
					initTableHxyp();hxyp_flag = 1;
				}else{
					hxyp_table.ajax.reload();
				}
			}
		}/*,{
			el:'.look',
			event:'click',
			handler:function(){
				var corpid = $(this).attr('corpid');
				window.open("/admin/cx/crEntBaseInfo/details/"+corpid,"_blank")
			}
		}*/])
	}
})