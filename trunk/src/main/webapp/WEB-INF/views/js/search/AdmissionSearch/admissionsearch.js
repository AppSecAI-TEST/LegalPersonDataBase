require(['component/iframeLayer', 'component/dataTable', 'common/util',
      'common/http', 'common/busUtil', 'handlebars', 'jquery', 'jquery.serialize',
      'laydate', 'common/validateRules', 'common/ajaxfileupload'],
    function (layer, dataTable, util, http, busUtil, handlebars) {

      var entTable1, entTable2, entTable3, entTable4;
      init();

      function init() {
        bind();
      }

      function initDataTable1() {
        entTable1 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table1',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch1.json',
            data: function (d) {
              d.params = $("#search_form1").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "xkzsbh"
          }, {
            data: "xknr"
          }, {
            data: "xkjg"
          }, {
            data: "xkrq"
          }, {
            data: "xkzt"
          }, {
            data: "xkqs"
          }, {
            data: "xkjz"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc1' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable2() {
        entTable2 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table2',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch2.json',
            data: function (d) {
              d.params = $("#search_form2").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "bamc"
          }, {
            data: "banr"
          }, {
            data: "bajg"
          }, {
            data: "barq"
          }, {
            data: "bazt"
          }, {
            data: "baqs"
          }, {
            data: "bajz"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc2' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable3() {
        entTable3 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table3',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch3.json',
            data: function (d) {
              d.params = $("#search_form3").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "zzlb"
          }, {
            data: "zzmc"
          }, {
            data: "zzdj"
          }, {
            data: "zzjg"
          }, {
            data: "zzrq"
          }, {
          data: "zzzt"
        }, {
          data: "zzqs"
        }, {
          data: "zzjz"
        }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc3' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable4() {
        entTable4 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table4',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/admissionsearch4.json',
            data: function (d) {
              d.params = $("#search_form4").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
          data: "rylb"
        }, {
          data: "rymc"
        }, {
          data: "ryjldx"
        }, {
          data: "ryrq"
        }, {
          data: "ryqs"
        }, {
          data: "ryjz"
        }, {
          data: "ryjg"
        }, {
          data: "rynd"
        }, {
          data: "rynr"
        }, {
          data: "ryzt"
        }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc4' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }



      function bind() {
        util.bindEvents([{
          el: '#search1',
          event: 'click',
          handler: function () {
            var tr = $("#search_table1 tbody tr:first").text();
            if (tr == "" || tr == null) {
              initDataTable1();
            } else {
              entTable1.ajax.reload();
            }
          }
        },
          {
            el: '#search2',
            event: 'click',
            handler: function () {
              var tr = $("#search_table2 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable2();
              } else {
                entTable2.ajax.reload();
              }
            }
          },
          {
            el: '#search3',
            event: 'click',
            handler: function () {
              var tr = $("#search_table3 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable3();
              } else {
                entTable3.ajax.reload();
              }
            }
          },
          {
            el: '#search4',
            event: 'click',
            handler: function () {
              var tr = $("#search_table4 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable4();
              } else {
                entTable4.ajax.reload();
              }
            }
          },
					{
            el: '.frmc1',
            event: 'click',
            handler: function () {
              var data = entTable1.row($(this).closest('td')).data();
              window.open('/data/frdetail/admission/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc2',
            event: 'click',
            handler: function () {
              var data = entTable2.row($(this).closest('td')).data();
              window.open('/data/frdetail/admission/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc3',
            event: 'click',
            handler: function () {
              var data = entTable3.row($(this).closest('td')).data();
              window.open('/data/frdetail/admission/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc4',
            event: 'click',
            handler: function () {
              var data = entTable4.row($(this).closest('td')).data();
              window.open('/data/frdetail/admission/' + data.frwybs, '_blank');
            }
          }
        ])
      }
    });