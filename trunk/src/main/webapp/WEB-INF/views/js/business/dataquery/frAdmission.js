require(['component/iframeLayer', 'component/dataTable', 'common/util',
      'common/http', 'handlebars', 'jquery', 'jquery.serialize', 'laydate',
      'jquery.validate', 'pagination'],
    function (layer, dataTable, util, http, handlebars) {
      var params = $("#frwybs").val();
      var table_xzxk, table_xzba, table_zzxx, table_ryxx;

      init();
      /**
       * 初始化函数集合
       */
      function init() {
        _bind();
        init_admission();
      }

      function init_admission() {
        if ((table_xzxk + '') == 'undefined') {
          initDataTable_xzxk();
        }
        ;
        if ((table_xzba + '') == 'undefined') {
          initDataTable_xzba();
        }
        ;
        if ((table_zzxx + '') == 'undefined') {
          initDataTable_zzxx();
        }
        ;
        if ((table_ryxx + '') == 'undefined') {
          initDataTable_ryxx();
        }
        ;

      }

      function initAddflex(yrinfo_li) {
        $("#" + yrinfo_li).parent().next().hide();
        $("#" + yrinfo_li).attr("class", "flex-icon on")
      }

      function initDataTable_xzxk() {
        table_xzxk = dataTable.load({
          el: '#table_xzxk',
          showIndex: true,
          scrollX: true,
          lengthMenu: [5, 10, 20, 50],
          ajax: {
            url: '/data/admission/xzxk',
            data: function (d) {
              d.params = {"frwybs": params}
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
width:20,
            className:"center"
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
          columnDefs: []
        });
        table_xzxk.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#table_xzxk_wrapper .bottom').hide();
          } else {
            $('#table_xzxk_wrapper .bottom').show();
          }
          if (json.recordsTotal == 0) {
            initAddflex("table_xzxk_icon");
          }
        })
      }

      function initDataTable_xzba() {
        table_xzba = dataTable.load({
          el: '#table_xzba',
          showIndex: true,
          scrollX: true,
          lengthMenu: [5, 10, 20, 50],
          ajax: {
            url: '/data/admission/xzba',
            data: function (d) {
              d.params = {"frwybs": params}
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
width:20,
            className:"center"
          }, {
            data: "bamc"
          }, {
            data: "banr"
          }, {
            data: "bajg"
          }, {
            data: "barq"
          },  {
            data: "baqs"
          }, {
            data: "bajz"
          }],
          columnDefs: []
        });
        table_xzba.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#table_xzba_wrapper .bottom').hide();
          } else {
            $('#table_xzba_wrapper .bottom').show();
          }
          if (json.recordsTotal == 0) {
            initAddflex("table_xzba_icon");
          }
        })
      }

      function initDataTable_zzxx() {
        table_zzxx = dataTable.load({
          el: '#table_zzxx',
          showIndex: true,
          scrollX: true,
          lengthMenu: [5, 10, 20, 50],
          ajax: {
            url: '/data/admission/zzxx',
            data: function (d) {
              d.params = {"frwybs": params}
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
width:20,
            className:"center"
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
          columnDefs: []
        });
        table_zzxx.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#table_zzxx_wrapper .bottom').hide();
          } else {
            $('#table_zzxx_wrapper .bottom').show();
          }
          if (json.recordsTotal == 0) {
            initAddflex("table_zzxx_icon");
          }
        })
      }

      function initDataTable_ryxx() {
        table_ryxx = dataTable.load({
          el: '#table_ryxx',
          showIndex: true,
          scrollX: true,
          lengthMenu: [5, 10, 20, 50],
          ajax: {
            url: '/data/admission/ryxx',
            data: function (d) {
              d.params = {"frwybs": params}
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
width:20,
            className:"center"
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
          }],
          columnDefs: []
        });
        table_ryxx.on('init.dt', function (e, settings, json) {
          if (json.recordsTotal <= 5) {
            $('#table_ryxx_wrapper .bottom').hide();
          } else {
            $('#table_ryxx_wrapper .bottom').show();
          }
          if (json.recordsTotal == 0) {
            initAddflex("table_ryxx_icon");
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
              $(this).attr("class", "flex-icon on")
            }
          },
          {
            el: '.on',
            event: 'click',
            handler: function () {
              // 显示table
              $(this).parent().next().show();
              $(this).attr("class", "flex-icon");
            }
          }
        ])
      }
    });
