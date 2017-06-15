$(document).ready(function() {
    $("#username").focus();     //让id为isbn的输入框获得焦点，然后直接扫码即可读取图书信息
    var last;
    
    //用户名非空验证
    $("#username").keyup(function(event){
    	var username = $("#username").val();
    	
        $this=$(this);
        last=event.timeStamp;
        //利用event的timeStamp来标记时间，这样每次的keyup事件都会修改last的值，注意last必需为全局变量
        setTimeout(function(){
            if(last-event.timeStamp==0){
              //如果时间差为0（也就是你停止输入1s之内都没有其它的keyup事件发生）则做你想要做的事
            	
            	var pattern ="";
            	if(username==pattern){
            		$(".layui-form-item #red1").removeClass("green");
					$(".layui-form-item #red1").addClass("red");
					layui.use('layer', function(){
						  var layer = layui.layer;
//						  layer.msg('该用户已存在', {icon: 5});
						  layer.tips('用户名不能为空','#username');
						}); 
            	}
            }
        },1200);
    });
    
    //密码非空
    $("#password").keyup(function(event){
    	var username = $("#username").val();
    	
        $this=$(this);
        last=event.timeStamp;
        //利用event的timeStamp来标记时间，这样每次的keyup事件都会修改last的值，注意last必需为全局变量
        setTimeout(function(){
            if(last-event.timeStamp==0){
              //如果时间差为0（也就是你停止输入1s之内都没有其它的keyup事件发生）则做你想要做的事
            	
            	var pattern ="";
            	if(username==pattern){
            		$(".layui-form-item #red1").removeClass("green");
					$(".layui-form-item #red1").addClass("red");
					layui.use('layer', function(){
						  var layer = layui.layer;
//						  layer.msg('该用户已存在', {icon: 5});
						  layer.tips('用户名不能为空','#username');
						}); 
            	}
            }
        },1200);
    });
    
    
    
    //用户名判断
    
    $("#password").keyup(function(event){
    	var password = $("#password").val();
    	
        $this=$(this);
        last=event.timeStamp;
        //利用event的timeStamp来标记时间，这样每次的keyup事件都会修改last的值，注意last必需为全局变量
        setTimeout(function(){
            if(last-event.timeStamp==0){
              //如果时间差为0（也就是你停止输入1s之内都没有其它的keyup事件发生）则做你想要做的事
            	
            	var pattern = /^[a-zA-Z]\w{5,17}$/;
            	if(pattern.test(password)){
            		$(".layui-form-item #red2").removeClass("red");
					$(".layui-form-item #red2").addClass("green");
					layui.use('layer', function(){
						  var layer = layui.layer;
//						  layer.msg('该用户已存在', {icon: 5});
						  layer.tips('该密码可以使用','#password');
						}); 
            	}else{
					$(".layui-form-item #red2").removeClass("green");
					$(".layui-form-item #red2").addClass("red");
					layui.use('layer', function(){
						  var layer = layui.layer;
//						  layer.msg('该用户已存在', {icon: 5});
						  layer.tips('以字母开头，长度在6~18之间，只能包含字母、数字和下划线','#password');
						});
					}
            	
            	
 
            }
        },1200);
    });
    
});
