$(document).ready(function() {
layui.use(['layer', 'form'], function() {
				var layer = layui.layer,
					$ = layui.jquery,
					form = layui.form();
					
				
			});
			
		    layui.use(['form'], function(){
                var form = layui.form();
                form.on('checkbox', function (data) {
                var name = data.elem.getAttribute("name");
                   if (data.elem.getAttribute("lay-check-type") === "radio" && name) {
                var domArr = document.getElementsByName(name);
                var checked = false;
                for (var i = 0; i < domArr.length; i++) {
                    if (domArr[i] !== data.elem && domArr[i].getAttribute("lay-check-type") === "radio") {
                        if (data.elem.checked) {
                            domArr[i].checked = false;
                        } else if (domArr[i].checked) {
                            checked = true;
                        }
                    }
                }
                data.elem.checked = !checked ? true : data.elem.checked;
                form.render('checkbox');
            }
        });
    })
		    });