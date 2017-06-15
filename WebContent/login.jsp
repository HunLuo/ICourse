<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录</title>
<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
<link rel="stylesheet" href="css/login4.css" />
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script src="js/cloud.js"></script>
<script src="js/logintype.js"></script>
<script src="js/loginverify.js"></script>
</head>
<body class="beg-login-bg">
	<div id="cloud1" class="cloud"></div>
	<div id="cloud2" class="cloud"></div>
	<div class="beg-login-box">
		<header>
			<h1>
				社团选课系统登录<sup>2017</sup>
			</h1>
		</header>
		<div class="beg-login-main">
			<form action="login.do" class="layui-form" method="post">
				<div class="layui-form-item">
					<div id="red1" class="r">
						<label class="beg-login-icon"> <i class="layui-icon">&#xe612;</i>
						</label> <input type="text" name="userName" lay-verify="userName"
							id="username" autocomplete="off" placeholder="这里输入登录名"
							class="layui-input"">
					</div>
				</div>
				<div class="layui-form-item">
					<div id="red2" class="r">
						<label class="beg-login-icon"> <i class="layui-icon">&#xe642;</i>
						</label> <input type="password" name="password" lay-verify="password"
							id="password" autocomplete="off" placeholder="这里输入密码"
							class="layui-input">
					</div>
				</div>
				<div class="layui-input-block">
                <input name="sex" value="0" title="学生"  type="radio">
                <input name="sex" value="1" title="老师" type="radio">
                <input name="sex" value="2" title="管理员"  type="radio">
					<!-- <input type="checkbox" name="tabel_style" lay-check-type="radio"
						title="学生"> <input type="checkbox" name="tabel_style"
						lay-check-type="radio" title="老师" checked="checked"> <input
						type="checkbox" name="tabel_style" lay-check-type="radio"
						title="管理员"> -->
				</div>

				<br />
				<div class="layui-form-item">
					<div class="beg-pull-left beg-login-remember">
						<label>记住帐号？</label> <input type="checkbox" name="rememberMe"
							value="true" lay-skin="switch" checked title="记住帐号">
					</div>
					<div class="button1">
						<button id="submit" class="layui-btn layui-btn-normal layui-btn-radius" type="button"
							>
							<i class="layui-icon">&#xe613;&nbsp;</i> 登录
						</button>
					</div>
				</div>
			</form>
		</div>
		<footer> 天津大学仁爱学院2017@版权所有 </footer>
	</div>
	<script type="text/javascript" src="plugins/layui/layui.js"></script>
	<script>
		$(document).ready(function(){
			$("#submit").bind("click",submit);
		}
		);
		function submit(){
			$.ajax({
				url:"",
				data:{
					'username':$('#username').val(),
					
					'password':$('#password').val()
				},
				success:function(){
				}
				
			})
		}
		
	</script>
</body>
</html>