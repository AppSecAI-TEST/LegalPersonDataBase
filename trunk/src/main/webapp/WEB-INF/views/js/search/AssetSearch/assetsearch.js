require(['component/iframeLayer', 'component/dataTable', 'common/util',
      'common/http', 'common/busUtil', 'handlebars', 'jquery', 'jquery.serialize',
      'laydate', 'common/validateRules', 'common/ajaxfileupload'],
    function (layer, dataTable, util, http, busUtil, handlebars) {

      var entTable1, entTable2, entTable3, entTable4, entTable5, entTable6;
      var entTable7, entTable8, entTable9, entTable10, entTable11, entTable12;
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
            url: '/data/search/assetsearch1.json',
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
            data: "zczb"
          }, {
            data: "carnum"
          }, {
            data: "housenum"
          }, {
            data: "tractornum"
          }, {
            data: "boatnum"
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
            url: '/data/search/assetsearch2.json',
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
            data: "gd"
          }, {
            data: "gdLx"
          }, {
            data: "rjcze"
          }, {
            data: "rjczbl"
          }, {
            data: "rjczrq"
          }, {
            data: "sjcze"
          }, {
            data: "sjczbl"
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
            url: '/data/search/assetsearch3.json',
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
            data: "gd"
          }, {
            data: "gqZre"
          }, {
            data: "gqQrqbl"
          }, {
            data: "gqQrhbl"
          }, {
            data: "gqZrrq"
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
            url: '/data/search/assetsearch4.json',
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
            data: "czCzr"
          }, {
            data: "czZqr"
          }, {
            data: "czSe"
          }, {
            data: "czDjrq"
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

      function initDataTable5() {
        entTable5 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table5',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch5.json',
            data: function (d) {
              d.params = $("#search_form5").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "djZxfy"
          }, {
            data: "djCdwh"
          }, {
            data: "djZxsx"
          }, {
            data: "djBzxr"
          }, {
            data: "djQxqs"
          }, {
            data: "djQxjz"
          }],
          columnDefs:[{
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc5' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable6() {
        entTable6 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table6',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch6.json',
            data: function (d) {
              d.params = $("#search_form6").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "fwsyqr"
          }, {
            data: "fwsyqdjsj"
          }, {
            data: "whfwcf"
          }, {
            data: "fwcfrq"
          }, {
            data: "sqfwcfdw"
          }, {
            data: "ztfwcf"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc6' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable7() {
        entTable7 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table7',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch7.json',
            data: function (d) {
              d.params = $("#search_form7").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "dwmc"
          }, {
            data: "dysfzx"
          }, {
            data: "dyw"
          }, {
            data: "dyrq"
          }, {
            data: "dyje"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc7' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable8() {
        entTable8 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table8',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch8.json',
            data: function (d) {
              d.params = $("#search_form8").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "syzmc"
          }, {
            data: "bqdjh"
          }, {
            data: "zpmc"
          }, {
            data: "zplb"
          }, {
            data: "bqdjrq"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc8' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable9() {
        entTable9 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table9',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch9.json',
            data: function (d) {
              d.params = $("#search_form9").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "syzmc"
          }, {
            data: "syqdjrq"
          }, {
            data: "qszt"
          }, {
            data: "syqnx"
          }, {
            data: "bzdy"
          }, {
            data: "bzcf"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc9' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable10() {
        entTable10 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table10',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch10.json',
            data: function (d) {
              d.params = $("#search_form10").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "syzmc"
          }, {
            data: "ckqzh"
          }, {
            data: "ckqksmc"
          }, {
            data: "nkcgm"
          }, {
            data: "yxqsrq"
          }, {
            data: "yxdqrq"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc10' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable11() {
        entTable11 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table11',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch11.json',
            data: function (d) {
              d.params = $("#search_form11").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "syzmc"
          }, {
            data: "xdm"
          }, {
            data: "slsyq"
          }, {
            data: "slzzq"
          }, {
            data: "dyfs"
          }, {
            data: "cfjg"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc11' priPID='"
                    + row.frwybs + "'>" + row.frmc + "</a>";
              }
            }]
        });
      }

      function initDataTable12() {
        entTable12 = dataTable.load({
          // 需要初始化dataTable的dom元素
          el: '#search_table12',
          showIndex: true,
          scrollX: true,
          aLengthMenu: [5, 10, 20, 50, 100],
          ajax: {
            url: '/data/search/assetsearch12.json',
            data: function (d) {
              d.params = $("#search_form12").serializeObject();
            }
          },
          columns: [{
            data: null,
            defaultContent: 1,
          }, {
            data: "frmc"
          }, {
            data: "dwmc"
          }, {
            data: "czhong"
          }, {
            data: "cll"
          }, {
            data: "spcsl"
          }, {
            data: "zcsl"
          }, {
            data: "mcsl"
          }, {
            data: "gcsl"
          }],
          columnDefs: [
            {
              targets: 1,
              render: function (data, type, row, meta) {
                return "<a href='javascript:void(0)' class='frmc12' priPID='"
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
            el: '#search5',
            event: 'click',
            handler: function () {
              var tr = $("#search_table5 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable5();
              } else {
                entTable5.ajax.reload();
              }
            }
          },
          {
            el: '#search6',
            event: 'click',
            handler: function () {
              var tr = $("#search_table6 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable6();
              } else {
                entTable6.ajax.reload();
              }
            }
          },
          {
            el: '#search7',
            event: 'click',
            handler: function () {
              var tr = $("#search_table7 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable7();
              } else {
                entTable7.ajax.reload();
              }
            }
          },
          {
            el: '#search8',
            event: 'click',
            handler: function () {
              var tr = $("#search_table8 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable8();
              } else {
                entTable8.ajax.reload();
              }
            }
          },
          {
            el: '#search9',
            event: 'click',
            handler: function () {
              var tr = $("#search_table9 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable9();
              } else {
                entTable9.ajax.reload();
              }
            }
          },
          {
            el: '#search10',
            event: 'click',
            handler: function () {
              var tr = $("#search_table10 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable10();
              } else {
                entTable10.ajax.reload();
              }
            }
          },
          {
            el: '#search11',
            event: 'click',
            handler: function () {
              var tr = $("#search_table11 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable11();
              } else {
                entTable11.ajax.reload();
              }
            }
          },
          {
            el: '#search12',
            event: 'click',
            handler: function () {
              var tr = $("#search_table12 tbody tr:first").text();
              if (tr == "" || tr == null) {
                initDataTable12();
              } else {
                entTable12.ajax.reload();
              }
            }
          }, {
            el: '.frmc1',
            event: 'click',
            handler: function () {
              var data = entTable1.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc2',
            event: 'click',
            handler: function () {
              var data = entTable2.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc3',
            event: 'click',
            handler: function () {
              var data = entTable3.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc4',
            event: 'click',
            handler: function () {
              var data = entTable4.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc5',
            event: 'click',
            handler: function () {
              var data = entTable5.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc6',
            event: 'click',
            handler: function () {
              var data = entTable6.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc7',
            event: 'click',
            handler: function () {
              var data = entTable7.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc8',
            event: 'click',
            handler: function () {
              var data = entTable8.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc9',
            event: 'click',
            handler: function () {
              var data = entTable9.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc10',
            event: 'click',
            handler: function () {
              var data = entTable10.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc11',
            event: 'click',
            handler: function () {
              var data = entTable11.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
          {
            el: '.frmc12',
            event: 'click',
            handler: function () {
              var data = entTable12.row($(this).closest('td')).data();
              window.open('/data/frdetail/zbyzc/' + data.frwybs, '_blank');
            }
          },
        ])
      }
    });